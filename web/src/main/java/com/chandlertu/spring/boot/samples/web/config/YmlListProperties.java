package com.chandlertu.spring.boot.samples.web.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yml")
public class YmlListProperties {

  private List<String> servers = new ArrayList<String>();

  public List<String> getServers() {
    return this.servers;
  }

}
