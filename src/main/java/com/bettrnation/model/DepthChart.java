package com.bettrnation.model;

import com.google.gson.annotations.SerializedName;

public record DepthChart(
    @SerializedName("DepthChartID") Integer depthChartID,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Name") String name,
    @SerializedName("PositionCategory") String positionCategory,
    @SerializedName("Position") String position,
    @SerializedName("DepthOrder") Integer depthOrder,
    @SerializedName("Updated") String updated) {}
