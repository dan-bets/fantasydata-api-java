package com.bettrnation.model;

import java.time.LocalDateTime;

public record Timeframe(
    Integer SeasonType,
    Integer Season,
    Integer Week,
    String Name,
    String ShortName,
    LocalDateTime StartDate,
    LocalDateTime EndDate,
    LocalDateTime FirstGameStart,
    LocalDateTime FirstGameEnd,
    LocalDateTime LastGameEnd,
    Boolean HasGames,
    Boolean HasStarted,
    Boolean HasEnded,
    Boolean HasFirstGameStarted,
    Boolean HasFirstGameEnded,
    Boolean HasLastGameEnded,
    String ApiSeason,
    String ApiWeek) {}
