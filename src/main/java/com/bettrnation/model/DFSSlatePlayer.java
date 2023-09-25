package com.bettrnation.model;

public record DFSSlatePlayer(
    Integer slatePlayerID,
    Integer slateID,
    Integer slateGameID,
    Integer playerID,
    Integer playerGameProjectionStatID,
    Integer fantasyDefenseProjectionStatID,
    String operatorPlayerID,
    String operatorSlatePlayerID,
    String operatorPlayerName,
    String operatorPosition,
    String[] operatorRosterSlots,
    Integer operatorSalary,
    String team,
    Integer teamID,
    Boolean removedByOperator) {}
