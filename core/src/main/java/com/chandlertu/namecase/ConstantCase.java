package com.chandlertu.namecase;

import org.springframework.stereotype.Component;

@Component
public class ConstantCase {

  public String toUpperCamelCase(String s) {
    StringBuilder sb = new StringBuilder();

    String[] words = s.split("_");
    for (String word : words) {
      sb.append(word.charAt(0));
      sb.append(word.substring(1).toLowerCase());
    }

    return sb.toString();
  }

}
