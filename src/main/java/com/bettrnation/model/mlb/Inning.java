package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;

public record Inning(
    @SerializedName("InningID") Integer inningID,
    @SerializedName("GameID") Integer gameID,
    @SerializedName("InningNumber") Integer inningNumber,
    @SerializedName("AwayTeamRuns") Integer awayTeamRuns,
    @SerializedName("HomeTeamRuns") Integer homeTeamRuns) {}
