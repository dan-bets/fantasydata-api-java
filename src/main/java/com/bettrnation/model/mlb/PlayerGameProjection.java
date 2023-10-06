package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record PlayerGameProjection(
    @SerializedName("StatID") Integer statID,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Name") String name,
    @SerializedName("Team") String team,
    @SerializedName("Position") String position,
    @SerializedName("PositionCategory") String positionCategory,
    @SerializedName("Started") Integer started,
    @SerializedName("BattingOrder") Integer battingOrder,
    @SerializedName("FanDuelSalary") Integer fanDuelSalary,
    @SerializedName("DraftKingsSalary") Integer draftKingsSalary,
    @SerializedName("FantasyDataSalary") Integer fantasyDataSalary,
    @SerializedName("YahooSalary") Integer yahooSalary,
    @SerializedName("InjuryStatus") String injuryStatus,
    @SerializedName("InjuryBodyPart") String injuryBodyPart,
    @SerializedName("InjuryStartDate") String injuryStartDate,
    @SerializedName("InjuryNotes") String injuryNotes,
    @SerializedName("FanDuelPosition") String fanDuelPosition,
    @SerializedName("DraftKingsPosition") String draftKingsPosition,
    @SerializedName("YahooPosition") String yahooPosition,
    @SerializedName("OpponentRank") Integer opponentRank,
    @SerializedName("OpponentPositionRank") Integer opponentPositionRank,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("FantasyDraftSalary") Integer fantasyDraftSalary,
    @SerializedName("FantasyDraftPosition") String fantasyDraftPosition,
    @SerializedName("GameID") Integer gameID,
    @SerializedName("OpponentID") Integer opponentID,
    @SerializedName("Opponent") String opponent,
    @SerializedName("Day") String day,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("HomeOrAway") String homeOrAway,
    @SerializedName("IsGameOver") Boolean isGameOver,
    @SerializedName("GlobalGameID") Integer globalGameID,
    @SerializedName("GlobalOpponentID") Integer globalOpponentID,
    @SerializedName("Updated") String updated,
    @SerializedName("Games") Integer games,
    @SerializedName("FantasyPoints") BigDecimal fantasyPoints,
    @SerializedName("AtBats") BigDecimal atBats,
    @SerializedName("Runs") BigDecimal runs,
    @SerializedName("Hits") BigDecimal hits,
    @SerializedName("Singles") BigDecimal singles,
    @SerializedName("Doubles") BigDecimal doubles,
    @SerializedName("Triples") BigDecimal triples,
    @SerializedName("HomeRuns") BigDecimal homeRuns,
    @SerializedName("RunsBattedIn") BigDecimal runsBattedIn,
    @SerializedName("BattingAverage") BigDecimal battingAverage,
    @SerializedName("Outs") BigDecimal outs,
    @SerializedName("Strikeouts") BigDecimal strikeouts,
    @SerializedName("Walks") BigDecimal walks,
    @SerializedName("HitByPitch") BigDecimal hitByPitch,
    @SerializedName("Sacrifices") BigDecimal sacrifices,
    @SerializedName("SacrificeFlies") BigDecimal sacrificeFlies,
    @SerializedName("GroundIntoDoublePlay") BigDecimal groundIntoDoublePlay,
    @SerializedName("StolenBases") BigDecimal stolenBases,
    @SerializedName("CaughtStealing") BigDecimal caughtStealing,
    @SerializedName("PitchesSeen") BigDecimal pitchesSeen,
    @SerializedName("OnBasePercentage") BigDecimal onBasePercentage,
    @SerializedName("SluggingPercentage") BigDecimal sluggingPercentage,
    @SerializedName("OnBasePlusSlugging") BigDecimal onBasePlusSlugging,
    @SerializedName("Errors") BigDecimal errors,
    @SerializedName("Wins") BigDecimal wins,
    @SerializedName("Losses") BigDecimal losses,
    @SerializedName("Saves") BigDecimal saves,
    @SerializedName("InningsPitchedDecimal") BigDecimal inningsPitchedDecimal,
    @SerializedName("TotalOutsPitched") BigDecimal totalOutsPitched,
    @SerializedName("InningsPitchedFull") BigDecimal inningsPitchedFull,
    @SerializedName("InningsPitchedOuts") BigDecimal inningsPitchedOuts,
    @SerializedName("EarnedRunAverage") BigDecimal earnedRunAverage,
    @SerializedName("PitchingHits") BigDecimal pitchingHits,
    @SerializedName("PitchingRuns") BigDecimal pitchingRuns,
    @SerializedName("PitchingEarnedRuns") BigDecimal pitchingEarnedRuns,
    @SerializedName("PitchingWalks") BigDecimal pitchingWalks,
    @SerializedName("PitchingStrikeouts") BigDecimal pitchingStrikeouts,
    @SerializedName("PitchingHomeRuns") BigDecimal pitchingHomeRuns,
    @SerializedName("PitchesThrown") BigDecimal pitchesThrown,
    @SerializedName("PitchesThrownStrikes") BigDecimal pitchesThrownStrikes,
    @SerializedName("WalksHitsPerInningsPitched") BigDecimal walksHitsPerInningsPitched,
    @SerializedName("PitchingBattingAverageAgainst") BigDecimal pitchingBattingAverageAgainst,
    @SerializedName("GrandSlams") BigDecimal grandSlams,
    @SerializedName("FantasyPointsFanDuel") BigDecimal fantasyPointsFanDuel,
    @SerializedName("FantasyPointsDraftKings") BigDecimal fantasyPointsDraftKings,
    @SerializedName("FantasyPointsYahoo") BigDecimal fantasyPointsYahoo,
    @SerializedName("PlateAppearances") BigDecimal plateAppearances,
    @SerializedName("TotalBases") BigDecimal totalBases,
    @SerializedName("FlyOuts") BigDecimal flyOuts,
    @SerializedName("GroundOuts") BigDecimal groundOuts,
    @SerializedName("LineOuts") BigDecimal lineOuts,
    @SerializedName("PopOuts") BigDecimal popOuts,
    @SerializedName("IntentionalWalks") BigDecimal intentionalWalks,
    @SerializedName("ReachedOnError") BigDecimal reachedOnError,
    @SerializedName("BallsInPlay") BigDecimal ballsInPlay,
    @SerializedName("BattingAverageOnBallsInPlay") BigDecimal battingAverageOnBallsInPlay,
    @SerializedName("WeightedOnBasePercentage") BigDecimal weightedOnBasePercentage,
    @SerializedName("PitchingSingles") BigDecimal pitchingSingles,
    @SerializedName("PitchingDoubles") BigDecimal pitchingDoubles,
    @SerializedName("PitchingTriples") BigDecimal pitchingTriples,
    @SerializedName("PitchingGrandSlams") BigDecimal pitchingGrandSlams,
    @SerializedName("PitchingHitByPitch") BigDecimal pitchingHitByPitch,
    @SerializedName("PitchingSacrifices") BigDecimal pitchingSacrifices,
    @SerializedName("PitchingSacrificeFlies") BigDecimal pitchingSacrificeFlies,
    @SerializedName("PitchingGroundIntoDoublePlay") BigDecimal pitchingGroundIntoDoublePlay,
    @SerializedName("PitchingCompleteGames") BigDecimal pitchingCompleteGames,
    @SerializedName("PitchingShutOuts") BigDecimal pitchingShutOuts,
    @SerializedName("PitchingNoHitters") BigDecimal pitchingNoHitters,
    @SerializedName("PitchingPerfectGames") BigDecimal pitchingPerfectGames,
    @SerializedName("PitchingPlateAppearances") BigDecimal pitchingPlateAppearances,
    @SerializedName("PitchingTotalBases") BigDecimal pitchingTotalBases,
    @SerializedName("PitchingFlyOuts") BigDecimal pitchingFlyOuts,
    @SerializedName("PitchingGroundOuts") BigDecimal pitchingGroundOuts,
    @SerializedName("PitchingLineOuts") BigDecimal pitchingLineOuts,
    @SerializedName("PitchingPopOuts") BigDecimal pitchingPopOuts,
    @SerializedName("PitchingIntentionalWalks") BigDecimal pitchingIntentionalWalks,
    @SerializedName("PitchingReachedOnError") BigDecimal pitchingReachedOnError,
    @SerializedName("PitchingCatchersInterference") BigDecimal pitchingCatchersInterference,
    @SerializedName("PitchingBallsInPlay") BigDecimal pitchingBallsInPlay,
    @SerializedName("PitchingOnBasePercentage") BigDecimal pitchingOnBasePercentage,
    @SerializedName("PitchingSluggingPercentage") BigDecimal pitchingSluggingPercentage,
    @SerializedName("PitchingOnBasePlusSlugging") BigDecimal pitchingOnBasePlusSlugging,
    @SerializedName("PitchingStrikeoutsPerNineInnings") BigDecimal pitchingStrikeoutsPerNineInnings,
    @SerializedName("PitchingWalksPerNineInnings") BigDecimal pitchingWalksPerNineInnings,
    @SerializedName("PitchingBattingAverageOnBallsInPlay")
        BigDecimal pitchingBattingAverageOnBallsInPlay,
    @SerializedName("PitchingWeightedOnBasePercentage") BigDecimal pitchingWeightedOnBasePercentage,
    @SerializedName("DoublePlays") BigDecimal doublePlays,
    @SerializedName("PitchingDoublePlays") BigDecimal pitchingDoublePlays,
    @SerializedName("BattingOrderConfirmed") Boolean battingOrderConfirmed,
    @SerializedName("IsolatedPower") BigDecimal isolatedPower,
    @SerializedName("FieldingIndependentPitching") BigDecimal fieldingIndependentPitching,
    @SerializedName("PitchingQualityStarts") BigDecimal pitchingQualityStarts,
    @SerializedName("PitchingInningStarted") Integer pitchingInningStarted,
    @SerializedName("LeftOnBase") BigDecimal leftOnBase,
    @SerializedName("PitchingHolds") BigDecimal pitchingHolds,
    @SerializedName("PitchingBlownSaves") BigDecimal pitchingBlownSaves,
    @SerializedName("SubstituteBattingOrder") Integer substituteBattingOrder,
    @SerializedName("SubstituteBattingOrderSequence") Integer substituteBattingOrderSequence,
    @SerializedName("FantasyPointsFantasyDraft") BigDecimal fantasyPointsFantasyDraft,
    @SerializedName("FantasyPointsBatting") BigDecimal fantasyPointsBatting,
    @SerializedName("FantasyPointsPitching") BigDecimal fantasyPointsPitching) {}