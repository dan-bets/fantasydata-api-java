package com.bettrnation.model.nfl;

import com.bettrnation.model.nfl.pbp.ScoringPlay;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record BoxScoreV3(
    @SerializedName("Score") Score score,
    @SerializedName("Quarters") List<Quarter> quarters,
    @SerializedName("TeamGames") List<TeamGame> teamGames,
    @SerializedName("PlayerGames") List<PlayerGame> playerGames,
    @SerializedName("FantasyDefenseGames") List<FantasyDefenseGame> fantasyDefenseGames,
    @SerializedName("ScoringPlays") List<ScoringPlay> scoringPlays,
    @SerializedName("ScoringDetails") List<ScoringDetail> scoringDetails) {}
