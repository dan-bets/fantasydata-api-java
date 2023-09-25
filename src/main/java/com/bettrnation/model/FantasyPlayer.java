package com.bettrnation.model;

public record FantasyPlayer(
    String fantasyPlayerKey,
    Integer playerID,
    String name,
    String team,
    String position,
    Double averageDraftPosition,
    Double averageDraftPositionPPR,
    Integer byeWeek,
    Double lastSeasonFantasyPoints,
    Double projectedFantasyPoints,
    Integer auctionValue,
    Integer auctionValuePPR,
    Integer averageDraftPositionIDP,
    Double averageDraftPositionRookie,
    Double averageDraftPositionDynasty,
    Double averageDraftPosition2QB) {}
