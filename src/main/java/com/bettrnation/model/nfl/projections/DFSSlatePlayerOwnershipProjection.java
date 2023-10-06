package com.bettrnation.model.nfl.projections;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record DFSSlatePlayerOwnershipProjection(
    @SerializedName("SlateID") Integer slateID,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("FantasyDefensePlayerID") Integer fantasyDefensePlayerID,
    @SerializedName("ProjectedOwnershipPercentage") BigDecimal projectedOwnershipPercentage,
    @SerializedName("IsCaptain") Boolean isCaptain) {}
