package com.bettrnation.client;

public enum NFLv3AdvancedMetricsPaths {
  ADVANCED_PLAYER_GAME_STATS(
      "/v3/nfl/advanced-metrics/{format}/AdvancedPlayerGameStats/{season}/{week}"),
  ADVANCED_PLAYER_GAME_STATS_BY_PLAYER_ID(
      "/v3/nfl/advanced-metrics/{format}/AdvancedPlayerGameStatsByPlayerID/{season}/{playerid}"),
  ADVANCED_PLAYER_INFO("/v3/nfl/advanced-metrics/{format}/AdvancedPlayerInfo/{playerid}"),
  ADVANCED_PLAYER_SEASON_STATS_BY_PLAYER_ID(
      "/v3/nfl/advanced-metrics/{format}/AdvancedPlayerSeasonStatsByPlayerID/{season}/{playerid}"),
  ADVANCED_PLAYER_SEASON_STATS_BY_TEAM(
      "/v3/nfl/advanced-metrics/{format}/AdvancedPlayerSeasonStats/{season}/{team}"),
  ADVANCED_PLAYERS("/v3/nfl/advanced-metrics/{format}/AdvancedPlayers");

  private final String path;

  NFLv3AdvancedMetricsPaths(final String path) {
    this.path = path;
  }

  public String path() {
    return path;
  }
}
