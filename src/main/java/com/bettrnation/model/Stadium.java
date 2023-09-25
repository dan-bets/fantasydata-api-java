package com.bettrnation.model;

public record Stadium(
    Integer stadiumID,
    String name,
    String city,
    String state,
    String country,
    Integer capacity,
    String playingSurface,
    Double geoLat,
    Double geoLong,
    String type) {}
