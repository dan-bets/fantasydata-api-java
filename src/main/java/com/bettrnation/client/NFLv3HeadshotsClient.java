package com.bettrnation.client;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class NFLv3HeadshotsClient extends BaseClient {
  public NFLv3HeadshotsClient(String apiKey) {
    super(apiKey);
  }

  public NFLv3HeadshotsClient(UUID apiKey) {
    super(apiKey);
  }

  public CompletableFuture<Headshot[]> getHeadshotsAsync() throws URISyntaxException {
    Map<String, String> parameters = new HashMap<>();
    return getAsync(NFLv3HeadshotsPaths.PLAYER_HEADSHOTS.path(), parameters, Headshot[].class);
  }

  public Headshot[] getHeadshots()
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getHeadshotsAsync().get();
  }
}
