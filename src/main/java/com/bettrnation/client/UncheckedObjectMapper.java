package com.bettrnation.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import java.io.IOException;
import java.util.concurrent.CompletionException;

public class UncheckedObjectMapper extends ObjectMapper {

  public UncheckedObjectMapper() {
    this.setPropertyNamingStrategy(PropertyNamingStrategies.UpperCamelCaseStrategy.INSTANCE);
  }

  <T> T readValue(String content) {
    try {
      return readValue(content, new TypeReference<>() {});
    } catch (IOException e) {
      throw new CompletionException(e);
    }
  }
}
