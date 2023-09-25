package com.bettrnation.model;

import java.time.LocalDateTime;

public record Headshot(
    Integer playerId,
    String name,
    Integer teamId,
    String team,
    String position,
    String preferredHostedHeadshotUrl,
    LocalDateTime preferredHostedHeadshotUpdated,
    String hostedHeadshotWithBackgroundUrl,
    LocalDateTime hostedHeadshotWithBackgroundUpdated,
    String hostedHeadshotNoBackgroundUrl,
    LocalDateTime hostedHeadshotNoBackgroundUpdated) {}
