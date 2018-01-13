package com.chandlertu.spring.boot.samples.web.config.web;

import com.chandlertu.spring.boot.samples.web.config.PropertiesListProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesListPropertiesController {

  private PropertiesListProperties propertiesListProperties;

  public PropertiesListPropertiesController(PropertiesListProperties propertiesListProperties) {
    this.propertiesListProperties = propertiesListProperties;
  }

  @GetMapping("/propertiesListProperties")
  public String get() {
    return propertiesListProperties.getServers().toString();
  }

}
