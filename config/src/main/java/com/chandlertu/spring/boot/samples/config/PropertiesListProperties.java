package com.chandlertu.spring.boot.samples.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties")
public class PropertiesListProperties {

  private List<String> servers = new ArrayList<String>();

  public List<String> getServers() {
    return this.servers;
  }

}
