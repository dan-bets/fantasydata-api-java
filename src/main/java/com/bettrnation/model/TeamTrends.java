package com.bettrnation.model;

public record TeamTrends(
    String team, Integer teamId, Score upcomingGame, TeamGameTrends[] teamGameTrends) {}
