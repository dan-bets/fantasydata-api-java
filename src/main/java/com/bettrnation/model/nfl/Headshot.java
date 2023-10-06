package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record Headshot(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Name") String name,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("Position") String position,
    @SerializedName("PreferredHostedHeadshotUrl") String preferredHostedHeadshotUrl,
    @SerializedName("PreferredHostedHeadshotUpdated") String preferredHostedHeadshotUpdated,
    @SerializedName("HostedHeadshotWithBackgroundUrl") String hostedHeadshotWithBackgroundUrl,
    @SerializedName("HostedHeadshotWithBackgroundUpdated")
        String hostedHeadshotWithBackgroundUpdated,
    @SerializedName("HostedHeadshotNoBackgroundUrl") String hostedHeadshotNoBackgroundUrl,
    @SerializedName("HostedHeadshotNoBackgroundUpdated")
        String hostedHeadshotNoBackgroundUpdated) {}
