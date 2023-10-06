package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;

public record Series(
    @SerializedName("HomeTeamWins") Integer homeTeamWins,
    @SerializedName("AwayTeamWins") Integer awayTeamWins,
    @SerializedName("GameNumber") Integer gameNumber,
    @SerializedName("MaxLength") Integer maxLength) {}
