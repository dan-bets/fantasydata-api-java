package com.bettrnation.model;

import java.time.LocalDateTime;

public record BettingMarket(
        Integer marketId,
        Integer eventId,
        Integer bettingMarketTypeId,
        String bettingMarketType,
        Integer bettingBetTypeId,
        String bettingBetType,
        Integer bettingPeriodTypeId,
        String bettingPeriodType,
        String name,
        Integer teamId,
        String teamKey,
        Integer playerId,
        String playerName,
        LocalDateTime created,
        LocalDateTime updated,
        Sportsbook[] availableSportsbooks,
        Boolean anyBetsAvailable,
        BettingOutcome[] bettingOutcomes,
        ConsensusOutcome[] consensusOutcomes
) {
}
