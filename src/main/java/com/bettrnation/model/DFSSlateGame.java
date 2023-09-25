package com.bettrnation.model;

public record DFSSlateGame(
    Integer slateGameID,
    Integer slateID,
    Integer gameID,
    Integer operatorGameID,
    Boolean removedByOperator,
    Integer scoreID,
    Schedule gameDetails) {}
