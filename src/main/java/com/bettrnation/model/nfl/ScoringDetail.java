package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record ScoringDetail(
    @SerializedName("GameKey") String gameKey,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Team") String team,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("ScoringType") String scoringType,
    @SerializedName("Length") Integer length,
    @SerializedName("ScoringDetailID") Integer scoringDetailID,
    @SerializedName("PlayerGameID") Integer playerGameID,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("ScoringPlayID") Integer scoringPlayID) {}
