package com.bettrnation.client;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class NFLv3OddsClient extends BaseClient {

    public NFLv3OddsClient(String apiKey) {
        super(apiKey);
    }

    public NFLv3OddsClient(UUID apiKey) {
        super(apiKey);
    }

    public CompletableFuture<GameInfo[]> getLiveGameOddsByWeekAsync(String season, Integer week) throws URISyntaxException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("season", season);
        parameters.put("week", week.toString());
        return getAsync(
                NFLv3OddsPaths.GET_LIVE_GAME_ODDS_BY_WEEK.path(),
                parameters,
                GameInfo[].class
        );
    }

    public GameInfo[] getLiveGameOddsByWeek(String season, Integer week) throws URISyntaxException, ExecutionException, InterruptedException {
        return getLiveGameOddsByWeekAsync(season, week).get();
    }

    public CompletableFuture<GameInfo[]> getLiveGameOddsLineMovementAsync(Integer scoreId) throws URISyntaxException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("scoreid", scoreId.toString());
        return getAsync(
                NFLv3OddsPaths.GET_LIVE_GAME_ODDS_LINE_MOVEMENT.path(),
                parameters,
                GameInfo[].class
        );
    }

    public GameInfo[] getLiveGameOddsLineMovement(Integer scoreId) throws URISyntaxException, ExecutionException, InterruptedException {
        return getLiveGameOddsLineMovementAsync(scoreId).get();
    }

    public CompletableFuture<GameInfo[]> getPreGameOddsByWeekAsync(String season, Integer week) throws URISyntaxException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("season", season);
        parameters.put("week", week.toString());
        return getAsync(
                NFLv3OddsPaths.GET_PRE_GAME_ODDS_BY_WEEK.path(),
                parameters,
                GameInfo[].class
        );
    }

    public GameInfo[] getPreGameOddsByWeek(String season, Integer week) throws ExecutionException, InterruptedException, URISyntaxException {
        return getPreGameOddsByWeekAsync(season, week).get();
    }

    public CompletableFuture<GameInfo[]> getPreGameOddsLineMovementAsync(Integer scoreId) throws URISyntaxException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("scoreid", scoreId.toString());
        return getAsync(
                NFLv3OddsPaths.GET_PRE_GAME_ODDS_LINE_MOVEMENT.path(),
                parameters,
                GameInfo[].class
        );
    }

    public GameInfo[] getPreGameOddsLineMovement(Integer scoreId) throws URISyntaxException, ExecutionException, InterruptedException {
        return getPreGameOddsLineMovementAsync(scoreId).get();
    }

    public CompletableFuture<PlayerProp>

}
