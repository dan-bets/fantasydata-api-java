package com.bettrnation.model;

import java.time.LocalDateTime;

public record News(
    Integer newsID,
    String source,
    LocalDateTime updated,
    String timeAgo,
    String title,
    String content,
    String url,
    String termsOfUse,
    String author,
    String categories,
    Integer playerID,
    Integer teamID,
    String team,
    Integer playerID2,
    Integer teamID2,
    String team2,
    String originalSource,
    String originalSourceUrl) {}
