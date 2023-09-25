package com.bettrnation.model;

import java.time.LocalDateTime;

public record GameProbability(
    Integer scoreId,
    Integer seasonType,
    Integer season,
    Integer week,
    LocalDateTime dateTime,
    Integer stadiumId,
    String status,
    Boolean closed,
    String timeRemaining,
    String quarter,
    Integer awayTeamId,
    Integer homeTeamId,
    String awayTeam,
    String homeTeam,
    Integer awayScore,
    Integer homeScore,
    List<WinProbability> winProbabilities) {}
