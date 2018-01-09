package com.chandlertu.spring.boot.samples.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesUtf8Controller {

  @Value("${properties.utf8}")
  private String utf8;

  @GetMapping("/propertiesUtf8")
  public String get() {
    return utf8;
  }

}
