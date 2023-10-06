package com.bettrnation.model.nfl.pbp;

import com.google.gson.annotations.SerializedName;

public record ScoringPlay(
    @SerializedName("GameKey") String gameKey,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("ScoringPlayID") Integer scoringPlayID,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("AwayTeam") String awayTeam,
    @SerializedName("HomeTeam") String homeTeam,
    @SerializedName("Date") String date,
    @SerializedName("Sequence") Integer sequence,
    @SerializedName("Team") String team,
    @SerializedName("Quarter") String quarter,
    @SerializedName("TimeRemaining") String timeRemaining,
    @SerializedName("PlayDescription") String playDescription,
    @SerializedName("AwayScore") Integer awayScore,
    @SerializedName("HomeScore") Integer homeScore,
    @SerializedName("ScoreID") Integer scoreID) {}
