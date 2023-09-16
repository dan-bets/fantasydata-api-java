package com.bettrnation.client;

import java.lang.reflect.ParameterizedType;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.google.gson.reflect.TypeToken;

public abstract class BaseClient {
    private static final String API_KEY_HEADER = "Ocp-Apim-Subscription-Key";
    private String host;
    private String apiKey;
    private boolean https;
    private String encoding;
    private HttpClient client = HttpClient.newHttpClient();

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

    protected <T> T get(String apiCall, Class<T> clazz) throws URISyntaxException, IOException, InterruptedException {
        return get(apiCall, null, clazz);
    }

    protected <T> T get(String apiCall, Map<String, String> parameters, Class<T> clazz) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(getRequestUrl(apiCall, parameters)))
                .header(API_KEY_HEADER, apiKey)
                .timeout(Duration.of(10, ChronoUnit.SECONDS))
                .GET()
                .build();
        String response = client.send(request,
                HttpResponse.BodyHandlers.ofString(
                        Charset.forName(encoding.isEmpty() ? Charset.defaultCharset().name() : encoding)
                )).body();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.UpperCamelCaseStrategy.INSTANCE);
        return objectMapper.readValue(response, clazz);
    }

    private String getRequestUrl(String apiCall, Map<String, String> parameters) {
        String scheme = scheme();
        String url = scheme + "://" + host + "/" + apiCall.toLowerCase();

        if (parameters == null) {
            parameters = new HashMap<>();
        }

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            url = url.replace("{" + entry.getKey().toLowerCase() + "}",
                    entry.getValue().toLowerCase().trim());
        }

        return url;
    }



}

