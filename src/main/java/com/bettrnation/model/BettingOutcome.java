package com.bettrnation.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BettingOutcome(
        Integer bettingOutcomeId,
        Integer bettingMarketId,
        Sportsbook sportsbook,
        Integer bettingOutcomeTypeId,
        String bettingOutcomeType,
        Integer payoutAmerican,
        BigDecimal payoutDecimal,
        BigDecimal value,
        String participant,
        Boolean isAvailable,
        Boolean isAlternate,
        LocalDateTime created,
        LocalDateTime updated,
        LocalDateTime unlisted,
        Integer teamId,
        Integer playerId,
        Integer globalTeamId,
        String sportsbookUrl,
        Boolean isInPlay,
        String sportsbookMarketId,
        String sportsbookOutcomeId
) {
}
