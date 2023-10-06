package com.bettrnation.model.nfl;

import com.bettrnation.model.nfl.pbp.ScoringPlay;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record BoxScore(
    @SerializedName("Score") Score score,
    @SerializedName("Game") Game game,
    @SerializedName("ScoringPlays") List<ScoringPlay> scoringPlays,
    @SerializedName("ScoringDetails") List<ScoringDetail> scoringDetails,
    @SerializedName("AwayFantasyDefense") FantasyDefenseGame awayFantasyDefense,
    @SerializedName("HomeFantasyDefense") FantasyDefenseGame homeFantasyDefense,
    @SerializedName("AwayPassing") List<PlayerPassing> awayPassing,
    @SerializedName("AwayRushing") List<PlayerRushing> awayRushing,
    @SerializedName("AwayReceiving") List<PlayerReceiving> awayReceiving,
    @SerializedName("AwayKicking") List<PlayerKicking> awayKicking,
    @SerializedName("AwayPunting") List<PlayerPunting> awayPunting,
    @SerializedName("AwayKickPuntReturns") List<PlayerKickPuntReturns> awayKickPuntReturns,
    @SerializedName("AwayDefense") List<PlayerDefense> awayDefense,
    @SerializedName("HomePassing") List<PlayerPassing> homePassing,
    @SerializedName("HomeRushing") List<PlayerRushing> homeRushing,
    @SerializedName("HomeReceiving") List<PlayerReceiving> homeReceiving,
    @SerializedName("HomeKicking") List<PlayerKicking> homeKicking,
    @SerializedName("HomePunting") List<PlayerPunting> homePunting,
    @SerializedName("HomeKickPuntReturns") List<PlayerKickPuntReturns> homeKickPuntReturns,
    @SerializedName("HomeDefense") List<PlayerDefense> homeDefense) {}
