package com.bettrnation.model;

import java.time.LocalDateTime;

public record GameOdd(
    Integer gameOddId,
    String sportsbook,
    Integer scoreId,
    LocalDateTime created,
    LocalDateTime updated,
    Integer homeMoneyLine,
    Integer awayMoneyLine,
    Integer drawMoneyLine,
    Double homePointSpread,
    Double awayPointSpread,
    Integer homePointSpreadPayout,
    Integer awayPointSpreadPayout,
    Double overUnder,
    Integer overPayout,
    Integer underPayout,
    Integer sportsbookId,
    String oddType,
    String sportsbookUrl,
    Integer gameId) {}
