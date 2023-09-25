package com.bettrnation.client;

import com.bettrnation.model.AdvancedPlayer;
import com.bettrnation.model.AdvancedPlayerGame;
import com.bettrnation.model.AdvancedPlayerSeason;
import com.bettrnation.model.PlayerInfo;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class NFLv3AdvancedMetrics extends BaseClient {
  public NFLv3AdvancedMetrics(String apiKey) {
    super(apiKey);
  }

  public NFLv3AdvancedMetrics(UUID apiKey) {
    super(apiKey);
  }

  /**
   * Get Advanced Player Game Stats Async
   *
   * @param season Year of the season and the season type. If no season type is provided, then the
   *     default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>
   *     2018POST</code>.
   * @param week Week of the season. Valid values are as follows: Preseason 0 to 4, Regular Season 1
   *     to 17, Postseason 1 to 4. Example: <code>1</code>
   * @return Completable future of AdvancedPlayerGame[]
   * @see AdvancedPlayerGame
   */
  public CompletableFuture<AdvancedPlayerGame[]> getAdvancedPlayerGameStatsAsync(
      String season, Integer week) throws URISyntaxException {
    Map<String, String> parameters = new HashMap<>();
    parameters.put("season", season);
    parameters.put("week", week.toString());
    return getAsync(
        NFLv3AdvancedMetricsPaths.ADVANCED_PLAYER_GAME_STATS.path(),
        parameters,
        AdvancedPlayerGame[].class);
  }

  /**
   * Get Advanced Player Game Stats
   *
   * @param season Year of the season and the season type. If no season type is provided, then the
   *     default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>
   *     2018POST</code>.
   * @param week Week of the season. Valid values are as follows: Preseason 0 to 4, Regular Season 1
   *     to 17, Postseason 1 to 4. Example: <code>1</code>
   * @return AdvancedPlayerGame[]
   * @see AdvancedPlayerGame
   */
  public AdvancedPlayerGame[] getAdvancedPlayerGameStats(String season, Integer week)
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getAdvancedPlayerGameStatsAsync(season, week).get();
  }

  /**
   * Get Advanced Player Game Stats Async
   *
   * @param season Year of the season and the season type. If no season type is provided, then the default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>2018POST</code>.
   * @param playerId Each NFL player has a unique ID assigned by FantasyData. Player IDs can be determined by pulling player related data. Example:<code>732</code>
   * @return CompletableFuture of AdvancedPlayerGame[]
   */
  public CompletableFuture<AdvancedPlayerGame[]> getAdvancedPlayerGameStatsByPlayerIdAsync(
      String season, Integer playerId) throws URISyntaxException {
    Map<String, String> parameters = new HashMap<>();
    parameters.put("season", season);
    parameters.put("playerid", playerId.toString());
    return getAsync(
        NFLv3AdvancedMetricsPaths.ADVANCED_PLAYER_GAME_STATS_BY_PLAYER_ID.path(),
        parameters,
        AdvancedPlayerGame[].class);
  }

  /**
   * Get Advanced Player Game Stats
   *
   * @param season Year of the season and the season type. If no season type is provided, then the default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>2018POST</code>.
   * @param playerId Each NFL player has a unique ID assigned by FantasyData. Player IDs can be determined by pulling player related data. Example:<code>732</code>
   * @return CompletableFuture of AdvancedPlayerGame[]
   * @throws ExecutionException http async error
   * @throws InterruptedException http async error
   */
  public AdvancedPlayerGame[] getAdvancedPlayerGameStatsByPlayerId(String season, Integer playerId)
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getAdvancedPlayerGameStatsByPlayerIdAsync(season, playerId).get();
  }

  /**
   * Get Advanced Player Info Async
   * @param playerId Each NFL player has a unique ID assigned by FantasyData. Player IDs can be determined by pulling player related data. Example:<code>732</code>.
   * @return CompletableFuture of AdvancedPlayer[]
   * @see AdvancedPlayer
   */
  public CompletableFuture<AdvancedPlayer[]> getAdvancedPlayerInfoAsync(Integer playerId)
      throws URISyntaxException {
    Map<String, String> parameters = new HashMap<>();
    parameters.put("playerid", playerId.toString());
    return getAsync(
        NFLv3AdvancedMetricsPaths.ADVANCED_PLAYER_INFO.path(), parameters, AdvancedPlayer[].class);
  }

  /**
   * Get Advanced Player Info
   * @param playerId Each NFL player has a unique ID assigned by FantasyData. Player IDs can be determined by pulling player related data. Example:<code>732</code>.
   * @return AdvancedPlayer[]
   * @see AdvancedPlayer
   */
  public AdvancedPlayer[] getAdvancedPlayerInfo(Integer playerId)
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getAdvancedPlayerInfoAsync(playerId).get();
  }

  /**
   * Get Advanced Player Season Stats by Player Async
   * @param season Year of the season and the season type. If no season type is provided, then the default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>2018POST</code>.
   * @param playerId Each NFL player has a unique ID assigned by FantasyData. Player IDs can be determined by pulling player related data. Example:<code>732</code>.
   * @return CompletableFuture of AdvancedPlayerSeason[]
   * @see AdvancedPlayerSeason[]
   */
  public CompletableFuture<AdvancedPlayerSeason[]> getAdvancedPlayerSeasonStatsByPlayerIdAsync(
      String season, Integer playerId) throws URISyntaxException {
    Map<String, String> parameters = new HashMap<>();
    parameters.put("season", season);
    parameters.put("playerid", playerId.toString());
    return getAsync(
        NFLv3AdvancedMetricsPaths.ADVANCED_PLAYER_SEASON_STATS_BY_PLAYER_ID.path(),
        parameters,
        AdvancedPlayerSeason[].class);
  }

  /**
   * Get Advanced Player Season Stats by Player Async
   * @param season Year of the season and the season type. If no season type is provided, then the default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>2018POST</code>.
   * @param playerId Each NFL player has a unique ID assigned by FantasyData. Player IDs can be determined by pulling player related data. Example:<code>732</code>.
   * @return AdvancedPlayerSeason[]
   * @see AdvancedPlayerSeason[]
   */
  public AdvancedPlayerSeason[] getAdvancedPlayerSeasonStatsByPlayerId(
      String season, Integer playerId)
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getAdvancedPlayerSeasonStatsByPlayerIdAsync(season, playerId).get();
  }

  /**
   * Get Advanced Player Season Stats by Team Async
   * @param season Year of the season and the season type. If no season type is provided, then the default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>2018POST</code>.
   * @param team Abbreviation of the team. Example: <code>WAS</code>.
   * @return CompletableFuture of AdvancedPlayerSeason[]
   * @see AdvancedPlayerSeason[]
   */
  public CompletableFuture<AdvancedPlayerSeason[]> getAdvancedPlayerSeasonStatsAsync(
      String season, String team) throws URISyntaxException {
    Map<String, String> parameters = new HashMap<>();
    parameters.put("season", season);
    parameters.put("team", team);
    return getAsync(
        NFLv3AdvancedMetricsPaths.ADVANCED_PLAYER_SEASON_STATS_BY_TEAM.path(),
        parameters,
        AdvancedPlayerSeason[].class);
  }

  /**
   * Get Advanced Player Season Stats by Team
   * @param season Year of the season and the season type. If no season type is provided, then the default is regular season. Examples: <code>2018REG</code>, <code>2018PRE</code>, <code>2018POST</code>.
   * @param team Abbreviation of the team. Example: <code>WAS</code>.
   * @return CompletableFuture of AdvancedPlayerSeason[]
   * @see AdvancedPlayerSeason[]
   */
  public AdvancedPlayerSeason[] getAdvancedPlayerSeasonStats(String season, String team)
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getAdvancedPlayerSeasonStatsAsync(season, team).get();
  }

  /**
   * Get Advanced Players Async
   * @return CompletableFuture of PlayerInfo[]
   * @see PlayerInfo[]
   */
  public CompletableFuture<PlayerInfo[]> getAdvancedPlayersAsync() throws URISyntaxException {
    return getAsync(
        NFLv3AdvancedMetricsPaths.ADVANCED_PLAYER_INFO.path(), new HashMap<>(), PlayerInfo[].class);
  }

  /**
   * Get Advanced Players
   * @return PlayerInfo[]
   * @see PlayerInfo
   */
  public PlayerInfo[] getAdvancedPlayers()
      throws URISyntaxException, ExecutionException, InterruptedException {
    return getAdvancedPlayersAsync().get();
  }
}
