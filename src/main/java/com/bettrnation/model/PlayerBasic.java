package com.bettrnation.model;

import java.time.LocalDateTime;

public record PlayerBasic(
    Integer playerId,
    String team,
    Integer number,
    String firstName,
    String lastName,
    String position,
    String status,
    String height,
    Integer weight,
    LocalDateTime birthDate,
    String college,
    Integer experience,
    String fantasyPosition,
    Boolean active,
    String positionCategory,
    String name,
    Integer age,
    String shortName,
    Integer heightFeet,
    Integer heightInches,
    Integer teamId,
    Integer globalTeamId,
    Integer usaTodayPlayerId,
    String usaTodayHeadshotUrl,
    String usaTodayHeadshotNoBackgroundUrl,
    LocalDateTime usaTodayHeadshotUpdated,
    LocalDateTime usaTodayHeadshotNoBackgroundUpdated) {}
