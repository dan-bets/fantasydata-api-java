package com.bettrnation.model.nfl;

import com.bettrnation.model.nfl.pbp.PlayStat;
import com.bettrnation.model.nfl.pbp.ScoringPlay;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record Play(
    @SerializedName("PlayID") Integer playID,
    @SerializedName("QuarterID") Integer quarterID,
    @SerializedName("QuarterName") String quarterName,
    @SerializedName("Sequence") Integer sequence,
    @SerializedName("TimeRemainingMinutes") Integer timeRemainingMinutes,
    @SerializedName("TimeRemainingSeconds") Integer timeRemainingSeconds,
    @SerializedName("PlayTime") String playTime,
    @SerializedName("Updated") String updated,
    @SerializedName("Created") String created,
    @SerializedName("Team") String team,
    @SerializedName("Opponent") String opponent,
    @SerializedName("Down") Integer down,
    @SerializedName("Distance") Integer distance,
    @SerializedName("YardLine") Integer yardLine,
    @SerializedName("YardLineTerritory") String yardLineTerritory,
    @SerializedName("YardsToEndZone") Integer yardsToEndZone,
    @SerializedName("Type") String type,
    @SerializedName("YardsGained") Integer yardsGained,
    @SerializedName("Description") String description,
    @SerializedName("IsScoringPlay") Boolean isScoringPlay,
    @SerializedName("ScoringPlay") ScoringPlay scoringPlay,
    @SerializedName("PlayStats") List<PlayStat> playStats) {}
