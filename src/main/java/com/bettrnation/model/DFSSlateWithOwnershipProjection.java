package com.bettrnation.model;

import java.time.LocalDateTime;

public record DFSSlateWithOwnershipProjection(
    int slateID,
    String operator,
    int operatorSlateID,
    String operatorName,
    LocalDateTime operatorDay,
    LocalDateTime operatorStartTime,
    DFSSlatePlayerOwnershipProjection[] slateOwnershipProjections) {}
