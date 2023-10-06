package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record PlayByPlay(
    @SerializedName("Game") Game game, @SerializedName("Plays") List<Play> plays) {}
