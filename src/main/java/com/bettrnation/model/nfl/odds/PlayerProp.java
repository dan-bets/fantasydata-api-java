package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerProp(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("Name") String name,
    @SerializedName("Opponent") String opponent,
    @SerializedName("Team") String team,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("Description") String description,
    @SerializedName("OverUnder") BigDecimal overUnder,
    @SerializedName("OverPayout") Integer overPayout,
    @SerializedName("UnderPayout") Integer underPayout,
    @SerializedName("BetResult") String betResult,
    @SerializedName("StatResult") BigDecimal statResult) {}
