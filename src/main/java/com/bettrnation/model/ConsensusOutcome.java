package com.bettrnation.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ConsensusOutcome(
        Integer numberOfSportsbooks,
        Integer bettingOutcomeID,
        Integer bettingMarketID,
        Sportsbook sportsbook,
        Integer bettingOutcomeTypeID,
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
        Integer teamID,
        Integer playerID,
        Integer globalTeamID,
        String sportsbookUrl,
        Boolean isInPlay,
        String sportsbookMarketID,
        String sportsbookOutcomeID
) {
}
