package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerKickPuntReturns(
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
    @SerializedName("KickReturns") Integer kickReturns,
    @SerializedName("KickReturnYards") Integer kickReturnYards,
    @SerializedName("KickReturnYardsPerAttempt") BigDecimal kickReturnYardsPerAttempt,
    @SerializedName("KickReturnLong") Integer kickReturnLong,
    @SerializedName("KickReturnTouchdowns") Integer kickReturnTouchdowns,
    @SerializedName("PuntReturns") Integer puntReturns,
    @SerializedName("PuntReturnYards") Integer puntReturnYards,
    @SerializedName("PuntReturnYardsPerAttempt") BigDecimal puntReturnYardsPerAttempt,
    @SerializedName("PuntReturnLong") Integer puntReturnLong,
    @SerializedName("PuntReturnTouchdowns") Integer puntReturnTouchdowns,
    @SerializedName("FumblesLost") Integer fumblesLost) {}
