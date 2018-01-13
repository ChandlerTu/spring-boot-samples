package com.chandlertu.spring.boot.samples.web.config.web;

import com.chandlertu.spring.boot.samples.web.config.YmlProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlPropertiesController {

  private YmlProperties ymlProperties;

  public YmlPropertiesController(YmlProperties ymlProperties) {
    this.ymlProperties = ymlProperties;
  }

  @GetMapping("/ymlProperties")
  public String get() {
    return ymlProperties.getProperties();
  }

}
