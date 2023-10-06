package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record PlayerBasic(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Team") String team,
    @SerializedName("Number") Integer number,
    @SerializedName("FirstName") String firstName,
    @SerializedName("LastName") String lastName,
    @SerializedName("Position") String position,
    @SerializedName("Status") String status,
    @SerializedName("Height") String height,
    @SerializedName("Weight") Integer weight,
    @SerializedName("BirthDate") String birthDate,
    @SerializedName("College") String college,
    @SerializedName("Experience") Integer experience,
    @SerializedName("FantasyPosition") String fantasyPosition,
    @SerializedName("Active") Boolean active,
    @SerializedName("PositionCategory") String positionCategory,
    @SerializedName("Name") String name,
    @SerializedName("Age") Integer age,
    @SerializedName("ShortName") String shortName,
    @SerializedName("HeightFeet") Integer heightFeet,
    @SerializedName("HeightInches") Integer heightInches,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("UsaTodayPlayerID") Integer usaTodayPlayerID,
    @SerializedName("UsaTodayHeadshotUrl") String usaTodayHeadshotUrl,
    @SerializedName("UsaTodayHeadshotNoBackgroundUrl") String usaTodayHeadshotNoBackgroundUrl,
    @SerializedName("UsaTodayHeadshotUpdated") String usaTodayHeadshotUpdated,
    @SerializedName("UsaTodayHeadshotNoBackgroundUpdated")
        String usaTodayHeadshotNoBackgroundUpdated) {}
