package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record ScheduleBasic(
    @SerializedName("GameID") Integer gameID,
    @SerializedName("GlobalGameID") Integer globalGameID,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("GameKey") String gameKey,
    @SerializedName("Season") Integer season,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Status") String status,
    @SerializedName("Canceled") Boolean canceled,
    @SerializedName("Date") String date,
    @SerializedName("Day") String day,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("DateTimeUTC") String dateTimeUTC,
    @SerializedName("AwayTeam") String awayTeam,
    @SerializedName("HomeTeam") String homeTeam,
    @SerializedName("GlobalAwayTeamID") Integer globalAwayTeamID,
    @SerializedName("GlobalHomeTeamID") Integer globalHomeTeamID,
    @SerializedName("AwayTeamID") Integer awayTeamID,
    @SerializedName("HomeTeamID") Integer homeTeamID,
    @SerializedName("StadiumID") Integer stadiumID,
    @SerializedName("Closed") Boolean closed,
    @SerializedName("LastUpdated") String lastUpdated,
    @SerializedName("IsClosed") Boolean isClosed,
    @SerializedName("Week") Integer week) {}
