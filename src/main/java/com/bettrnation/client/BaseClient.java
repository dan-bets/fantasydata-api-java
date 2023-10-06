package com.bettrnation.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public abstract class BaseClient {
  private static final String API_KEY_HEADER = "Ocp-Apim-Subscription-Key";
  private final String host;
  private final String apiKey;
  private final boolean https;
  private final String encoding;
  private final HttpClient client = HttpClient.newHttpClient();
  private final UncheckedObjectMapper uncheckedObjectMapper = new UncheckedObjectMapper();

  private String scheme() {
    return https ? "https:" : "http";
  }

  public BaseClient(String apiKey) {
    host = "api.sportsdata.io";
    this.apiKey = apiKey.replace("-", "").toLowerCase();
    https = true;
    encoding = "UTF-8";
  }

  public BaseClient(UUID apiKey) {
    this(apiKey.toString());
  }

  protected <T> T get(String apiCall, Class<T> clazz)
      throws URISyntaxException, IOException, InterruptedException {
    return get(apiCall, null, clazz);
  }

  protected <T> T get(String apiCall, Map<String, String> parameters, Class<T> clazz)
      throws URISyntaxException, IOException, InterruptedException {
    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(new URI(getRequestUrl(apiCall, parameters)))
            .header(API_KEY_HEADER, apiKey)
            .timeout(Duration.of(10, ChronoUnit.SECONDS))
            .GET()
            .build();
    String response =
        client
            .send(
                request,
                HttpResponse.BodyHandlers.ofString(
                    Charset.forName(
                        encoding.isEmpty() ? Charset.defaultCharset().name() : encoding)))
            .body();

    return uncheckedObjectMapper.readValue(response);
  }

  protected <T> CompletableFuture<T> getAsync(
      String apiCall, Map<String, String> parameters, Class<T> clazz) throws URISyntaxException {
    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(new URI(getRequestUrl(apiCall, parameters)))
            .header(API_KEY_HEADER, apiKey)
            .timeout(Duration.of(10, ChronoUnit.SECONDS))
            .GET()
            .build();
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.setPropertyNamingStrategy(
        PropertyNamingStrategies.UpperCamelCaseStrategy.INSTANCE);
    return client
        .sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenApply(uncheckedObjectMapper::readValue);
  }

  private String getRequestUrl(String apiCall, Map<String, String> parameters) {
    String scheme = scheme();
    String url = scheme + "://" + host + "/" + apiCall.toLowerCase();

    if (parameters == null) {
      parameters = new HashMap<>();
    }

    for (Map.Entry<String, String> entry : parameters.entrySet()) {
      url =
          url.replace(
              "{" + entry.getKey().toLowerCase() + "}", entry.getValue().toLowerCase().trim());
    }

    return url;
  }
}
