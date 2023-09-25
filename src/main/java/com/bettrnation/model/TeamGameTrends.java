package com.bettrnation.model;

public record TeamGameTrends(
    String scope,
    Integer teamID,
    String team,
    Integer opponentID,
    String opponent,
    Integer wins,
    Integer losses,
    Integer ties,
    Integer winsAgainstTheSpread,
    Integer lossesAgainstTheSpread,
    Integer pushesAgainstTheSpread,
    Integer overs,
    Integer unders,
    Integer overUnderPushes,
    Double averageScore,
    Double averageOpponentScore) {}
