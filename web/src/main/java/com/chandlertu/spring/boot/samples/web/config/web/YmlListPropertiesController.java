package com.chandlertu.spring.boot.samples.web.config.web;

import com.chandlertu.spring.boot.samples.web.config.YmlListProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlListPropertiesController {

  private YmlListProperties ymlListProperties;

  public YmlListPropertiesController(YmlListProperties ymlListProperties) {
    this.ymlListProperties = ymlListProperties;
  }

  @GetMapping("/ymlListProperties")
  public String get() {
    return ymlListProperties.getServers().toString();
  }

}
