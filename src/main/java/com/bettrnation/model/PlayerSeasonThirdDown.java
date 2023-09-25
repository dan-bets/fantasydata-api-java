package com.bettrnation.model;

public record PlayerSeasonThirdDown(
    Integer playerID,
    Integer seasonType,
    Integer season,
    String team,
    Integer number,
    String name,
    String position,
    String positionCategory,
    Integer activated,
    Integer played,
    Integer started,
    Double passingAttempts,
    Double passingCompletions,
    Double passingYards,
    Double passingCompletionPercentage,
    Double passingYardsPerAttempt,
    Double passingYardsPerCompletion,
    Double passingTouchdowns,
    Double passingInterceptions,
    Double passingRating,
    Double passingLong,
    Double passingSacks,
    Double passingSackYards,
    Double rushingAttempts,
    Double rushingYards,
    Double rushingYardsPerAttempt,
    Double rushingTouchdowns,
    Double rushingLong,
    Double receivingTargetsFrom2009,
    Double receptions,
    Double receivingYards,
    Double receivingYardsPerReception,
    Double receivingTouchdowns,
    Double receivingLong,
    Double fumbles,
    Double fumblesLostFrom2003,
    Double puntReturns,
    Double puntReturnYards,
    Double puntReturnYardsPerAttempt,
    Double puntReturnTouchdowns,
    Double puntReturnLong,
    Double kickReturns,
    Double kickReturnYards,
    Double kickReturnYardsPerAttempt,
    Double kickReturnTouchdowns,
    Double kickReturnLong,
    Double soloTackles,
    Double assistedTackles,
    Double tacklesForLossFrom2008,
    Double sacks,
    Double sackYards,
    Double quarterbackHitsFrom2006,
    Double passesDefended,
    Double fumblesForced,
    Double fumblesRecovered,
    Double fumbleReturnYards,
    Double fumbleReturnTouchdowns,
    Double interceptions,
    Double interceptionReturnYards,
    Double interceptionReturnTouchdowns,
    Double blockedKicks,
    Double specialTeamsSoloTackles,
    Double specialTeamsAssistedTackles,
    Double miscSoloTackles,
    Double miscAssistedTackles,
    Double punts,
    Double puntYards,
    Double puntAverage,
    Double fieldGoalsAttempted,
    Double fieldGoalsMade,
    Double fieldGoalsLongestMade,
    Double extraPointsMade,
    Double twoPointConversionPasses,
    Double twoPointConversionRuns,
    Double twoPointConversionReceptions,
    Double fantasyPoints,
    Double fantasyPointsPPR,
    Double receptionPercentage,
    Double receivingYardsPerTarget,
    Double tackles,
    Double offensiveTouchdowns,
    Double defensiveTouchdowns,
    Double specialTeamsTouchdowns,
    Double touchdowns,
    String fantasyPosition,
    Double fieldGoalPercentage,
    Integer playerSeasonID,
    Double fumblesOwnRecoveries,
    Double fumblesOutOfBounds,
    Double kickReturnFairCatches,
    Double puntReturnFairCatches,
    Double puntTouchbacks,
    Double puntInside20,
    Double puntNetAverage,
    Double extraPointsAttempted,
    Double blockedKickReturnTouchdowns,
    Double fieldGoalReturnTouchdowns,
    Double safeties,
    Double fieldGoalsHadBlocked,
    Double puntsHadBlocked,
    Double extraPointsHadBlocked,
    Double puntLong,
    Double blockedKickReturnYards,
    Double fieldGoalReturnYards,
    Double puntNetYards,
    Double specialTeamsFumblesForced,
    Double specialTeamsFumblesRecovered,
    Double miscFumblesForced,
    Double miscFumblesRecovered,
    String shortName,
    Double safetiesAllowed,
    Integer temperature,
    Integer humidity,
    Integer windSpeed,
    Integer offensiveSnapsPlayedFrom2012,
    Integer defensiveSnapsPlayedFrom2012,
    Integer specialTeamsSnapsPlayedFrom2012,
    Integer offensiveTeamSnapsFrom2012,
    Integer defensiveTeamSnapsFrom2012,
    Integer specialTeamsTeamSnapsFrom2012,
    Double auctionValue,
    Double auctionValuePPR,
    Double twoPointConversionReturnsFrom2015,
    Double fantasyPointsFanDuel,
    Double fieldGoalsMade0to19,
    Double fieldGoalsMade20to29,
    Double fieldGoalsMade30to39,
    Double fieldGoalsMade40to49,
    Double fieldGoalsMade50Plus,
    Double fantasyPointsDraftKings,
    Double fantasyPointsYahoo,
    Double averageDraftPosition,
    Double averageDraftPositionPPR,
    Integer teamID,
    Integer globalTeamID,
    Double fantasyPointsFantasyDraft,
    ScoringDetail[] scoringDetails,
    Double averageDraftPositionRookie,
    Double averageDraftPositionDynasty,
    Double averageDraftPosition2QB,
    Integer offensiveFumbleRecoveryTouchdowns) {}
