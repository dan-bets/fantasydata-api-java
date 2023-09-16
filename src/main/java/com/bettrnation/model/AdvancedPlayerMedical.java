package com.bettrnation.model;

public record AdvancedPlayerMedical(
        Integer advancedPlayerMedicalID, Integer teamID, String team,
        Integer season, String incidentDate, String injuryDescription,
        String severity, Integer gamesMissed, Integer gamesOnInjuryReport,
        String surgery, String recoveryTimetable
) { }
