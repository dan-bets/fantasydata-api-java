package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record TeamBasic(
    @SerializedName("Key") String key,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("City") String city,
    @SerializedName("Name") String name,
    @SerializedName("Conference") String conference,
    @SerializedName("Division") String division,
    @SerializedName("FullName") String fullName,
    @SerializedName("StadiumID") Integer stadiumID,
    @SerializedName("ByeWeek") Integer byeWeek,
    @SerializedName("GlobalTeamID") Integer globalTeamID,
    @SerializedName("HeadCoach") String headCoach,
    @SerializedName("PrimaryColor") String primaryColor,
    @SerializedName("SecondaryColor") String secondaryColor,
    @SerializedName("TertiaryColor") String tertiaryColor,
    @SerializedName("QuaternaryColor") String quaternaryColor,
    @SerializedName("WikipediaLogoURL") String wikipediaLogoURL,
    @SerializedName("WikipediaWordMarkURL") String wikipediaWordMarkURL,
    @SerializedName("OffensiveCoordinator") String offensiveCoordinator,
    @SerializedName("DefensiveCoordinator") String defensiveCoordinator,
    @SerializedName("SpecialTeamsCoach") String specialTeamsCoach,
    @SerializedName("OffensiveScheme") String offensiveScheme,
    @SerializedName("DefensiveScheme") String defensiveScheme) {}
