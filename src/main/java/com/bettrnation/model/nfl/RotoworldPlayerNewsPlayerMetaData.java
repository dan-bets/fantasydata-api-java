package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record RotoworldPlayerNewsPlayerMetaData(
    @SerializedName("PlayerFirstName") String playerFirstName,
    @SerializedName("PlayerLastName") String playerLastName,
    @SerializedName("RotoworldPlayerId") String rotoworldPlayerId,
    @SerializedName("StatsPlayerID") Integer statsPlayerID,
    @SerializedName("SportRadarPlayerID") String sportRadarPlayerID,
    @SerializedName("PlayerStatus") String playerStatus,
    @SerializedName("TeamKey") String teamKey,
    @SerializedName("TeamCity") String teamCity,
    @SerializedName("TeamName") String teamName,
    @SerializedName("TeamColor") String teamColor) {}
