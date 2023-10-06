package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record Referee(
    @SerializedName("RefereeID") Integer refereeID,
    @SerializedName("Name") String name,
    @SerializedName("Number") Integer number,
    @SerializedName("Position") String position,
    @SerializedName("College") String college,
    @SerializedName("Experience") Integer experience) {}
