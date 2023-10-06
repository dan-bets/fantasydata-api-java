package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record Schedule(
    @SerializedName("GameKey") String gameKey,
    @SerializedName("SeasonType") Integer seasonType,
    @SerializedName("Season") Integer season,
    @SerializedName("Week") Integer week,
    @SerializedName("Date") String date,
    @SerializedName("AwayTeam") String awayTeam,
    @SerializedName("HomeTeam") String homeTeam,
    @SerializedName("Channel") String channel,
    @SerializedName("PointSpread") BigDecimal pointSpread,
    @SerializedName("OverUnder") BigDecimal overUnder,
    @SerializedName("StadiumID") Integer stadiumID,
    @SerializedName("Canceled") Boolean canceled,
    @SerializedName("GeoLat") BigDecimal geoLat,
    @SerializedName("GeoLong") BigDecimal geoLong,
    @SerializedName("ForecastTempLow") Integer forecastTempLow,
    @SerializedName("ForecastTempHigh") Integer forecastTempHigh,
    @SerializedName("ForecastDescription") String forecastDescription,
    @SerializedName("ForecastWindChill") Integer forecastWindChill,
    @SerializedName("ForecastWindSpeed") Integer forecastWindSpeed,
    @SerializedName("AwayTeamMoneyLine") Integer awayTeamMoneyLine,
    @SerializedName("HomeTeamMoneyLine") Integer homeTeamMoneyLine,
    @SerializedName("Day") String day,
    @SerializedName("DateTime") String dateTime,
    @SerializedName("GlobalGameID") Integer globalGameID,
    @SerializedName("GlobalAwayTeamID") Integer globalAwayTeamID,
    @SerializedName("GlobalHomeTeamID") Integer globalHomeTeamID,
    @SerializedName("ScoreID") Integer scoreID,
    @SerializedName("StadiumDetails") Stadium stadiumDetails,
    @SerializedName("Status") String status,
    @SerializedName("IsClosed") Boolean isClosed) {}
