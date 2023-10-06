package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

public record FantasyDefenseGame(
    @SerializedName("GameKey") String gameKey,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("Date") String date,
    @SerializedName("Team") String team,
    @SerializedName("Opponent") String opponent,
    @SerializedName("PointsAllowed") BigDecimal pointsAllowed,
    @SerializedName("TouchdownsScored") BigDecimal touchdownsScored,
    @SerializedName("SoloTackles") BigDecimal soloTackles,
    @SerializedName("AssistedTackles") BigDecimal assistedTackles,
    @SerializedName("Sacks") BigDecimal sacks,
    @SerializedName("SackYards") BigDecimal sackYards,
    @SerializedName("PassesDefended") BigDecimal passesDefended,
    @SerializedName("FumblesForced") BigDecimal fumblesForced,
    @SerializedName("FumblesRecovered") BigDecimal fumblesRecovered,
    @SerializedName("FumbleReturnYards") BigDecimal fumbleReturnYards,
    @SerializedName("FumbleReturnTouchdowns") BigDecimal fumbleReturnTouchdowns,
    @SerializedName("Interceptions") BigDecimal interceptions,
    @SerializedName("InterceptionReturnYards") BigDecimal interceptionReturnYards,
    @SerializedName("InterceptionReturnTouchdowns") BigDecimal interceptionReturnTouchdowns,
    @SerializedName("BlockedKicks") BigDecimal blockedKicks,
    @SerializedName("Safeties") BigDecimal safeties,
    @SerializedName("PuntReturns") BigDecimal puntReturns,
    @SerializedName("PuntReturnYards") BigDecimal puntReturnYards,
    @SerializedName("PuntReturnTouchdowns") BigDecimal puntReturnTouchdowns,
    @SerializedName("PuntReturnLong") BigDecimal puntReturnLong,
    @SerializedName("KickReturns") BigDecimal kickReturns,
    @SerializedName("KickReturnYards") BigDecimal kickReturnYards,
    @SerializedName("KickReturnTouchdowns") BigDecimal kickReturnTouchdowns,
    @SerializedName("KickReturnLong") BigDecimal kickReturnLong,
    @SerializedName("BlockedKickReturnTouchdowns") BigDecimal blockedKickReturnTouchdowns,
    @SerializedName("FieldGoalReturnTouchdowns") BigDecimal fieldGoalReturnTouchdowns,
    @SerializedName("FantasyPointsAllowed") BigDecimal fantasyPointsAllowed,
    @SerializedName("QuarterbackFantasyPointsAllowed") BigDecimal quarterbackFantasyPointsAllowed,
    @SerializedName("RunningbackFantasyPointsAllowed") BigDecimal runningbackFantasyPointsAllowed,
    @SerializedName("WideReceiverFantasyPointsAllowed") BigDecimal wideReceiverFantasyPointsAllowed,
    @SerializedName("TightEndFantasyPointsAllowed") BigDecimal tightEndFantasyPointsAllowed,
    @SerializedName("KickerFantasyPointsAllowed") BigDecimal kickerFantasyPointsAllowed,
    @SerializedName("BlockedKickReturnYards") BigDecimal blockedKickReturnYards,
    @SerializedName("FieldGoalReturnYards") BigDecimal fieldGoalReturnYards,
    @SerializedName("QuarterbackHits") BigDecimal quarterbackHits,
    @SerializedName("TacklesForLoss") BigDecimal tacklesForLoss,
    @SerializedName("DefensiveTouchdowns") BigDecimal defensiveTouchdowns,
    @SerializedName("SpecialTeamsTouchdowns") BigDecimal specialTeamsTouchdowns,
    @SerializedName("IsGameOver") Boolean isGameOver,
    @SerializedName("FantasyPoints") BigDecimal fantasyPoints,
    @SerializedName("Stadium") String stadium,
    @SerializedName("Temperature") Integer temperature,
    @SerializedName("Humidity") Integer humidity,
    @SerializedName("WindSpeed") Integer windSpeed,
    @SerializedName("ThirdDownAttempts") BigDecimal thirdDownAttempts,
    @SerializedName("ThirdDownConversions") BigDecimal thirdDownConversions,
    @SerializedName("FourthDownAttempts") BigDecimal fourthDownAttempts,
    @SerializedName("FourthDownConversions") BigDecimal fourthDownConversions,
    @SerializedName("PointsAllowedByDefenseSpecialTeams")
        BigDecimal pointsAllowedByDefenseSpecialTeams,
    @SerializedName("FanDuelSalary") Integer fanDuelSalary,
    @SerializedName("DraftKingsSalary") Integer draftKingsSalary,
    @SerializedName("FantasyDataSalary") Integer fantasyDataSalary,
    @SerializedName("VictivSalary") Integer victivSalary,
    @SerializedName("TwoPointConversionReturns") BigDecimal twoPointConversionReturns,
    @SerializedName("FantasyPointsFanDuel") BigDecimal fantasyPointsFanDuel,
    @SerializedName("FantasyPointsDraftKings") BigDecimal fantasyPointsDraftKings,
    @SerializedName("OffensiveYardsAllowed") BigDecimal offensiveYardsAllowed,
    @SerializedName("YahooSalary") Integer yahooSalary,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("FantasyPointsYahoo") BigDecimal fantasyPointsYahoo,
    @SerializedName("HomeOrAway") String homeOrAway,
    @SerializedName("OpponentRank") Integer opponentRank,
    @SerializedName("OpponentPositionRank") Integer opponentPositionRank,
    @SerializedName("FantasyDraftSalary") Integer fantasyDraftSalary,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("OpponentID") Integer opponentID,
    @SerializedName("Day") String day,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("GlobalGameID") Integer globalGameID,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("GlobalOpponentID") Integer globalOpponentID,
    @SerializedName("DraftKingsPosition") String draftKingsPosition,
    @SerializedName("FanDuelPosition") String fanDuelPosition,
    @SerializedName("FantasyDraftPosition") String fantasyDraftPosition,
    @SerializedName("YahooPosition") String yahooPosition,
    @SerializedName("FantasyDefenseID") Integer fantasyDefenseID,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("FanDuelFantasyPointsAllowed") BigDecimal fanDuelFantasyPointsAllowed,
    @SerializedName("FanDuelQuarterbackFantasyPointsAllowed")
        BigDecimal fanDuelQuarterbackFantasyPointsAllowed,
    @SerializedName("FanDuelRunningbackFantasyPointsAllowed")
        BigDecimal fanDuelRunningbackFantasyPointsAllowed,
    @SerializedName("FanDuelWideReceiverFantasyPointsAllowed")
        BigDecimal fanDuelWideReceiverFantasyPointsAllowed,
    @SerializedName("FanDuelTightEndFantasyPointsAllowed")
        BigDecimal fanDuelTightEndFantasyPointsAllowed,
    @SerializedName("FanDuelKickerFantasyPointsAllowed")
        BigDecimal fanDuelKickerFantasyPointsAllowed,
    @SerializedName("DraftKingsFantasyPointsAllowed") BigDecimal draftKingsFantasyPointsAllowed,
    @SerializedName("DraftKingsQuarterbackFantasyPointsAllowed")
        BigDecimal draftKingsQuarterbackFantasyPointsAllowed,
    @SerializedName("DraftKingsRunningbackFantasyPointsAllowed")
        BigDecimal draftKingsRunningbackFantasyPointsAllowed,
    @SerializedName("DraftKingsWideReceiverFantasyPointsAllowed")
        BigDecimal draftKingsWideReceiverFantasyPointsAllowed,
    @SerializedName("DraftKingsTightEndFantasyPointsAllowed")
        BigDecimal draftKingsTightEndFantasyPointsAllowed,
    @SerializedName("DraftKingsKickerFantasyPointsAllowed")
        BigDecimal draftKingsKickerFantasyPointsAllowed,
    @SerializedName("YahooFantasyPointsAllowed") BigDecimal yahooFantasyPointsAllowed,
    @SerializedName("YahooQuarterbackFantasyPointsAllowed")
        BigDecimal yahooQuarterbackFantasyPointsAllowed,
    @SerializedName("YahooRunningbackFantasyPointsAllowed")
        BigDecimal yahooRunningbackFantasyPointsAllowed,
    @SerializedName("YahooWideReceiverFantasyPointsAllowed")
        BigDecimal yahooWideReceiverFantasyPointsAllowed,
    @SerializedName("YahooTightEndFantasyPointsAllowed")
        BigDecimal yahooTightEndFantasyPointsAllowed,
    @SerializedName("YahooKickerFantasyPointsAllowed") BigDecimal yahooKickerFantasyPointsAllowed,
    @SerializedName("FantasyPointsFantasyDraft") BigDecimal fantasyPointsFantasyDraft,
    @SerializedName("FantasyDraftFantasyPointsAllowed") BigDecimal fantasyDraftFantasyPointsAllowed,
    @SerializedName("FantasyDraftQuarterbackFantasyPointsAllowed")
        BigDecimal fantasyDraftQuarterbackFantasyPointsAllowed,
    @SerializedName("FantasyDraftRunningbackFantasyPointsAllowed")
        BigDecimal fantasyDraftRunningbackFantasyPointsAllowed,
    @SerializedName("FantasyDraftWideReceiverFantasyPointsAllowed")
        BigDecimal fantasyDraftWideReceiverFantasyPointsAllowed,
    @SerializedName("FantasyDraftTightEndFantasyPointsAllowed")
        BigDecimal fantasyDraftTightEndFantasyPointsAllowed,
    @SerializedName("FantasyDraftKickerFantasyPointsAllowed")
        BigDecimal fantasyDraftKickerFantasyPointsAllowed,
    @SerializedName("ScoringDetails") List<ScoringDetail> scoringDetails) {}
