package com.bettrnation.model;

public record BoxScoreV3(
        Score score,
        List<Quarter> quarters,
        List<TeamGame> teamGames,
        List<PlayerGame> playerGames,
        List<FantasyDefenseGame> fantasyDefenseGames,
        List<ScoringPlay> scoringPlays,
        List<ScoringDetail> scoringDetails
) {
}
