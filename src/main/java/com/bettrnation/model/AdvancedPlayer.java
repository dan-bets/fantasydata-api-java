package com.bettrnation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public record AdvancedPlayer(
        Integer playerId, String name, Integer teamId, String team,
        String position, String fantasyPosition, String positionGroup, BigDecimal bmi,
        Integer bmiRank, BigDecimal handSize, Integer handSizeRank, BigDecimal armLength,
        Integer armLengthRank, BigDecimal qualityScore, Integer qualityScoreRank, BigDecimal fortyYardDash,
        Integer fortyYardDashRank, BigDecimal threeConeDrill, Integer threeConeDrillRank,
        BigDecimal twentyYardShuttle, Integer twentyYardShuttleRank, BigDecimal agilityScore,
        Integer agilityScoreRank, BigDecimal verticalJump, Integer verticalJumpRank,
        BigDecimal broadJump, Integer broadJumpRank, BigDecimal burstScore, Integer burstScoreRank,
        BigDecimal sparqX, Integer sparqXRank, BigDecimal athleticismScore, Integer athleticismScoreRank,
        BigDecimal speedScore, Integer speedScoreRank, BigDecimal throwVelocity, Integer throwVelocityRank,
        BigDecimal wonderlicScore, Integer wonderlicScoreRank, BigDecimal heightAdjustedSpeedScore, Integer heightAdjustedSpeedScoreRank,
        BigDecimal catchRadius, Integer catchRadiusRank, BigDecimal benchPress, Integer benchPressRank,
        BigDecimal playmakingRadius, Integer playmakingRadiusRank, String highlightClip,
        AdvancedPlayerMedical[] medicalHistory, PlayerInfo[] comparablePlayers,
        AdvancedPlayerSeason[] advancedPlayerSeasons, AdvancedPlayerGame[] advancedPlayerGames
) {
}
