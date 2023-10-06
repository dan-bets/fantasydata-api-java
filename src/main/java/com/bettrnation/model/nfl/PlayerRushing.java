package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerRushing(
    @SerializedName("PlayerGameID") Integer playerGameID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("ShortName") String shortName,
    @SerializedName("Name") String name,
    @SerializedName("Team") String team,
    @SerializedName("Number") Integer number,
    @SerializedName("Position") String position,
    @SerializedName("PositionCategory") String positionCategory,
    @SerializedName("FantasyPosition") String fantasyPosition,
    @SerializedName("FantasyPoints") BigDecimal fantasyPoints,
    @SerializedName("Updated") String updated,
    @SerializedName("RushingAttempts") Integer rushingAttempts,
    @SerializedName("RushingYards") Integer rushingYards,
    @SerializedName("RushingTouchdowns") Integer rushingTouchdowns,
    @SerializedName("RushingLong") Integer rushingLong,
    @SerializedName("RushingYardsPerAttempt") BigDecimal rushingYardsPerAttempt,
    @SerializedName("FumblesLost") Integer fumblesLost,
    @SerializedName("TwoPointConversionRuns") Integer twoPointConversionRuns) {}
