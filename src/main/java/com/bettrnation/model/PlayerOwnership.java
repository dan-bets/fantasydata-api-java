package com.bettrnation.model;

public record PlayerOwnership(
    Integer playerID,
    Integer season,
    Integer seasonType,
    Integer week,
    String name,
    String position,
    String team,
    Integer teamID,
    Double ownershipPercentage,
    Double deltaOwnershipPercentage,
    Double startPercentage,
    Double deltaStartPercentage) {}
