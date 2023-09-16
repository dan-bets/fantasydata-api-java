package com.bettrnation.model;

import java.time.LocalDateTime;

public record BettingSplit(
        Integer bettingMarketSplitID,
        Integer bettingMarketID,
        Integer bettingOutcomeTypeID,
        String bettingOutcomeType,
        Integer betPercentage,
        Integer moneyPercentage,
        LocalDateTime created,
        LocalDateTime lastSeen
) {
}
