package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record Timeframe(
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("Name") String name,
    @SerializedName("ShortName") String shortName,
    @SerializedName("StartDate") String startDate,
    @SerializedName("EndDate") String endDate,
    @SerializedName("FirstGameStart") String firstGameStart,
    @SerializedName("FirstGameEnd") String firstGameEnd,
    @SerializedName("LastGameEnd") String lastGameEnd,
    @SerializedName("HasGames") Boolean hasGames,
    @SerializedName("HasStarted") Boolean hasStarted,
    @SerializedName("HasEnded") Boolean hasEnded,
    @SerializedName("HasFirstGameStarted") Boolean hasFirstGameStarted,
    @SerializedName("HasFirstGameEnded") Boolean hasFirstGameEnded,
    @SerializedName("HasLastGameEnded") Boolean hasLastGameEnded,
    @SerializedName("ApiSeason") String apiSeason,
    @SerializedName("ApiWeek") String apiWeek) {}
