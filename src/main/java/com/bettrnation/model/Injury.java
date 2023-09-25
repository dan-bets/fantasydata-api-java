package com.bettrnation.model;

import java.time.LocalDateTime;

public record Injury(
    Integer injuryId,
    Integer seasonType,
    Integer season,
    Integer week,
    Integer playerId,
    String name,
    String position,
    Integer number,
    String team,
    String opponent,
    String bodyPart,
    String status,
    String practice,
    String practiceDescription,
    LocalDateTime updated,
    Boolean declaredInactive,
    Integer teamId,
    Integer opponentId) {}
