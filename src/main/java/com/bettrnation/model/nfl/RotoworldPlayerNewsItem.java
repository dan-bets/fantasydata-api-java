package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record RotoworldPlayerNewsItem(
    @SerializedName("RotoworldPlayerNewsLine") String rotoworldPlayerNewsLine,
    @SerializedName("Headline") String headline,
    @SerializedName("Comment") String comment,
    @SerializedName("Impact") String impact,
    @SerializedName("RotoworldCreated") String rotoworldCreated,
    @SerializedName("RotoworldLastUpdated") String rotoworldLastUpdated,
    @SerializedName("IsTopNews") Boolean isTopNews,
    @SerializedName("IsTransaction") Boolean isTransaction,
    @SerializedName("IsRumor") Boolean isRumor,
    @SerializedName("MoreLink") String moreLink,
    @SerializedName("MoreName") String moreName,
    @SerializedName("PlayerInfo") PlayerInfo playerInfo,
    @SerializedName("RotoworldPlayerMeta") RotoworldPlayerNewsPlayerMetaData rotoworldPlayerMeta) {}
