package com.bettrnation.model;

import java.time.LocalDateTime;

public record DepthChart(
    Integer depthChartID,
    Integer teamID,
    Integer playerID,
    String name,
    String positionCategory,
    String position,
    Integer depthOrder,
    LocalDateTime updated) {}
