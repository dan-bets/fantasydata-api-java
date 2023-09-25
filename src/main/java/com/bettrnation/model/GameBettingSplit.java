package com.bettrnation.model;

import java.util.List;

public record GameBettingSplit(
    Integer scoreId,
    String gameKey,
    Integer seasonType,
    Integer season,
    Integer week,
    String date,
    String awayTeam,
    String homeTeam,
    List<BettingMarketSplit> bettingMarketSplits) {}
