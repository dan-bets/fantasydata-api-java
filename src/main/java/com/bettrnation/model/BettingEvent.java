package com.bettrnation.model;

import java.time.LocalDateTime;

public record BettingEvent(
        Integer eventId,
        String name,
        Integer season,
        Integer bettingEventTypeId,
        String bettingEventType,
        LocalDateTime startDate,
        LocalDateTime created,
        LocalDateTime updated,
        @Deprecated Integer scoreId,
        Integer globalScoreId,
        String gameStatus,
        String quarter,
        String awayTeam,
        String homeTeam,
        Integer awayTeamId,
        Integer homeTeamId,
        Integer globalAwayTeamId,
        Integer globalHomeTeamId,
        Integer awayTeamScore,
        Integer homeTeamScore,
        Integer totalScore,
        Integer awayRotationNumber,
        Integer homeRotationNumber,
        BettingMarket[] bettingMarkets,
        LocalDateTime gameStartTime
) {
}
