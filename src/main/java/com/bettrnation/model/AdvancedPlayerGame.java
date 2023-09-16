package com.bettrnation.model;

import java.math.BigDecimal;

public record AdvancedPlayerGame(
        Integer playerId, String name, Integer teamId, String team,
        String position, String fantasyPosition, String positionGroup,
        Integer season, Integer seasonType, Integer week, String opponent,
        Integer opponentId, BigDecimal snaps, BigDecimal snapShare, BigDecimal passingAttempts,
        BigDecimal completions, BigDecimal completionPercentage, BigDecimal passingYards,
        BigDecimal passingYardsPerAttempt, BigDecimal passingTouchdowns, BigDecimal passingTDs,
        BigDecimal interceptions, BigDecimal redZoneAttempts, BigDecimal redZoneCompletionPercentage,
        BigDecimal deepBallAttempts, BigDecimal deepBallCompletions, BigDecimal carries,
        BigDecimal rushingYards, BigDecimal rushingTouchdowns, BigDecimal targets,
        BigDecimal receptions, BigDecimal receivingYards, BigDecimal receivingTouchdowns,
        BigDecimal totalYards, BigDecimal totalTouches, BigDecimal yardsPerTouch,
        BigDecimal opportunities, BigDecimal opportunityShare, BigDecimal totalTouchdowns, BigDecimal evadedTackles,
        BigDecimal jukeRate, BigDecimal catchRate, BigDecimal targetShare, BigDecimal hogRate,
        BigDecimal contestedTargets, BigDecimal contestedCatches, BigDecimal redZoneCarries,
        BigDecimal redZoneTargets, BigDecimal redZoneOpportunities, BigDecimal redZoneTouches, BigDecimal redZoneReceptions,
        BigDecimal redZoneCatchRate, BigDecimal yardsPerCarry, BigDecimal yardsPerTarget, BigDecimal yardsPerOpportunity,
        BigDecimal yardsPerReception, BigDecimal endZoneTargets, BigDecimal routesRun, BigDecimal burns,
        BigDecimal hurries, BigDecimal yardsCreated, BigDecimal passAttemptsInside5, BigDecimal passAttemptsInside10,
        BigDecimal carriesInside5, BigDecimal carriesInside10, BigDecimal targetsInside5, BigDecimal targetsInside10,
        BigDecimal primaryCorner, BigDecimal routesDefended, BigDecimal targetsAllowed, BigDecimal receptionsAllowed,
        BigDecimal yardsAllowed, BigDecimal burnsCB, BigDecimal passBreakups, BigDecimal interceptionsCB,
        BigDecimal wrMatchup, BigDecimal fantasyPoints, Integer fantasyPointsRank, BigDecimal fantasyPointsPerAttempt,
        BigDecimal fantasyPointsPerTarget, BigDecimal fantasyPointsPerOpportunity, BigDecimal fantasyPointsAllowed,
        Integer fantasyPointsAllowedWeekRank
) { }

