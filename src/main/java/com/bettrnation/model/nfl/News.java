package com.bettrnation.model.nfl;

import com.google.gson.annotations.SerializedName;

public record News(
    @SerializedName("NewsID") Integer newsID,
    @SerializedName("Source") String source,
    @SerializedName("Updated") String updated,
    @SerializedName("TimeAgo") String timeAgo,
    @SerializedName("Title") String title,
    @SerializedName("Content") String content,
    @SerializedName("Url") String url,
    @SerializedName("TermsOfUse") String termsOfUse,
    @SerializedName("Author") String author,
    @SerializedName("Categories") String categories,
    @SerializedName("PlayerID") Integer playerID,
    @SerializedName("TeamID") Integer teamID,
    @SerializedName("Team") String team,
    @SerializedName("PlayerID2") Integer playerID2,
    @SerializedName("TeamID2") Integer teamID2,
    @SerializedName("Team2") String team2,
    @SerializedName("OriginalSource") String originalSource,
    @SerializedName("OriginalSourceUrl") String originalSourceUrl) {}
