package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;

public record BettingSplit(
    @SerializedName("BettingMarketSplitID") Integer bettingMarketSplitID,
    @SerializedName("BettingMarketID") Integer bettingMarketID,
    @SerializedName("BettingOutcomeTypeID") Integer bettingOutcomeTypeID,
    @SerializedName("BettingOutcomeType") String bettingOutcomeType,
    @SerializedName("BetPercentage") Integer betPercentage,
    @SerializedName("MoneyPercentage") Integer moneyPercentage,
    @SerializedName("Created") String created,
    @SerializedName("LastSeen") String lastSeen) {}
