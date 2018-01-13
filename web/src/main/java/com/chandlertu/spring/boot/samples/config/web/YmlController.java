package com.chandlertu.spring.boot.samples.config.web;

import com.chandlertu.spring.boot.samples.config.Yml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {

  private Yml yml;

  public YmlController(Yml yml) {
    this.yml = yml;
  }

  @GetMapping("/yml")
  public String get() {
    return yml.getName();
  }

}
