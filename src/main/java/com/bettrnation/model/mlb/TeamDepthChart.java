package com.bettrnation.model.mlb;

import com.bettrnation.model.DepthChart;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record TeamDepthChart(
    @SerializedName("DepthCharts") List<DepthChart> depthCharts,
    @SerializedName("TeamID") Integer teamID) {}
