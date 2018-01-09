package com.chandlertu.spring.boot.samples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties")
public class PropertiesProperties {

  private String properties;

  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

}
