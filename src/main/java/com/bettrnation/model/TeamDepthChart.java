package com.bettrnation.model;

import java.util.List;

public record TeamDepthChart(
    Integer teamID,
    List<DepthChart> offense,
    List<DepthChart> defense,
    List<DepthChart> specialTeams) {}
