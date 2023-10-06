package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record FantasyPlayer(
    @SerializedName("FantasyPlayerKey") String fantasyPlayerKey,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Name") String name,
    @SerializedName("Team") String team,
    @SerializedName("Position") String position,
    @SerializedName("AverageDraftPosition") BigDecimal averageDraftPosition,
    @SerializedName("AverageDraftPositionPPR") BigDecimal averageDraftPositionPPR,
    @SerializedName("ByeWeek") Integer byeWeek,
    @SerializedName("LastSeasonFantasyPoints") BigDecimal lastSeasonFantasyPoints,
    @SerializedName("ProjectedFantasyPoints") BigDecimal projectedFantasyPoints,
    @SerializedName("AuctionValue") Integer auctionValue,
    @SerializedName("AuctionValuePPR") Integer auctionValuePPR,
    @SerializedName("AverageDraftPositionIDP") Integer averageDraftPositionIDP,
    @SerializedName("AverageDraftPositionRookie") BigDecimal averageDraftPositionRookie,
    @SerializedName("AverageDraftPositionDynasty") BigDecimal averageDraftPositionDynasty,
    @SerializedName("AverageDraftPosition2QB") BigDecimal averageDraftPosition2QB) {}
