package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record BettingMarket(
    @SerializedName("BettingMarketID") Integer bettingMarketID,
    @SerializedName("BettingEventID") Integer bettingEventID,
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
    @SerializedName("Created") String created,
    @SerializedName("Updated") String updated,
    @SerializedName("AvailableSportsbooks") List<Sportsbook> availableSportsbooks,
    @SerializedName("AnyBetsAvailable") Boolean anyBetsAvailable,
    @SerializedName("BettingOutcomes") List<BettingOutcome> bettingOutcomes,
    @SerializedName("ConsensusOutcomes") List<ConsensusOutcome> consensusOutcomes) {}
