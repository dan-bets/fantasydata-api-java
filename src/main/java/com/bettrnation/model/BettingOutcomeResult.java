package com.bettrnation.model;

public record BettingOutcomeResult(
    Integer bettingOutcomeId,
    Integer bettingResultTypeId,
    String bettingResultType,
    Integer bettingOutcomeTypeId,
    String bettingOutcomeType,
    Double betValue,
    Double actualValue) {}
