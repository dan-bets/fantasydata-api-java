package com.bettrnation.model;

public record PlayByPlay(Score score, Quarter[] quarters, Play[] plays) {}
