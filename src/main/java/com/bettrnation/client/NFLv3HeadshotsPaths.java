package com.bettrnation.client;

public enum NFLv3HeadshotsPaths {
  PLAYER_HEADSHOTS("/v3/nfl/headshots/{format}/Headshots");

  private final String path;

  NFLv3HeadshotsPaths(final String path) {
    this.path = path;
  }

  public String path() {
    return path;
  }
}
