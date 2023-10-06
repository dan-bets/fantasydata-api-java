package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record TeamTrends(
    @SerializedName("Team") String team,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("UpcomingGame") Score upcomingGame,
    @SerializedName("TeamGameTrends") List<TeamGameTrends> teamGameTrends) {}
