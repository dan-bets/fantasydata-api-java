package com.bettrnation.model.nfl.projections;

import com.google.gson.annotations.SerializedName;

public record DFSSlateWithOwnershipProjection(
    @SerializedName("SlateID") Integer slateID,
    @SerializedName("Operator") String operator,
    @SerializedName("OperatorSlateID") Integer operatorSlateID,
    @SerializedName("OperatorName") String operatorName,
    @SerializedName("OperatorDay") String operatorDay,
    @SerializedName("OperatorStartTime") String operatorStartTime) {}
