package com.chandlertu.spring.boot.samples.web.config.web;

import com.chandlertu.spring.boot.samples.web.config.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

  private Properties properties;

  public PropertiesController(Properties properties) {
    this.properties = properties;
  }

  @GetMapping("/properties")
  public String get() {
    return properties.getName();
  }

}
