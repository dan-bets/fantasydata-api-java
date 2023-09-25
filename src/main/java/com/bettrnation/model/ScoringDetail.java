package com.bettrnation.model;

public record ScoringDetail(
    String gameKey,
    Integer seasonType,
    Integer playerID,
    String team,
    Integer season,
    Integer week,
    String scoringType,
    Integer length,
    Integer scoringDetailID,
    Integer playerGameID,
    Integer scoreID,
    Integer scoringPlayID) {}
