package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record StartingLineups(
    @SerializedName("GameID") Integer gameID,
    @SerializedName("Season") Integer season,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Day") String day,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("Status") String status,
    @SerializedName("HomeTeamID") Integer homeTeamID,
    @SerializedName("HomeTeam") String homeTeam,
    @SerializedName("AwayTeamID") Integer awayTeamID,
    @SerializedName("AwayTeam") String awayTeam,
    @SerializedName("HomeStartingPitcher") Lineup homeStartingPitcher,
    @SerializedName("HomeBattingLineup") List<Lineup> homeBattingLineup,
    @SerializedName("AwayStartingPitcher") Lineup awayStartingPitcher,
    @SerializedName("AwayBattingLineup") List<Lineup> awayBattingLineup) {}
