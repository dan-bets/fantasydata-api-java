package com.bettrnation.client;

public enum NFLv3OddsPaths {
  GET_LIVE_GAME_ODDS_BY_WEEK("/v3/nfl/odds/{format}/LiveGameOddsByWeek/{season}/{week}"),
  GET_LIVE_GAME_ODDS_LINE_MOVEMENT("/v3/nfl/odds/{format}/LiveGameOddsLineMovement/{scoreid}"),
  GET_PRE_GAME_ODDS_BY_WEEK("/v3/nfl/odds/{format}/GameOddsByWeek/{season}/{week}"),
  GET_PRE_GAME_ODDS_LINE_MOVEMENT("/v3/nfl/odds/{format}/GameOddsLineMovement/{scoreid}");

  private final String path;

  NFLv3OddsPaths(final String path) {
    this.path = path;
  }

  public String path() {
    return path;
  }
}
