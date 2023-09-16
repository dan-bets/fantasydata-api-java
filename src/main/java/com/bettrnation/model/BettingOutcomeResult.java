package com.bettrnation.model;

import java.math.BigDecimal;

public record BettingOutcomeResult(
        Integer bettingOutcomeId,
        Integer bettingResultTypeId,
        String bettingResultType,
        Integer bettingOutcomeTypeId,
        String bettingOutcomeType,
        BigDecimal betValue,
        BigDecimal actualValue
) {
}
