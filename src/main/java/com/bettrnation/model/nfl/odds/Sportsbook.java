package com.bettrnation.model.nfl.odds;

import com.google.gson.annotations.SerializedName;

public record Sportsbook(
    @SerializedName("SportsbookID") Integer sportsbookID, @SerializedName("Name") String name) {}
