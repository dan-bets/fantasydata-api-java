package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record MatchupTrends(
    @SerializedName("UpcomingGame") Score upcomingGame,
    @SerializedName("TeamTrends") List<TeamTrends> teamTrends,
    @SerializedName("TeamMatchupTrends") List<TeamGameTrends> teamMatchupTrends,
    @SerializedName("OpponentMatchupTrends") List<TeamGameTrends> opponentMatchupTrends,
    @SerializedName("PreviousGames") List<Score> previousGames) {}
