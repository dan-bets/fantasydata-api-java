package com.bettrnation.model.mlb;

import com.google.gson.annotations.SerializedName;

public record Pitch(
    @SerializedName("PitchID") Integer pitchID,
    @SerializedName("PlayID") Integer playID,
    @SerializedName("PitchNumberThisAtBat") Integer pitchNumberThisAtBat,
    @SerializedName("PitcherID") Integer pitcherID,
    @SerializedName("HitterID") Integer hitterID,
    @SerializedName("Outs") Integer outs,
    @SerializedName("BallsBeforePitch") Integer ballsBeforePitch,
    @SerializedName("StrikesBeforePitch") Integer strikesBeforePitch,
    @SerializedName("Strike") Boolean strike,
    @SerializedName("Ball") Boolean ball,
    @SerializedName("Foul") Boolean foul,
    @SerializedName("Swinging") Boolean swinging,
    @SerializedName("Looking") Boolean looking) {}
