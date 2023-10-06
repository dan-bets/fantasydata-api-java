package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record Quarter(
    @SerializedName("QuarterID") Integer quarterID,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("Number") Integer number,
    @SerializedName("Name") String name,
    @SerializedName("Description") String description,
    @SerializedName("AwayTeamScore") Integer awayTeamScore,
    @SerializedName("HomeTeamScore") Integer homeTeamScore,
    @SerializedName("Updated") String updated,
    @SerializedName("Created") String created) {}
