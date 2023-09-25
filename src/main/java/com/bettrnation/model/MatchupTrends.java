package com.bettrnation.model;

public record MatchupTrends(
    Score upcomingGame,
    TeamTrends[] teamTrends,
    TeamGameTrends[] teamMatchupTrends,
    TeamGameTrends[] opponentMatchupTrends,
    Score[] previousGames) {}
