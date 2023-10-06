package com.bettrnation.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record DFSSlate(
    @SerializedName("SlateID") Integer slateID,
    @SerializedName("Operator") String operator,
    @SerializedName("OperatorSlateID") Integer operatorSlateID,
    @SerializedName("OperatorName") String operatorName,
    @SerializedName("OperatorDay") String operatorDay,
    @SerializedName("OperatorStartTime") String operatorStartTime,
    @SerializedName("NumberOfGames") Integer numberOfGames,
    @SerializedName("IsMultiDaySlate") Boolean isMultiDaySlate,
    @SerializedName("RemovedByOperator") Boolean removedByOperator,
    @SerializedName("OperatorGameType") String operatorGameType,
    @SerializedName("DfsSlateGames") List<DFSSlateGame> dfsSlateGames,
    @SerializedName("DfsSlatePlayers") List<DFSSlatePlayer> dfsSlatePlayers,
    @SerializedName("SlateRosterSlots") List<String> slateRosterSlots,
    @SerializedName("SalaryCap") Integer salaryCap) {}
