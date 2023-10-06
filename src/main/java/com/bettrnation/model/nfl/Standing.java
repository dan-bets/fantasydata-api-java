package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record Standing(
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Conference") String conference,
    @SerializedName("Division") String division,
    @SerializedName("Team") String team,
    @SerializedName("Name") String name,
    @SerializedName("Wins") Integer wins,
    @SerializedName("Losses") Integer losses,
    @SerializedName("Ties") Integer ties,
    @SerializedName("Percentage") BigDecimal percentage,
    @SerializedName("PointsFor") Integer pointsFor,
    @SerializedName("PointsAgainst") Integer pointsAgainst,
    @SerializedName("NetPoints") Integer netPoints,
    @SerializedName("Touchdowns") Integer touchdowns,
    @SerializedName("DivisionWins") Integer divisionWins,
    @SerializedName("DivisionLosses") Integer divisionLosses,
    @SerializedName("ConferenceWins") Integer conferenceWins,
    @SerializedName("ConferenceLosses") Integer conferenceLosses,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("DivisionTies") Integer divisionTies,
    @SerializedName("ConferenceTies") Integer conferenceTies,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("DivisionRank") Integer divisionRank,
    @SerializedName("ConferenceRank") Integer conferenceRank) {}
