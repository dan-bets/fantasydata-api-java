package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record BettingMarketResult(
    @SerializedName("BettingMarketID") Integer bettingMarketID,
    @SerializedName("BettingMarketTypeID") Integer bettingMarketTypeID,
    @SerializedName("BettingMarketType") String bettingMarketType,
    @SerializedName("BettingBetTypeID") Integer bettingBetTypeID,
    @SerializedName("BettingBetType") String bettingBetType,
    @SerializedName("BettingPeriodTypeID") Integer bettingPeriodTypeID,
    @SerializedName("BettingPeriodType") String bettingPeriodType,
    @SerializedName("Name") String name,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("TeamKey") String teamKey,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("PlayerName") String playerName,
    @SerializedName("BettingOutcomeResults") List<BettingOutcomeResult> bettingOutcomeResults,
    @SerializedName("IsMarketResultingSupported") Boolean isMarketResultingSupported) {}
