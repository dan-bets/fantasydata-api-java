package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record DailyFantasyScoring(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Name") String name,
    @SerializedName("Team") String team,
    @SerializedName("Position") String position,
    @SerializedName("FantasyPoints") BigDecimal fantasyPoints,
    @SerializedName("FantasyPointsPPR") BigDecimal fantasyPointsPPR,
    @SerializedName("FantasyPointsFanDuel") BigDecimal fantasyPointsFanDuel,
    @SerializedName("FantasyPointsDraftKings") BigDecimal fantasyPointsDraftKings,
    @SerializedName("FantasyPointsYahoo") BigDecimal fantasyPointsYahoo,
    @SerializedName("HasStarted") Boolean hasStarted,
    @SerializedName("IsInProgress") Boolean isInProgress,
    @SerializedName("IsOver") Boolean isOver,
    @SerializedName("Date") String date,
    @SerializedName("FantasyPointsFantasyDraft") BigDecimal fantasyPointsFantasyDraft) {}
