package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerOwnership(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Season") Integer season,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Week") Integer week,
    @SerializedName("Name") String name,
    @SerializedName("Position") String position,
    @SerializedName("Team") String team,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("OwnershipPercentage") BigDecimal ownershipPercentage,
    @SerializedName("DeltaOwnershipPercentage") BigDecimal deltaOwnershipPercentage,
    @SerializedName("StartPercentage") BigDecimal startPercentage,
    @SerializedName("DeltaStartPercentage") BigDecimal deltaStartPercentage) {}
