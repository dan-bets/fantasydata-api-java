package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

public record PlayerSeasonThirdDown(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Team") String team,
    @SerializedName("Number") Integer number,
    @SerializedName("Name") String name,
    @SerializedName("Position") String position,
    @SerializedName("PositionCategory") String positionCategory,
    @SerializedName("Activated") Integer activated,
    @SerializedName("Played") Integer played,
    @SerializedName("Started") Integer started,
    @SerializedName("PassingAttempts") BigDecimal passingAttempts,
    @SerializedName("PassingCompletions") BigDecimal passingCompletions,
    @SerializedName("PassingYards") BigDecimal passingYards,
    @SerializedName("PassingCompletionPercentage") BigDecimal passingCompletionPercentage,
    @SerializedName("PassingYardsPerAttempt") BigDecimal passingYardsPerAttempt,
    @SerializedName("PassingYardsPerCompletion") BigDecimal passingYardsPerCompletion,
    @SerializedName("PassingTouchdowns") BigDecimal passingTouchdowns,
    @SerializedName("PassingInterceptions") BigDecimal passingInterceptions,
    @SerializedName("PassingRating") BigDecimal passingRating,
    @SerializedName("PassingLong") BigDecimal passingLong,
    @SerializedName("PassingSacks") BigDecimal passingSacks,
    @SerializedName("PassingSackYards") BigDecimal passingSackYards,
    @SerializedName("RushingAttempts") BigDecimal rushingAttempts,
    @SerializedName("RushingYards") BigDecimal rushingYards,
    @SerializedName("RushingYardsPerAttempt") BigDecimal rushingYardsPerAttempt,
    @SerializedName("RushingTouchdowns") BigDecimal rushingTouchdowns,
    @SerializedName("RushingLong") BigDecimal rushingLong,
    @SerializedName("ReceivingTargets") BigDecimal receivingTargets,
    @SerializedName("Receptions") BigDecimal receptions,
    @SerializedName("ReceivingYards") BigDecimal receivingYards,
    @SerializedName("ReceivingYardsPerReception") BigDecimal receivingYardsPerReception,
    @SerializedName("ReceivingTouchdowns") BigDecimal receivingTouchdowns,
    @SerializedName("ReceivingLong") BigDecimal receivingLong,
    @SerializedName("Fumbles") BigDecimal fumbles,
    @SerializedName("FumblesLost") BigDecimal fumblesLost,
    @SerializedName("PuntReturns") BigDecimal puntReturns,
    @SerializedName("PuntReturnYards") BigDecimal puntReturnYards,
    @SerializedName("PuntReturnYardsPerAttempt") BigDecimal puntReturnYardsPerAttempt,
    @SerializedName("PuntReturnTouchdowns") BigDecimal puntReturnTouchdowns,
    @SerializedName("PuntReturnLong") BigDecimal puntReturnLong,
    @SerializedName("KickReturns") BigDecimal kickReturns,
    @SerializedName("KickReturnYards") BigDecimal kickReturnYards,
    @SerializedName("KickReturnYardsPerAttempt") BigDecimal kickReturnYardsPerAttempt,
    @SerializedName("KickReturnTouchdowns") BigDecimal kickReturnTouchdowns,
    @SerializedName("KickReturnLong") BigDecimal kickReturnLong,
    @SerializedName("SoloTackles") BigDecimal soloTackles,
    @SerializedName("AssistedTackles") BigDecimal assistedTackles,
    @SerializedName("TacklesForLoss") BigDecimal tacklesForLoss,
    @SerializedName("Sacks") BigDecimal sacks,
    @SerializedName("SackYards") BigDecimal sackYards,
    @SerializedName("QuarterbackHits") BigDecimal quarterbackHits,
    @SerializedName("PassesDefended") BigDecimal passesDefended,
    @SerializedName("FumblesForced") BigDecimal fumblesForced,
    @SerializedName("FumblesRecovered") BigDecimal fumblesRecovered,
    @SerializedName("FumbleReturnYards") BigDecimal fumbleReturnYards,
    @SerializedName("FumbleReturnTouchdowns") BigDecimal fumbleReturnTouchdowns,
    @SerializedName("Interceptions") BigDecimal interceptions,
    @SerializedName("InterceptionReturnYards") BigDecimal interceptionReturnYards,
    @SerializedName("InterceptionReturnTouchdowns") BigDecimal interceptionReturnTouchdowns,
    @SerializedName("BlockedKicks") BigDecimal blockedKicks,
    @SerializedName("SpecialTeamsSoloTackles") BigDecimal specialTeamsSoloTackles,
    @SerializedName("SpecialTeamsAssistedTackles") BigDecimal specialTeamsAssistedTackles,
    @SerializedName("MiscSoloTackles") BigDecimal miscSoloTackles,
    @SerializedName("MiscAssistedTackles") BigDecimal miscAssistedTackles,
    @SerializedName("Punts") BigDecimal punts,
    @SerializedName("PuntYards") BigDecimal puntYards,
    @SerializedName("PuntAverage") BigDecimal puntAverage,
    @SerializedName("FieldGoalsAttempted") BigDecimal fieldGoalsAttempted,
    @SerializedName("FieldGoalsMade") BigDecimal fieldGoalsMade,
    @SerializedName("FieldGoalsLongestMade") BigDecimal fieldGoalsLongestMade,
    @SerializedName("ExtraPointsMade") BigDecimal extraPointsMade,
    @SerializedName("TwoPointConversionPasses") BigDecimal twoPointConversionPasses,
    @SerializedName("TwoPointConversionRuns") BigDecimal twoPointConversionRuns,
    @SerializedName("TwoPointConversionReceptions") BigDecimal twoPointConversionReceptions,
    @SerializedName("FantasyPoints") BigDecimal fantasyPoints,
    @SerializedName("FantasyPointsPPR") BigDecimal fantasyPointsPPR,
    @SerializedName("ReceptionPercentage") BigDecimal receptionPercentage,
    @SerializedName("ReceivingYardsPerTarget") BigDecimal receivingYardsPerTarget,
    @SerializedName("Tackles") BigDecimal tackles,
    @SerializedName("OffensiveTouchdowns") BigDecimal offensiveTouchdowns,
    @SerializedName("DefensiveTouchdowns") BigDecimal defensiveTouchdowns,
    @SerializedName("SpecialTeamsTouchdowns") BigDecimal specialTeamsTouchdowns,
    @SerializedName("Touchdowns") BigDecimal touchdowns,
    @SerializedName("FantasyPosition") String fantasyPosition,
    @SerializedName("FieldGoalPercentage") BigDecimal fieldGoalPercentage,
    @SerializedName("PlayerSeasonID") Integer playerSeasonID,
    @SerializedName("FumblesOwnRecoveries") BigDecimal fumblesOwnRecoveries,
    @SerializedName("FumblesOutOfBounds") BigDecimal fumblesOutOfBounds,
    @SerializedName("KickReturnFairCatches") BigDecimal kickReturnFairCatches,
    @SerializedName("PuntReturnFairCatches") BigDecimal puntReturnFairCatches,
    @SerializedName("PuntTouchbacks") BigDecimal puntTouchbacks,
    @SerializedName("PuntInside20") BigDecimal puntInside20,
    @SerializedName("PuntNetAverage") BigDecimal puntNetAverage,
    @SerializedName("ExtraPointsAttempted") BigDecimal extraPointsAttempted,
    @SerializedName("BlockedKickReturnTouchdowns") BigDecimal blockedKickReturnTouchdowns,
    @SerializedName("FieldGoalReturnTouchdowns") BigDecimal fieldGoalReturnTouchdowns,
    @SerializedName("Safeties") BigDecimal safeties,
    @SerializedName("FieldGoalsHadBlocked") BigDecimal fieldGoalsHadBlocked,
    @SerializedName("PuntsHadBlocked") BigDecimal puntsHadBlocked,
    @SerializedName("ExtraPointsHadBlocked") BigDecimal extraPointsHadBlocked,
    @SerializedName("PuntLong") BigDecimal puntLong,
    @SerializedName("BlockedKickReturnYards") BigDecimal blockedKickReturnYards,
    @SerializedName("FieldGoalReturnYards") BigDecimal fieldGoalReturnYards,
    @SerializedName("PuntNetYards") BigDecimal puntNetYards,
    @SerializedName("SpecialTeamsFumblesForced") BigDecimal specialTeamsFumblesForced,
    @SerializedName("SpecialTeamsFumblesRecovered") BigDecimal specialTeamsFumblesRecovered,
    @SerializedName("MiscFumblesForced") BigDecimal miscFumblesForced,
    @SerializedName("MiscFumblesRecovered") BigDecimal miscFumblesRecovered,
    @SerializedName("ShortName") String shortName,
    @SerializedName("SafetiesAllowed") BigDecimal safetiesAllowed,
    @SerializedName("Temperature") Integer temperature,
    @SerializedName("Humidity") Integer humidity,
    @SerializedName("WindSpeed") Integer windSpeed,
    @SerializedName("OffensiveSnapsPlayed") Integer offensiveSnapsPlayed,
    @SerializedName("DefensiveSnapsPlayed") Integer defensiveSnapsPlayed,
    @SerializedName("SpecialTeamsSnapsPlayed") Integer specialTeamsSnapsPlayed,
    @SerializedName("OffensiveTeamSnaps") Integer offensiveTeamSnaps,
    @SerializedName("DefensiveTeamSnaps") Integer defensiveTeamSnaps,
    @SerializedName("SpecialTeamsTeamSnaps") Integer specialTeamsTeamSnaps,
    @SerializedName("AuctionValue") BigDecimal auctionValue,
    @SerializedName("AuctionValuePPR") BigDecimal auctionValuePPR,
    @SerializedName("TwoPointConversionReturns") BigDecimal twoPointConversionReturns,
    @SerializedName("FantasyPointsFanDuel") BigDecimal fantasyPointsFanDuel,
    @SerializedName("FieldGoalsMade0to19") BigDecimal fieldGoalsMade0to19,
    @SerializedName("FieldGoalsMade20to29") BigDecimal fieldGoalsMade20to29,
    @SerializedName("FieldGoalsMade30to39") BigDecimal fieldGoalsMade30to39,
    @SerializedName("FieldGoalsMade40to49") BigDecimal fieldGoalsMade40to49,
    @SerializedName("FieldGoalsMade50Plus") BigDecimal fieldGoalsMade50Plus,
    @SerializedName("FantasyPointsDraftKings") BigDecimal fantasyPointsDraftKings,
    @SerializedName("FantasyPointsYahoo") BigDecimal fantasyPointsYahoo,
    @SerializedName("AverageDraftPosition") BigDecimal averageDraftPosition,
    @SerializedName("AverageDraftPositionPPR") BigDecimal averageDraftPositionPPR,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("FantasyPointsFantasyDraft") BigDecimal fantasyPointsFantasyDraft,
    @SerializedName("ScoringDetails") List<ScoringDetail> scoringDetails,
    @SerializedName("AverageDraftPositionRookie") BigDecimal averageDraftPositionRookie,
    @SerializedName("AverageDraftPositionDynasty") BigDecimal averageDraftPositionDynasty,
    @SerializedName("AverageDraftPosition2QB") BigDecimal averageDraftPosition2QB,
    @SerializedName("OffensiveFumbleRecoveryTouchdowns")
        Integer offensiveFumbleRecoveryTouchdowns) {}
