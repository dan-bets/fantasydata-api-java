package com.bettrnation.model;

public record BettingMarketResult(
    Integer uniqueIdentifier,
    Integer bettingMarketTypeID,
    String bettingMarketType,
    Integer bettingBetTypeID,
    String bettingBetType,
    Integer bettingPeriodTypeID,
    String bettingPeriodType,
    String name,
    Integer teamID,
    String teamKey,
    Integer playerID,
    String playerName,
    BettingOutcomeResult[] bettingOutcomeResults,
    Boolean isMarketResultingSupported) {}
