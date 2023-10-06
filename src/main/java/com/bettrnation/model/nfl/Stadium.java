package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public record Stadium(
    @SerializedName("StadiumID") Integer stadiumID,
    @SerializedName("Name") String name,
    @SerializedName("City") String city,
    @SerializedName("State") String state,
    @SerializedName("Country") String country,
    @SerializedName("Capacity") Integer capacity,
    @SerializedName("PlayingSurface") String playingSurface,
    @SerializedName("GeoLat") BigDecimal geoLat,
    @SerializedName("GeoLong") BigDecimal geoLong,
    @SerializedName("Type") String type) {}
