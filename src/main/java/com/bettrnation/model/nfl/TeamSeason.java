package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record TeamSeason(
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Team") String team,
    @SerializedName("Score") Integer score,
    @SerializedName("OpponentScore") Integer opponentScore,
    @SerializedName("TotalScore") Integer totalScore,
    @SerializedName("Temperature") Integer temperature,
    @SerializedName("Humidity") Integer humidity,
    @SerializedName("WindSpeed") Integer windSpeed,
    @SerializedName("OverUnder") BigDecimal overUnder,
    @SerializedName("PointSpread") BigDecimal pointSpread,
    @SerializedName("ScoreQuarter1") Integer scoreQuarter1,
    @SerializedName("ScoreQuarter2") Integer scoreQuarter2,
    @SerializedName("ScoreQuarter3") Integer scoreQuarter3,
    @SerializedName("ScoreQuarter4") Integer scoreQuarter4,
    @SerializedName("ScoreOvertime") Integer scoreOvertime,
    @SerializedName("TimeOfPossession") String timeOfPossession,
    @SerializedName("FirstDowns") Integer firstDowns,
    @SerializedName("FirstDownsByRushing") Integer firstDownsByRushing,
    @SerializedName("FirstDownsByPassing") Integer firstDownsByPassing,
    @SerializedName("FirstDownsByPenalty") Integer firstDownsByPenalty,
    @SerializedName("OffensivePlays") Integer offensivePlays,
    @SerializedName("OffensiveYards") Integer offensiveYards,
    @SerializedName("OffensiveYardsPerPlay") BigDecimal offensiveYardsPerPlay,
    @SerializedName("Touchdowns") Integer touchdowns,
    @SerializedName("RushingAttempts") Integer rushingAttempts,
    @SerializedName("RushingYards") Integer rushingYards,
    @SerializedName("RushingYardsPerAttempt") BigDecimal rushingYardsPerAttempt,
    @SerializedName("RushingTouchdowns") Integer rushingTouchdowns,
    @SerializedName("PassingAttempts") Integer passingAttempts,
    @SerializedName("PassingCompletions") Integer passingCompletions,
    @SerializedName("PassingYards") Integer passingYards,
    @SerializedName("PassingTouchdowns") Integer passingTouchdowns,
    @SerializedName("PassingInterceptions") Integer passingInterceptions,
    @SerializedName("PassingYardsPerAttempt") BigDecimal passingYardsPerAttempt,
    @SerializedName("PassingYardsPerCompletion") BigDecimal passingYardsPerCompletion,
    @SerializedName("CompletionPercentage") BigDecimal completionPercentage,
    @SerializedName("PasserRating") BigDecimal passerRating,
    @SerializedName("ThirdDownAttempts") Integer thirdDownAttempts,
    @SerializedName("ThirdDownConversions") Integer thirdDownConversions,
    @SerializedName("ThirdDownPercentage") BigDecimal thirdDownPercentage,
    @SerializedName("FourthDownAttempts") Integer fourthDownAttempts,
    @SerializedName("FourthDownConversions") Integer fourthDownConversions,
    @SerializedName("FourthDownPercentage") BigDecimal fourthDownPercentage,
    @SerializedName("RedZoneAttempts") Integer redZoneAttempts,
    @SerializedName("RedZoneConversions") Integer redZoneConversions,
    @SerializedName("GoalToGoAttempts") Integer goalToGoAttempts,
    @SerializedName("GoalToGoConversions") Integer goalToGoConversions,
    @SerializedName("ReturnYards") Integer returnYards,
    @SerializedName("Penalties") Integer penalties,
    @SerializedName("PenaltyYards") Integer penaltyYards,
    @SerializedName("Fumbles") Integer fumbles,
    @SerializedName("FumblesLost") Integer fumblesLost,
    @SerializedName("TimesSacked") Integer timesSacked,
    @SerializedName("TimesSackedYards") Integer timesSackedYards,
    @SerializedName("QuarterbackHits") Integer quarterbackHits,
    @SerializedName("TacklesForLoss") Integer tacklesForLoss,
    @SerializedName("Safeties") Integer safeties,
    @SerializedName("Punts") Integer punts,
    @SerializedName("PuntYards") Integer puntYards,
    @SerializedName("PuntAverage") BigDecimal puntAverage,
    @SerializedName("Giveaways") Integer giveaways,
    @SerializedName("Takeaways") Integer takeaways,
    @SerializedName("TurnoverDifferential") Integer turnoverDifferential,
    @SerializedName("OpponentScoreQuarter1") Integer opponentScoreQuarter1,
    @SerializedName("OpponentScoreQuarter2") Integer opponentScoreQuarter2,
    @SerializedName("OpponentScoreQuarter3") Integer opponentScoreQuarter3,
    @SerializedName("OpponentScoreQuarter4") Integer opponentScoreQuarter4,
    @SerializedName("OpponentScoreOvertime") Integer opponentScoreOvertime,
    @SerializedName("OpponentTimeOfPossession") String opponentTimeOfPossession,
    @SerializedName("OpponentFirstDowns") Integer opponentFirstDowns,
    @SerializedName("OpponentFirstDownsByRushing") Integer opponentFirstDownsByRushing,
    @SerializedName("OpponentFirstDownsByPassing") Integer opponentFirstDownsByPassing,
    @SerializedName("OpponentFirstDownsByPenalty") Integer opponentFirstDownsByPenalty,
    @SerializedName("OpponentOffensivePlays") Integer opponentOffensivePlays,
    @SerializedName("OpponentOffensiveYards") Integer opponentOffensiveYards,
    @SerializedName("OpponentOffensiveYardsPerPlay") BigDecimal opponentOffensiveYardsPerPlay,
    @SerializedName("OpponentTouchdowns") Integer opponentTouchdowns,
    @SerializedName("OpponentRushingAttempts") Integer opponentRushingAttempts,
    @SerializedName("OpponentRushingYards") Integer opponentRushingYards,
    @SerializedName("OpponentRushingYardsPerAttempt") BigDecimal opponentRushingYardsPerAttempt,
    @SerializedName("OpponentRushingTouchdowns") Integer opponentRushingTouchdowns,
    @SerializedName("OpponentPassingAttempts") Integer opponentPassingAttempts,
    @SerializedName("OpponentPassingCompletions") Integer opponentPassingCompletions,
    @SerializedName("OpponentPassingYards") Integer opponentPassingYards,
    @SerializedName("OpponentPassingTouchdowns") Integer opponentPassingTouchdowns,
    @SerializedName("OpponentPassingInterceptions") Integer opponentPassingInterceptions,
    @SerializedName("OpponentPassingYardsPerAttempt") BigDecimal opponentPassingYardsPerAttempt,
    @SerializedName("OpponentPassingYardsPerCompletion")
        BigDecimal opponentPassingYardsPerCompletion,
    @SerializedName("OpponentCompletionPercentage") BigDecimal opponentCompletionPercentage,
    @SerializedName("OpponentPasserRating") BigDecimal opponentPasserRating,
    @SerializedName("OpponentThirdDownAttempts") Integer opponentThirdDownAttempts,
    @SerializedName("OpponentThirdDownConversions") Integer opponentThirdDownConversions,
    @SerializedName("OpponentThirdDownPercentage") BigDecimal opponentThirdDownPercentage,
    @SerializedName("OpponentFourthDownAttempts") Integer opponentFourthDownAttempts,
    @SerializedName("OpponentFourthDownConversions") Integer opponentFourthDownConversions,
    @SerializedName("OpponentFourthDownPercentage") BigDecimal opponentFourthDownPercentage,
    @SerializedName("OpponentRedZoneAttempts") Integer opponentRedZoneAttempts,
    @SerializedName("OpponentRedZoneConversions") Integer opponentRedZoneConversions,
    @SerializedName("OpponentGoalToGoAttempts") Integer opponentGoalToGoAttempts,
    @SerializedName("OpponentGoalToGoConversions") Integer opponentGoalToGoConversions,
    @SerializedName("OpponentReturnYards") Integer opponentReturnYards,
    @SerializedName("OpponentPenalties") Integer opponentPenalties,
    @SerializedName("OpponentPenaltyYards") Integer opponentPenaltyYards,
    @SerializedName("OpponentFumbles") Integer opponentFumbles,
    @SerializedName("OpponentFumblesLost") Integer opponentFumblesLost,
    @SerializedName("OpponentTimesSacked") Integer opponentTimesSacked,
    @SerializedName("OpponentTimesSackedYards") Integer opponentTimesSackedYards,
    @SerializedName("OpponentQuarterbackHits") Integer opponentQuarterbackHits,
    @SerializedName("OpponentTacklesForLoss") Integer opponentTacklesForLoss,
    @SerializedName("OpponentSafeties") Integer opponentSafeties,
    @SerializedName("OpponentPunts") Integer opponentPunts,
    @SerializedName("OpponentPuntYards") Integer opponentPuntYards,
    @SerializedName("OpponentPuntAverage") BigDecimal opponentPuntAverage,
    @SerializedName("OpponentGiveaways") Integer opponentGiveaways,
    @SerializedName("OpponentTakeaways") Integer opponentTakeaways,
    @SerializedName("OpponentTurnoverDifferential") Integer opponentTurnoverDifferential,
    @SerializedName("RedZonePercentage") BigDecimal redZonePercentage,
    @SerializedName("GoalToGoPercentage") BigDecimal goalToGoPercentage,
    @SerializedName("QuarterbackHitsDifferential") Integer quarterbackHitsDifferential,
    @SerializedName("TacklesForLossDifferential") Integer tacklesForLossDifferential,
    @SerializedName("QuarterbackSacksDifferential") Integer quarterbackSacksDifferential,
    @SerializedName("TacklesForLossPercentage") BigDecimal tacklesForLossPercentage,
    @SerializedName("QuarterbackHitsPercentage") BigDecimal quarterbackHitsPercentage,
    @SerializedName("TimesSackedPercentage") BigDecimal timesSackedPercentage,
    @SerializedName("OpponentRedZonePercentage") BigDecimal opponentRedZonePercentage,
    @SerializedName("OpponentGoalToGoPercentage") BigDecimal opponentGoalToGoPercentage,
    @SerializedName("OpponentQuarterbackHitsDifferential")
        Integer opponentQuarterbackHitsDifferential,
    @SerializedName("OpponentTacklesForLossDifferential")
        Integer opponentTacklesForLossDifferential,
    @SerializedName("OpponentQuarterbackSacksDifferential")
        Integer opponentQuarterbackSacksDifferential,
    @SerializedName("OpponentTacklesForLossPercentage") BigDecimal opponentTacklesForLossPercentage,
    @SerializedName("OpponentQuarterbackHitsPercentage")
        BigDecimal opponentQuarterbackHitsPercentage,
    @SerializedName("OpponentTimesSackedPercentage") BigDecimal opponentTimesSackedPercentage,
    @SerializedName("Kickoffs") Integer kickoffs,
    @SerializedName("KickoffsInEndZone") Integer kickoffsInEndZone,
    @SerializedName("KickoffTouchbacks") Integer kickoffTouchbacks,
    @SerializedName("PuntsHadBlocked") Integer puntsHadBlocked,
    @SerializedName("PuntNetAverage") BigDecimal puntNetAverage,
    @SerializedName("ExtraPointKickingAttempts") Integer extraPointKickingAttempts,
    @SerializedName("ExtraPointKickingConversions") Integer extraPointKickingConversions,
    @SerializedName("ExtraPointsHadBlocked") Integer extraPointsHadBlocked,
    @SerializedName("ExtraPointPassingAttempts") Integer extraPointPassingAttempts,
    @SerializedName("ExtraPointPassingConversions") Integer extraPointPassingConversions,
    @SerializedName("ExtraPointRushingAttempts") Integer extraPointRushingAttempts,
    @SerializedName("ExtraPointRushingConversions") Integer extraPointRushingConversions,
    @SerializedName("FieldGoalAttempts") Integer fieldGoalAttempts,
    @SerializedName("FieldGoalsMade") Integer fieldGoalsMade,
    @SerializedName("FieldGoalsHadBlocked") Integer fieldGoalsHadBlocked,
    @SerializedName("PuntReturns") Integer puntReturns,
    @SerializedName("PuntReturnYards") Integer puntReturnYards,
    @SerializedName("KickReturns") Integer kickReturns,
    @SerializedName("KickReturnYards") Integer kickReturnYards,
    @SerializedName("InterceptionReturns") Integer interceptionReturns,
    @SerializedName("InterceptionReturnYards") Integer interceptionReturnYards,
    @SerializedName("OpponentKickoffs") Integer opponentKickoffs,
    @SerializedName("OpponentKickoffsInEndZone") Integer opponentKickoffsInEndZone,
    @SerializedName("OpponentKickoffTouchbacks") Integer opponentKickoffTouchbacks,
    @SerializedName("OpponentPuntsHadBlocked") Integer opponentPuntsHadBlocked,
    @SerializedName("OpponentPuntNetAverage") BigDecimal opponentPuntNetAverage,
    @SerializedName("OpponentExtraPointKickingAttempts") Integer opponentExtraPointKickingAttempts,
    @SerializedName("OpponentExtraPointKickingConversions")
        Integer opponentExtraPointKickingConversions,
    @SerializedName("OpponentExtraPointsHadBlocked") Integer opponentExtraPointsHadBlocked,
    @SerializedName("OpponentExtraPointPassingAttempts") Integer opponentExtraPointPassingAttempts,
    @SerializedName("OpponentExtraPointPassingConversions")
        Integer opponentExtraPointPassingConversions,
    @SerializedName("OpponentExtraPointRushingAttempts") Integer opponentExtraPointRushingAttempts,
    @SerializedName("OpponentExtraPointRushingConversions")
        Integer opponentExtraPointRushingConversions,
    @SerializedName("OpponentFieldGoalAttempts") Integer opponentFieldGoalAttempts,
    @SerializedName("OpponentFieldGoalsMade") Integer opponentFieldGoalsMade,
    @SerializedName("OpponentFieldGoalsHadBlocked") Integer opponentFieldGoalsHadBlocked,
    @SerializedName("OpponentPuntReturns") Integer opponentPuntReturns,
    @SerializedName("OpponentPuntReturnYards") Integer opponentPuntReturnYards,
    @SerializedName("OpponentKickReturns") Integer opponentKickReturns,
    @SerializedName("OpponentKickReturnYards") Integer opponentKickReturnYards,
    @SerializedName("OpponentInterceptionReturns") Integer opponentInterceptionReturns,
    @SerializedName("OpponentInterceptionReturnYards") Integer opponentInterceptionReturnYards,
    @SerializedName("SoloTackles") Integer soloTackles,
    @SerializedName("AssistedTackles") Integer assistedTackles,
    @SerializedName("Sacks") Integer sacks,
    @SerializedName("SackYards") Integer sackYards,
    @SerializedName("PassesDefended") Integer passesDefended,
    @SerializedName("FumblesForced") Integer fumblesForced,
    @SerializedName("FumblesRecovered") Integer fumblesRecovered,
    @SerializedName("FumbleReturnYards") Integer fumbleReturnYards,
    @SerializedName("FumbleReturnTouchdowns") Integer fumbleReturnTouchdowns,
    @SerializedName("InterceptionReturnTouchdowns") Integer interceptionReturnTouchdowns,
    @SerializedName("BlockedKicks") Integer blockedKicks,
    @SerializedName("PuntReturnTouchdowns") Integer puntReturnTouchdowns,
    @SerializedName("PuntReturnLong") Integer puntReturnLong,
    @SerializedName("KickReturnTouchdowns") Integer kickReturnTouchdowns,
    @SerializedName("KickReturnLong") Integer kickReturnLong,
    @SerializedName("BlockedKickReturnYards") Integer blockedKickReturnYards,
    @SerializedName("BlockedKickReturnTouchdowns") Integer blockedKickReturnTouchdowns,
    @SerializedName("FieldGoalReturnYards") Integer fieldGoalReturnYards,
    @SerializedName("FieldGoalReturnTouchdowns") Integer fieldGoalReturnTouchdowns,
    @SerializedName("PuntNetYards") Integer puntNetYards,
    @SerializedName("OpponentSoloTackles") Integer opponentSoloTackles,
    @SerializedName("OpponentAssistedTackles") Integer opponentAssistedTackles,
    @SerializedName("OpponentSacks") Integer opponentSacks,
    @SerializedName("OpponentSackYards") Integer opponentSackYards,
    @SerializedName("OpponentPassesDefended") Integer opponentPassesDefended,
    @SerializedName("OpponentFumblesForced") Integer opponentFumblesForced,
    @SerializedName("OpponentFumblesRecovered") Integer opponentFumblesRecovered,
    @SerializedName("OpponentFumbleReturnYards") Integer opponentFumbleReturnYards,
    @SerializedName("OpponentFumbleReturnTouchdowns") Integer opponentFumbleReturnTouchdowns,
    @SerializedName("OpponentInterceptionReturnTouchdowns")
        Integer opponentInterceptionReturnTouchdowns,
    @SerializedName("OpponentBlockedKicks") Integer opponentBlockedKicks,
    @SerializedName("OpponentPuntReturnTouchdowns") Integer opponentPuntReturnTouchdowns,
    @SerializedName("OpponentPuntReturnLong") Integer opponentPuntReturnLong,
    @SerializedName("OpponentKickReturnTouchdowns") Integer opponentKickReturnTouchdowns,
    @SerializedName("OpponentKickReturnLong") Integer opponentKickReturnLong,
    @SerializedName("OpponentBlockedKickReturnYards") Integer opponentBlockedKickReturnYards,
    @SerializedName("OpponentBlockedKickReturnTouchdowns")
        Integer opponentBlockedKickReturnTouchdowns,
    @SerializedName("OpponentFieldGoalReturnYards") Integer opponentFieldGoalReturnYards,
    @SerializedName("OpponentFieldGoalReturnTouchdowns") Integer opponentFieldGoalReturnTouchdowns,
    @SerializedName("OpponentPuntNetYards") Integer opponentPuntNetYards,
    @SerializedName("TeamName") String teamName,
    @SerializedName("Games") Integer games,
    @SerializedName("PassingDropbacks") Integer passingDropbacks,
    @SerializedName("OpponentPassingDropbacks") Integer opponentPassingDropbacks,
    @SerializedName("TeamSeasonID") Integer teamSeasonID,
    @SerializedName("PointDifferential") Integer pointDifferential,
    @SerializedName("PassingInterceptionPercentage") BigDecimal passingInterceptionPercentage,
    @SerializedName("PuntReturnAverage") BigDecimal puntReturnAverage,
    @SerializedName("KickReturnAverage") BigDecimal kickReturnAverage,
    @SerializedName("ExtraPointPercentage") BigDecimal extraPointPercentage,
    @SerializedName("FieldGoalPercentage") BigDecimal fieldGoalPercentage,
    @SerializedName("OpponentPassingInterceptionPercentage")
        BigDecimal opponentPassingInterceptionPercentage,
    @SerializedName("OpponentPuntReturnAverage") BigDecimal opponentPuntReturnAverage,
    @SerializedName("OpponentKickReturnAverage") BigDecimal opponentKickReturnAverage,
    @SerializedName("OpponentExtraPointPercentage") BigDecimal opponentExtraPointPercentage,
    @SerializedName("OpponentFieldGoalPercentage") BigDecimal opponentFieldGoalPercentage,
    @SerializedName("PenaltyYardDifferential") Integer penaltyYardDifferential,
    @SerializedName("PuntReturnYardDifferential") Integer puntReturnYardDifferential,
    @SerializedName("KickReturnYardDifferential") Integer kickReturnYardDifferential,
    @SerializedName("TwoPointConversionReturns") Integer twoPointConversionReturns,
    @SerializedName("OpponentTwoPointConversionReturns") Integer opponentTwoPointConversionReturns,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("TeamStatID") Integer teamStatID) {}
