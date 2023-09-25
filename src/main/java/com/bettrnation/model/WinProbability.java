package com.bettrnation.model;

import java.time.LocalDateTime;

public record WinProbability(
    String timeRemaining,
    String quarter,
    Double awayWinProbability,
    Double homeWinProbability,
    LocalDateTime created,
    LocalDateTime updated) {}
