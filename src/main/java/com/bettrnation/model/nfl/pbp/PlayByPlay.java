package com.bettrnation.model.nfl.pbp;

import com.bettrnation.model.nfl.Play;
import com.bettrnation.model.nfl.Quarter;
import com.bettrnation.model.nfl.Score;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record PlayByPlay(
    @SerializedName("Score") Score score,
    @SerializedName("Quarters") List<Quarter> quarters,
    @SerializedName("Plays") List<Play> plays) {}
