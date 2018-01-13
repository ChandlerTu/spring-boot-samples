package com.chandlertu.spring.boot.samples.web.config.web;

import com.chandlertu.spring.boot.samples.web.config.PropertiesProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesPropertiesController {

  private PropertiesProperties propertiesProperties;

  public PropertiesPropertiesController(PropertiesProperties propertiesProperties) {
    this.propertiesProperties = propertiesProperties;
  }

  @GetMapping("/propertiesProperties")
  public String get() {
    return propertiesProperties.getProperties();
  }

}
