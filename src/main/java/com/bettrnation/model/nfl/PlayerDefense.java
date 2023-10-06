package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerDefense(
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
    @SerializedName("Tackles") Integer tackles,
    @SerializedName("SoloTackles") Integer soloTackles,
    @SerializedName("AssistedTackles") Integer assistedTackles,
    @SerializedName("Sacks") BigDecimal sacks,
    @SerializedName("SackYards") Integer sackYards,
    @SerializedName("FumblesForced") Integer fumblesForced,
    @SerializedName("FumblesRecovered") Integer fumblesRecovered,
    @SerializedName("PassesDefended") Integer passesDefended,
    @SerializedName("Interceptions") Integer interceptions,
    @SerializedName("InterceptionReturnYards") Integer interceptionReturnYards,
    @SerializedName("InterceptionReturnTouchdowns") Integer interceptionReturnTouchdowns,
    @SerializedName("TacklesForLoss") Integer tacklesForLoss,
    @SerializedName("QuarterbackHits") Integer quarterbackHits,
    @SerializedName("FumbleReturnTouchdowns") Integer fumbleReturnTouchdowns,
    @SerializedName("Safeties") Integer safeties) {}
