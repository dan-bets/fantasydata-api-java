package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerReceiving(
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
    @SerializedName("Receptions") Integer receptions,
    @SerializedName("ReceivingTargets") Integer receivingTargets,
    @SerializedName("ReceivingYards") Integer receivingYards,
    @SerializedName("ReceivingTouchdowns") Integer receivingTouchdowns,
    @SerializedName("ReceivingLong") Integer receivingLong,
    @SerializedName("ReceivingYardsPerReception") BigDecimal receivingYardsPerReception,
    @SerializedName("ReceivingYardsPerTarget") BigDecimal receivingYardsPerTarget,
    @SerializedName("ReceptionPercentage") BigDecimal receptionPercentage,
    @SerializedName("FumblesLost") Integer fumblesLost,
    @SerializedName("TwoPointConversionReceptions") Integer twoPointConversionReceptions) {}
