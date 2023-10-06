package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;

public record Lineup(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("FirstName") String firstName,
    @SerializedName("LastName") String lastName,
    @SerializedName("BattingOrder") Integer battingOrder,
    @SerializedName("Position") String position,
    @SerializedName("Starting") Boolean starting,
    @SerializedName("Confirmed") Boolean confirmed) {}
