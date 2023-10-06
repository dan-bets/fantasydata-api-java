package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerPunting(
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
    @SerializedName("Punts") Integer punts,
    @SerializedName("PuntAverage") BigDecimal puntAverage,
    @SerializedName("PuntInside20") Integer puntInside20,
    @SerializedName("PuntTouchbacks") Integer puntTouchbacks,
    @SerializedName("PuntYards") Integer puntYards) {}
