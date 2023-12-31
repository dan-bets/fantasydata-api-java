package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;

public record Player(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("SportsDataID") String sportsDataID,
    @SerializedName("Status") String status,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("Jersey") Integer jersey,
    @SerializedName("PositionCategory") String positionCategory,
    @SerializedName("Position") String position,
    @SerializedName("MLBAMID") Integer MLBAMID,
    @SerializedName("FirstName") String firstName,
    @SerializedName("LastName") String lastName,
    @SerializedName("BatHand") String batHand,
    @SerializedName("ThrowHand") String throwHand,
    @SerializedName("Height") Integer height,
    @SerializedName("Weight") Integer weight,
    @SerializedName("BirthDate") String birthDate,
    @SerializedName("BirthCity") String birthCity,
    @SerializedName("BirthState") String birthState,
    @SerializedName("BirthCountry") String birthCountry,
    @SerializedName("HighSchool") String highSchool,
    @SerializedName("College") String college,
    @SerializedName("ProDebut") String proDebut,
    @SerializedName("Salary") Integer salary,
    @SerializedName("PhotoUrl") String photoUrl,
    @SerializedName("SportRadarPlayerID") String sportRadarPlayerID,
    @SerializedName("RotoworldPlayerID") Integer rotoworldPlayerID,
    @SerializedName("RotoWirePlayerID") Integer rotoWirePlayerID,
    @SerializedName("FantasyAlarmPlayerID") Integer fantasyAlarmPlayerID,
    @SerializedName("StatsPlayerID") Integer statsPlayerID,
    @SerializedName("SportsDirectPlayerID") Integer sportsDirectPlayerID,
    @SerializedName("XmlTeamPlayerID") Integer xmlTeamPlayerID,
    @SerializedName("InjuryStatus") String injuryStatus,
    @SerializedName("InjuryBodyPart") String injuryBodyPart,
    @SerializedName("InjuryStartDate") String injuryStartDate,
    @SerializedName("InjuryNotes") String injuryNotes,
    @SerializedName("FanDuelPlayerID") Integer fanDuelPlayerID,
    @SerializedName("DraftKingsPlayerID") Integer draftKingsPlayerID,
    @SerializedName("YahooPlayerID") Integer yahooPlayerID,
    @SerializedName("UpcomingGameID") Integer upcomingGameID,
    @SerializedName("FanDuelName") String fanDuelName,
    @SerializedName("DraftKingsName") String draftKingsName,
    @SerializedName("YahooName") String yahooName,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("FantasyDraftName") String fantasyDraftName,
    @SerializedName("FantasyDraftPlayerID") Integer fantasyDraftPlayerID,
    @SerializedName("Experience") String experience,
    @SerializedName("UsaTodayPlayerID") Integer usaTodayPlayerID,
    @SerializedName("UsaTodayHeadshotUrl") String usaTodayHeadshotUrl,
    @SerializedName("UsaTodayHeadshotNoBackgroundUrl") String usaTodayHeadshotNoBackgroundUrl,
    @SerializedName("UsaTodayHeadshotUpdated") String usaTodayHeadshotUpdated,
    @SerializedName("UsaTodayHeadshotNoBackgroundUpdated")
        String usaTodayHeadshotNoBackgroundUpdated) {}
