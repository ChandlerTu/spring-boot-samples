package com.chandlertu.spring.boot.samples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yml")
public class YmlProperties {

  private String properties;

  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

}
