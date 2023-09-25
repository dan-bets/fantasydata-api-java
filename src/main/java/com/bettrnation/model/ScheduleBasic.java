package com.bettrnation.model;

import java.time.LocalDate;

public record ScheduleBasic(
    Integer gameID,
    Integer globalGameID,
    Integer scoreID,
    String gameKey,
    Integer season,
    Integer seasonType,
    String status,
    Boolean canceled,
    LocalDate date,
    LocalDate day,
    LocalDate dateTime,
    LocalDate dateTimeUTC,
    String awayTeam,
    String homeTeam,
    Integer globalAwayTeamID,
    Integer globalHomeTeamID,
    Integer awayTeamID,
    Integer homeTeamID,
    Integer stadiumID,
    Boolean closed,
    LocalDate lastUpdated,
    Boolean isClosed,
    Integer week) {}
