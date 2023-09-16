package com.bettrnation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public record AdvancedPlayerSeason(
        Integer playerId, String name, Integer teamId, String team,
        String position, String fantasyPosition, String positionGroup,
        Integer season, Integer seasonType, Integer games, BigDecimal snaps, BigDecimal snapShare,
        Integer snapShareRank, BigDecimal slotRate, Integer slotRateRank, BigDecimal targetSeparation,
        BigDecimal burnRate, BigDecimal airYards, BigDecimal airYardsPerGame, Integer airYardsRank,
        BigDecimal carries, BigDecimal carriesInside10, BigDecimal carriesInside10PerGame, BigDecimal carriesInside5,
        BigDecimal carriesInside5PerGame, BigDecimal carriesPerGame, Integer carriesPerGameRank,
        Integer carriesRank, BigDecimal gameScript, Integer gameScriptRank, BigDecimal goalLineCarries,
        BigDecimal goalLineCarriesPerGame, Integer goalLineCarriesPerGameRank, Integer goalLineCarriesRank,
        BigDecimal productionPremium, Integer productionPremiumRank, BigDecimal redZoneCarries,
        BigDecimal redZoneCarriesPerGame, Integer redZoneCarriesPerGameRank, Integer redZoneCarriesRank,
        BigDecimal rushingTouchdowns, Integer rushingTouchdownsRank, BigDecimal rushingYards,
        Integer rushingYardsRank, BigDecimal rushYardsPerGame, BigDecimal redZoneSnaps, BigDecimal runSnaps,
        BigDecimal passSnaps, BigDecimal snapweightedGameScript, Integer snapweightedGameScriptRank,
        BigDecimal teamPassPlays, Integer teamPassPlaysRank, BigDecimal touchdownRate, BigDecimal WeeklyVolatility,
        Integer weeklyVolatilityRank, @JsonProperty("VOS") BigDecimal vos, @JsonProperty("VOSRank") Integer vosRank,
        BigDecimal yardsPerTarget, Integer yardsPerTargetRank, BigDecimal yardsPerReception, BigDecimal yardsAfterCatch,
        BigDecimal yardsAfterCatchPerGame, BigDecimal yardsAfterCatchPerReception, BigDecimal yardsAfterCatchPerTarget,
        Integer yardsAfterCatchRank, BigDecimal totalTouchdowns, Integer totalTouchdownsRank, BigDecimal totalTouches,
        BigDecimal totalYards, BigDecimal totalYardsPerGame, BigDecimal targets, BigDecimal targetShare, Integer targetShareRank,
        BigDecimal targetsInside10, BigDecimal targetsInside10PerGame, BigDecimal targetsInside5, BigDecimal targetsInside5PerGame,
        BigDecimal targetsPerGame, Integer targetsPerGameRank, Integer targetsRank, BigDecimal slotSnaps, BigDecimal slotYPR,
        Integer slotYPRRank, BigDecimal slotYpt, Integer slotYPTRank, BigDecimal redZoneSnapShare, Integer redZoneSnapShareRank,
        BigDecimal routeParticipation, Integer routeParticipationRank, BigDecimal passRoutes,
        BigDecimal passRoutesPerGame, Integer passRoutesPerGameRank, BigDecimal redZoneReceptions, Integer redZoneReceptionsRank,
        BigDecimal redZoneTargets, BigDecimal redZoneTargetShare, Integer redZoneTargetShareRank, Integer redZoneTargetsRank,
        BigDecimal redZoneTouches, BigDecimal redZoneTouchesPerGame, @JsonProperty("QBRatingWhenTargeted") BigDecimal qbRatingWhenTargeted,
        @JsonProperty("QBRatingWhenTargetedRank") Integer qbRatingWhenTargetedRank, @JsonProperty("ReceivingTDs") BigDecimal receivingTds,
        BigDecimal receivingYards, BigDecimal receivingYardsPerGame, Integer receivingYardsPerGameRank, Integer receivingYardsRank,
        BigDecimal receptions, BigDecimal receptionsPerGame, Integer receptionsPerGameRank, Integer receptionsRank,
        BigDecimal redZoneCatchRate, Integer redZoneCatchRateRank, BigDecimal catchableTargetRate, Integer catchableTargetRateRank,
        BigDecimal catchableTargets, BigDecimal catchRate, Integer catchRateRank, BigDecimal dominatorRating,
        Integer dominatorRatingRank, BigDecimal drops, BigDecimal dropsPerGame, Integer dropsPerGameRank, BigDecimal dropRate,
        Integer dropRateRank, Integer dropsRank, BigDecimal endzoneTargets, Integer endzoneTargetShareRank, BigDecimal accuracyRating,
        Integer accuracyRatingRank, BigDecimal adjustedAttempts, BigDecimal adjustedYardsPerAttempt, Integer adjustedYardsPerAttemptRank,
        BigDecimal airYardsPerAttempt, Integer airYardsPerAttemptRank, BigDecimal attemptsInside10, BigDecimal attemptsInside10PerGame,
        BigDecimal attemptsInside5,
        BigDecimal attemptsInside5PerGame,
        BigDecimal attemptsPerGame,
        BigDecimal catchablePasses,
        BigDecimal catchablePassesPerGame,
        Integer catchablePassesRank,
        BigDecimal completionPercentage,
        Integer completionPercentageRank,
        BigDecimal completions,
        BigDecimal dangerPlays,
        BigDecimal dangerPlaysPerGame,
        Integer dangerPlaysRank,
        BigDecimal deepBallAttempts,
        BigDecimal deepBallAttemptsPerGame,
        Integer deepBallAttemptsPerGameRank,
        Integer deepBallAttemptsRank,
        BigDecimal deepBallCompletionPercentage,
        Integer deepBallCompletionPercentageRank,
        BigDecimal deepBallCompletions,
        BigDecimal droppedPasses,
        Integer droppedPassesRank,
        BigDecimal droppedPassesPerGame,
        BigDecimal dropsPerAttempt,
        Integer dropsPerAttemptRank,
        BigDecimal dropBacks,
        BigDecimal interceptablePasses,
        BigDecimal interceptablePassesPerGame,
        Integer interceptablePassesRank,
        BigDecimal moneyThrows,
        BigDecimal moneyThrowsPerGame,
        Integer moneyThrowsRank,
        BigDecimal passAttempts,
        Integer passAttemptsRank,
        BigDecimal passingTouchdowns,
        Integer passingTouchdownsRank,
        BigDecimal passingYards,
        BigDecimal passingYardsPerGame,
        Integer passingYardsPerGameRank,
        Integer passingYardsRank,
        BigDecimal playactionPassAttempts,
        BigDecimal playactionPassAttemptsPerGame,
        Integer playactionPassAttemptsRank,
        BigDecimal playactionPassCompletionPercentage,
        Integer playactionPassCompletionPercentageRank,
        BigDecimal protectionRate,
        Integer protectionRateRank,
        BigDecimal redZoneAttempts,
        BigDecimal redZoneAttemptsPerGame,
        Integer redZoneAttemptsRank,
        BigDecimal redZoneCompletionPercentage,
        Integer redZoneCompletionPercentageRank,
        BigDecimal redZoneTDtoINTRatio,
        BigDecimal rushingTDs,
        Integer rushingYardsPerGameRank,
        BigDecimal shotgunCompletionPercentage,
        BigDecimal shotgunSnaps,
        BigDecimal underCenterCompletionPercentage,
        BigDecimal underCenterSnaps,
        BigDecimal receiverContestedCatchRate,
        Integer receiverContestedCatchRateRank,
        BigDecimal receiverTargetSeparation,
        Integer receiverTargetSeparationRank,
        BigDecimal receiverYardsAfterTheCatch,
        Integer receiverYardsAfterTheCatchRank,
        BigDecimal receiverYardsAfterTheCatchPerTarget,
        BigDecimal supportingCastEfficiency,
        Integer supportingCastEfficiencyRank,
        BigDecimal totalQBR,
        Integer totalQBRRank,
        BigDecimal trueCompletionPercentage,
        Integer trueCompletionPercentageRank,
        BigDecimal truePasserRating,
        Integer truePasserRatingRank,
        BigDecimal uncatchablePasses,
        BigDecimal uncatchablePassesPerGame,
        Integer uncatchablePassesRank,
        BigDecimal underPressureAttempts,
        Integer underPressureAttemptsRank,
        BigDecimal underPressureAttemptsPerGame,
        BigDecimal pressuredCompletionPercentage,
        Integer pressuredCompletionPercentageRank,
        BigDecimal averageDefendersInTheBox,
        Integer averageDefendersInTheBoxRank,
        BigDecimal baseFrontCarryRate,
        Integer baseFrontCarryRateRank,
        BigDecimal baseFrontYardsPerCarry,
        Integer baseFrontYardsPerCarryRank,
        BigDecimal breakawayRunRate,
        Integer breakawayRunRateRank,
        BigDecimal breakawayRuns,
        BigDecimal breakawayRunsPerGame,
        Integer breakawayRunsPerGameRank,
        Integer breakawayRunsRank,
        BigDecimal evadedTackles,
        BigDecimal evadedTacklesPerGame,
        Integer evadedTacklesPerGameRank,
        Integer evadedTacklesRank,
        BigDecimal jukeRate,
        Integer jukeRateRank,
        BigDecimal lightFrontCarryRate,
        Integer lightFrontCarryRateRank,
        BigDecimal lightFrontYardsPerCarry,
        Integer lightFrontYardsPerCarryRank,
        BigDecimal opportunities,
        BigDecimal opportunityShare,
        Integer opportunityShareRank,
        BigDecimal redZoneOpportunities,
        Integer redZoneTouchesPerGameRank,
        Integer redZoneTouchesRank,
        BigDecimal runBlockingEfficiency,
        Integer runBlockingEfficiencyRank,
        Integer rushYardsPerGameRank,
        BigDecimal shotgunCarryRate,
        Integer shotgunCarryRateRank,
        BigDecimal shotgunYardsPerCarry,
        Integer shotgunYardsPerCarryRank,
        BigDecimal redZoneOpportunityShare,
        Integer redZoneOpportunityShareRank,
        BigDecimal redZoneTDConversionRate,
        Integer redZoneTDConversionRateRank,
        BigDecimal stackedFrontCarryRate,
        Integer stackedFrontCarryRateRank,
        BigDecimal stackedFrontYardsPerCarry,
        Integer stuffedRunsRank,
        BigDecimal stuffedRunRate,
        Integer stuffedRunRateRank,
        BigDecimal teamRunPlays,
        Integer teamRunPlaysRank,
        Integer totalYardsPerGameRank,
        Integer totalYardsRank,
        BigDecimal trueYardsPerCarry,
        Integer trueYardsPerCarryRank,
        BigDecimal underCenterCarryRate,
        Integer underCenterCarryRateRank,
        BigDecimal underCenterYardsPerCarry,
        Integer underCenterYardsPerCarryRank,
        BigDecimal weightedOpportunities,
        Integer weightedOpportunitiesRank,
        BigDecimal weightedOpportunitiesPerGame,
        Integer weightedOpportunitiesPerGameRank,
        BigDecimal yardsCreated,
        BigDecimal yardsCreatedPerGame,
        Integer yardsCreatedPerGameRank,
        BigDecimal yardsCreatedPerCarry,
        Integer yardsCreatedPerCarryRank,
        Integer yardsCreatedRank,
        BigDecimal yardsPerCarry,
        Integer yardsPerCarryRank,
        BigDecimal yardsPerOpportunity,
        BigDecimal yardsPerRouteRun,
        Integer yardsPerRouteRunRank,
        BigDecimal yardsPerTouch,
        Integer yardsPerTouchRank,
        BigDecimal airYardsPerReception,
        BigDecimal airYardsPerTarget,
        BigDecimal cushion,
        Integer cushionRank,
        BigDecimal averageTargetDistance,
        Integer averageTargetDistanceRank,
        BigDecimal burns,
        BigDecimal catchableTargetsPerGame,
        Integer catchableTargetsRank,
        BigDecimal contestedCatchConversionRate,
        Integer contestedCatchConversionRateRank,
        BigDecimal contestedCatches,
        BigDecimal contestedTargets,
        BigDecimal hogRate,
        Integer hogRateRank,
        Integer passSnapsRank,
        Integer runSnapsRank,
        BigDecimal slotCatchRate,
        Integer slotCatchRateRank,
        Integer slotSnapsRank,
        BigDecimal snapweighedGameScript,
        Integer snapweighedGameScriptRank,
        BigDecimal targetPremium,
        Integer targetPremiumRank,
        Integer targetQualityRating,
        Integer targetQualityRatingRank,
        BigDecimal targetAccuracy,
        Integer targetAccuracyRank,
        BigDecimal targetDistance,
        BigDecimal targetDistancePerGame,
        Integer targetDistanceRank,
        Integer trueCatchRate,
        Integer trueCatchRateRank,
        BigDecimal uncatchableTargets,
        BigDecimal uncatchableTargetsPerGame,
        Integer uncatchableTargetsRank,
        BigDecimal weightedTargets,
        Integer weightedTargetsRank,
        Integer receivingTouchdownsRank,
        BigDecimal passerRatingWhenTargeted,
        Integer passerRatingWhenTargetedRank,
        BigDecimal averageDepthOfTarget,
        Integer averageDepthOfTargetRank,
        BigDecimal fantasyPointsPerOpportunity,
        Integer fantasyPointsPerOpportunityRank,
        BigDecimal fantasyPointsPerRouteRun,
        Integer fantasyPointsPerRouteRunRank,
        Integer slotCatchableTargetsRank,
        BigDecimal slotCushion,
        Integer slotCushionRank,
        BigDecimal slotTargetDistance,
        BigDecimal slotTargetAccuracy,
        Integer slotTargetAccuracyRank,
        Integer slotYardsPerTargetRank,
        BigDecimal tightWindowThrows,
        BigDecimal tightWindowThrowRate,
        Integer tightWindowThrowRateRank,
        Integer tightWindowThrowsRank,
        BigDecimal totalYardsPerTarget,
        Integer totalYardsPerTargetRank,
        BigDecimal totalYardsPerRouteRun,
        Integer totalYardsPerRouteRunRank,
        BigDecimal yardsPerGameRank,
        BigDecimal yardsPerReceptionRank
        ) {
}
