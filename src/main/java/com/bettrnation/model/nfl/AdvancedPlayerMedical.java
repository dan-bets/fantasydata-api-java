package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record AdvancedPlayerMedical(
    @SerializedName("AdvancedPlayerMedicalID") Integer advancedPlayerMedicalID,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("Season") Integer season,
    @SerializedName("IncidentDate") String incidentDate,
    @SerializedName("InjuryDescription") String injuryDescription,
    @SerializedName("Severity") String severity,
    @SerializedName("GamesMissed") Integer gamesMissed,
    @SerializedName("GamesOnInjuryReport") Integer gamesOnInjuryReport,
    @SerializedName("Surgery") String surgery,
    @SerializedName("RecoveryTimetable") String recoveryTimetable) {}
