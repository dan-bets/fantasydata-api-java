package com.bettrnation.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record DFSSlatePlayer(
    @SerializedName("SlatePlayerID") Integer slatePlayerID,
    @SerializedName("SlateID") Integer slateID,
    @SerializedName("SlateGameID") Integer slateGameID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("PlayerGameProjectionStatID") Integer playerGameProjectionStatID,
    @SerializedName("FantasyDefenseProjectionStatID") Integer fantasyDefenseProjectionStatID,
    @SerializedName("OperatorPlayerID") String operatorPlayerID,
    @SerializedName("OperatorSlatePlayerID") String operatorSlatePlayerID,
    @SerializedName("OperatorPlayerName") String operatorPlayerName,
    @SerializedName("OperatorPosition") String operatorPosition,
    @SerializedName("OperatorRosterSlots") List<String> operatorRosterSlots,
    @SerializedName("OperatorSalary") Integer operatorSalary,
    @SerializedName("Team") String team,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("RemovedByOperator") Boolean removedByOperator) {}
