package com.bettrnation.model.nfl;

import com.bettrnation.model.DepthChart;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record TeamDepthChart(
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Offense") List<DepthChart> offense,
    @SerializedName("Defense") List<DepthChart> defense,
    @SerializedName("SpecialTeams") List<DepthChart> specialTeams) {}
