package com.chandlertu.spring.boot.samples.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlUtf8Controller {

  @Value("${ymlUtf8}")
  private String utf8;

  @GetMapping("/ymlUtf8")
  public String get() {
    return utf8;
  }

}
