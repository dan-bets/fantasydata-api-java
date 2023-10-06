package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record PlayerInfo(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Name") String name,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("Position") String position) {}
