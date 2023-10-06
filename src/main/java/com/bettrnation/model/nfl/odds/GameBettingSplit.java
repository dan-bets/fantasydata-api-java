package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;

public record GameBettingSplit(
    @SerializedName("ScoreId") Integer scoreId,
    @SerializedName("GameKey") String gameKey,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("Date") String date,
    @SerializedName("AwayTeam") String awayTeam,
    @SerializedName("HomeTeam") String homeTeam) {}
