package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record DailyFantasyPlayer(
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("Date") String date,
    @SerializedName("ShortName") String shortName,
    @SerializedName("Name") String name,
    @SerializedName("Team") String team,
    @SerializedName("Opponent") String opponent,
    @SerializedName("HomeOrAway") String homeOrAway,
    @SerializedName("Position") String position,
    @SerializedName("Salary") Integer salary,
    @SerializedName("LastGameFantasyPoints") BigDecimal lastGameFantasyPoints,
    @SerializedName("ProjectedFantasyPoints") BigDecimal projectedFantasyPoints,
    @SerializedName("OpponentRank") Integer opponentRank,
    @SerializedName("OpponentPositionRank") Integer opponentPositionRank,
    @SerializedName("Status") String status,
    @SerializedName("StatusCode") String statusCode,
    @SerializedName("StatusColor") String statusColor,
    @SerializedName("FanDuelSalary") Integer fanDuelSalary,
    @SerializedName("DraftKingsSalary") Integer draftKingsSalary,
    @SerializedName("YahooSalary") Integer yahooSalary,
    @SerializedName("FantasyDataSalary") Integer fantasyDataSalary,
    @SerializedName("FantasyDraftSalary") Integer fantasyDraftSalary) {}
