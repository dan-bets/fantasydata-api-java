package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record TeamGameTrends(
    @SerializedName("Scope") String scope,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("OpponentID") Integer opponentID,
    @SerializedName("Opponent") String opponent,
    @SerializedName("Wins") Integer wins,
    @SerializedName("Losses") Integer losses,
    @SerializedName("Ties") Integer ties,
    @SerializedName("WinsAgainstTheSpread") Integer winsAgainstTheSpread,
    @SerializedName("LossesAgainstTheSpread") Integer lossesAgainstTheSpread,
    @SerializedName("PushesAgainstTheSpread") Integer pushesAgainstTheSpread,
    @SerializedName("Overs") Integer overs,
    @SerializedName("Unders") Integer unders,
    @SerializedName("OverUnderPushes") Integer overUnderPushes,
    @SerializedName("AverageScore") BigDecimal averageScore,
    @SerializedName("AverageOpponentScore") BigDecimal averageOpponentScore) {}
