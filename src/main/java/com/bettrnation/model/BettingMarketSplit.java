package com.bettrnation.model;

public record BettingMarketSplit(
        Integer uniqueId,
        Integer bettingEventId,
        Integer bettingMarketTypeId,
        String bettingMarketType,
        Integer bettingBetTypeId,
        String bettingBetType,
        Integer bettingPeriodTypeId,
        String bettingPeriodType,
        Integer teamId,
        String teamKey,
        Integer playerId,
        String playerName,
        BettingSplit[] bettingSplits
) {
}
