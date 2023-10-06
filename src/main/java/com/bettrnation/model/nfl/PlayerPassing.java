package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerPassing(
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
    @SerializedName("PassingAttempts") Integer passingAttempts,
    @SerializedName("PassingCompletions") Integer passingCompletions,
    @SerializedName("PassingYards") Integer passingYards,
    @SerializedName("PassingTouchdowns") Integer passingTouchdowns,
    @SerializedName("PassingInterceptions") Integer passingInterceptions,
    @SerializedName("PassingLong") Integer passingLong,
    @SerializedName("PassingSacks") Integer passingSacks,
    @SerializedName("PassingSackYards") Integer passingSackYards,
    @SerializedName("PassingCompletionPercentage") BigDecimal passingCompletionPercentage,
    @SerializedName("PassingYardsPerAttempt") BigDecimal passingYardsPerAttempt,
    @SerializedName("PassingYardsPerCompletion") BigDecimal passingYardsPerCompletion,
    @SerializedName("PassingRating") BigDecimal passingRating,
    @SerializedName("TwoPointConversionPasses") Integer twoPointConversionPasses,
    @SerializedName("FumblesLost") Integer fumblesLost) {}
