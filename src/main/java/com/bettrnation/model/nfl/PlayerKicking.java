package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerKicking(
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
    @SerializedName("ExtraPointsMade") Integer extraPointsMade,
    @SerializedName("ExtraPointsAttempted") Integer extraPointsAttempted,
    @SerializedName("FieldGoalsMade") Integer fieldGoalsMade,
    @SerializedName("FieldGoalsAttempted") Integer fieldGoalsAttempted,
    @SerializedName("FieldGoalsLongestMade") Integer fieldGoalsLongestMade,
    @SerializedName("FieldGoalPercentage") BigDecimal fieldGoalPercentage,
    @SerializedName("FieldGoalsMade0to19") Integer fieldGoalsMade0to19,
    @SerializedName("FieldGoalsMade20to29") Integer fieldGoalsMade20to29,
    @SerializedName("FieldGoalsMade30to39") Integer fieldGoalsMade30to39,
    @SerializedName("FieldGoalsMade40to49") Integer fieldGoalsMade40to49,
    @SerializedName("FieldGoalsMade50Plus") Integer fieldGoalsMade50Plus) {}
