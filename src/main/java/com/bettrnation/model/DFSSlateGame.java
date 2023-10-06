package com.bettrnation.model;

import com.bettrnation.model.nfl.Schedule;
import com.google.gson.annotations.SerializedName;

public record DFSSlateGame(
    @SerializedName("SlateGameID") Integer slateGameID,
    @SerializedName("SlateID") Integer slateID,
    @SerializedName("GameID") Integer gameID,
    @SerializedName("OperatorGameID") Integer operatorGameID,
    @SerializedName("RemovedByOperator") Boolean removedByOperator,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("Game") Schedule game) {}
