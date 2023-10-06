package com.bettrnation.model.nfl;

import com.bettrnation.model.nfl.odds.GameOdd;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record GameInfo(
    @SerializedName("ScoreId") Integer scoreId,
    @SerializedName("Season") Integer season,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Week") Integer week,
    @SerializedName("Day") String day,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("Status") String status,
    @SerializedName("AwayTeamId") Integer awayTeamId,
    @SerializedName("HomeTeamId") Integer homeTeamId,
    @SerializedName("AwayTeamName") String awayTeamName,
    @SerializedName("HomeTeamName") String homeTeamName,
    @SerializedName("GlobalGameId") Integer globalGameId,
    @SerializedName("GlobalAwayTeamId") Integer globalAwayTeamId,
    @SerializedName("GlobalHomeTeamId") Integer globalHomeTeamId,
    @SerializedName("PregameOdds") List<GameOdd> pregameOdds,
    @SerializedName("LiveOdds") List<GameOdd> liveOdds,
    @SerializedName("HomeTeamScore") Integer homeTeamScore,
    @SerializedName("AwayTeamScore") Integer awayTeamScore,
    @SerializedName("TotalScore") Integer totalScore,
    @SerializedName("HomeRotationNumber") Integer homeRotationNumber,
    @SerializedName("AwayRotationNumber") Integer awayRotationNumber,
    @SerializedName("AlternateMarketPregameOdds") List<GameOdd> alternateMarketPregameOdds,
    @SerializedName("GameId") Integer gameId) {}
