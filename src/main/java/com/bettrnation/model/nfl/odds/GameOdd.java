package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record GameOdd(
    @SerializedName("GameOddId") Integer gameOddId,
    @SerializedName("Sportsbook") String sportsbook,
    @SerializedName("ScoreId") Integer scoreId,
    @SerializedName("Created") String created,
    @SerializedName("Updated") String updated,
    @SerializedName("HomeMoneyLine") Integer homeMoneyLine,
    @SerializedName("AwayMoneyLine") Integer awayMoneyLine,
    @SerializedName("DrawMoneyLine") Integer drawMoneyLine,
    @SerializedName("HomePointSpread") BigDecimal homePointSpread,
    @SerializedName("AwayPointSpread") BigDecimal awayPointSpread,
    @SerializedName("HomePointSpreadPayout") Integer homePointSpreadPayout,
    @SerializedName("AwayPointSpreadPayout") Integer awayPointSpreadPayout,
    @SerializedName("OverUnder") BigDecimal overUnder,
    @SerializedName("OverPayout") Integer overPayout,
    @SerializedName("UnderPayout") Integer underPayout,
    @SerializedName("SportsbookId") Integer sportsbookId,
    @SerializedName("OddType") String oddType,
    @SerializedName("SportsbookUrl") String sportsbookUrl,
    @SerializedName("GameId") Integer gameId) {}
