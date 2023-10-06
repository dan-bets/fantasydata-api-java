package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record BettingEvent(
    @SerializedName("BettingEventID") Integer bettingEventID,
    @SerializedName("Name") String name,
    @SerializedName("Season") Integer season,
    @SerializedName("BettingEventTypeID") Integer bettingEventTypeID,
    @SerializedName("BettingEventType") String bettingEventType,
    @SerializedName("StartDate") String startDate,
    @SerializedName("Created") String created,
    @SerializedName("Updated") String updated,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("GlobalScoreID") Integer globalScoreID,
    @SerializedName("GameStatus") String gameStatus,
    @SerializedName("Quarter") String quarter,
    @SerializedName("AwayTeam") String awayTeam,
    @SerializedName("HomeTeam") String homeTeam,
    @SerializedName("AwayTeamID") Integer awayTeamID,
    @SerializedName("HomeTeamID") Integer homeTeamID,
    @SerializedName("GlobalAwayTeamID") Integer globalAwayTeamID,
    @SerializedName("GlobalHomeTeamID") Integer globalHomeTeamID,
    @SerializedName("AwayTeamScore") Integer awayTeamScore,
    @SerializedName("HomeTeamScore") Integer homeTeamScore,
    @SerializedName("TotalScore") Integer totalScore,
    @SerializedName("AwayRotationNumber") Integer awayRotationNumber,
    @SerializedName("HomeRotationNumber") Integer homeRotationNumber,
    @SerializedName("BettingMarkets") List<BettingMarket> bettingMarkets,
    @SerializedName("GameStartTime") String gameStartTime) {}
