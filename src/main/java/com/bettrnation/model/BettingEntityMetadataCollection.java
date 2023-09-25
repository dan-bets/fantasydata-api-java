package com.bettrnation.model;

import java.util.List;

public record BettingEntityMetadataCollection(
    List<BettingEntityMetadata> bettingBetTypes,
    List<BettingEntityMetadata> bettingMarketTypes,
    List<BettingEntityMetadata> bettingPeriodTypes,
    List<BettingEntityMetadata> bettingEventTypes,
    List<BettingEntityMetadata> bettingOutcomeTypes,
    List<BettingEntityMetadata> bettingResultTypes,
    List<BettingResultingMetadata> resultedMarketMetaData) {}
