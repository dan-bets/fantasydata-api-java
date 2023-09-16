package com.bettrnation.model;

public record PlayerInfo(
        Integer playerId, String name, Integer teamId, String team, String position
) {
}
