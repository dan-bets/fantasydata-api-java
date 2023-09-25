package com.bettrnation.model;

import java.time.LocalDateTime;

public record Play(
    Integer playID,
    Integer quarterID,
    String quarterName,
    Integer sequence,
    Integer timeRemainingMinutes,
    Integer timeRemainingSeconds,
    LocalDateTime playTime,
    LocalDateTime updated,
    LocalDateTime created,
    String team,
    String opponent,
    Integer down,
    Integer distance,
    Integer yardLine,
    String yardLineTerritory,
    Integer yardsToEndZone,
    String type,
    Integer yardsGained,
    String description,
    Boolean isScoringPlay,
    ScoringPlay scoringPlay,
    PlayStat[] playStats) {}
