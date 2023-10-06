package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record BettingOutcomeResult(
    @SerializedName("BettingOutcomeID") Integer bettingOutcomeID,
    @SerializedName("BettingResultTypeID") Integer bettingResultTypeID,
    @SerializedName("BettingResultType") String bettingResultType,
    @SerializedName("BettingOutcomeTypeID") Integer bettingOutcomeTypeID,
    @SerializedName("BettingOutcomeType") String bettingOutcomeType,
    @SerializedName("BetValue") BigDecimal betValue,
    @SerializedName("ActualValue") BigDecimal actualValue) {}
