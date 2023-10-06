package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record Injury(
    @SerializedName("InjuryID") Integer injuryID,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Name") String name,
    @SerializedName("Position") String position,
    @SerializedName("Number") Integer number,
    @SerializedName("Team") String team,
    @SerializedName("Opponent") String opponent,
    @SerializedName("BodyPart") String bodyPart,
    @SerializedName("Status") String status,
    @SerializedName("Practice") String practice,
    @SerializedName("PracticeDescription") String practiceDescription,
    @SerializedName("Updated") String updated,
    @SerializedName("DeclaredInactive") Boolean declaredInactive,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("OpponentID") Integer opponentID) {}
