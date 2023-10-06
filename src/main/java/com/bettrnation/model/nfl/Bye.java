package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record Bye(
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("Team") String team) {}
