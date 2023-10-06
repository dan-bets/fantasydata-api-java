package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record ConsensusOutcome(
    @SerializedName("NumberOfSportsbooks") Integer numberOfSportsbooks,
    @SerializedName("BettingOutcomeID") Integer bettingOutcomeID,
    @SerializedName("BettingMarketID") Integer bettingMarketID,
    @SerializedName("SportsBook") Sportsbook sportsBook,
    @SerializedName("BettingOutcomeTypeID") Integer bettingOutcomeTypeID,
    @SerializedName("BettingOutcomeType") String bettingOutcomeType,
    @SerializedName("PayoutAmerican") Integer payoutAmerican,
    @SerializedName("PayoutDecimal") BigDecimal payoutDecimal,
    @SerializedName("Value") BigDecimal value,
    @SerializedName("Participant") String participant,
    @SerializedName("IsAvailable") Boolean isAvailable,
    @SerializedName("IsAlternate") Boolean isAlternate,
    @SerializedName("Created") String created,
    @SerializedName("Updated") String updated,
    @SerializedName("Unlisted") String unlisted,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("SportsbookUrl") String sportsbookUrl,
    @SerializedName("IsInPlay") Boolean isInPlay,
    @SerializedName("SportsbookMarketID") String sportsbookMarketID,
    @SerializedName("SportsbookOutcomeID") String sportsbookOutcomeID) {}
