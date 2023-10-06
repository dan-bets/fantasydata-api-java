package com.bettrnation.model.nfl.rotoballer;

import com.bettrnation.model.nfl.PlayerInfo;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public record Article(
    @SerializedName("ArticleID") Integer articleID,
    @SerializedName("Title") String title,
    @SerializedName("Source") String source,
    @SerializedName("Updated") String updated,
    @SerializedName("Content") String content,
    @SerializedName("Url") String url,
    @SerializedName("TermsOfUse") String termsOfUse,
    @SerializedName("Author") String author,
    @SerializedName("Players") List<PlayerInfo> players) {}
