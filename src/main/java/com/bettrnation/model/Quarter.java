package com.bettrnation.model;

import java.time.LocalDateTime;

public record Quarter(
    Integer quarterID,
    Integer scoreID,
    Integer number,
    String name,
    String description,
    Integer awayTeamScore,
    Integer homeTeamScore,
    LocalDateTime updated,
    LocalDateTime created) {}
