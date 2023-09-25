package com.bettrnation.model;

import java.time.LocalDateTime;

public record DFSSlate(
    Integer slateID,
    String operator,
    Integer operatorSlateID,
    String operatorName,
    LocalDateTime operatorDay,
    LocalDateTime operatorStartTime,
    Integer numberOfGames,
    Boolean isMultiDaySlate,
    Boolean removedByOperator,
    String operatorGameType,
    DFSSlateGame[] dfsSlateGames,
    DFSSlatePlayer[] dfsSlatePlayers,
    String[] slateRosterSlots,
    Integer salaryCap) {}
