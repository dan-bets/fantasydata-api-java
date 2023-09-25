package com.bettrnation.model;

import java.time.LocalDateTime;

public record ScoringPlay(
    String gameKey,
    Integer seasonType,
    Integer scoringPlayID,
    Integer season,
    Integer week,
    String awayTeam,
    String homeTeam,
    LocalDateTime date,
    Integer sequence,
    String team,
    String quarter,
    String timeRemaining,
    String playDescription,
    Integer awayScore,
    Integer homeScore,
    Integer scoreID) {}
