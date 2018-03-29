package com.chandlertu.namecase;

import static org.assertj.core.api.Assertions.assertThat;

import com.chandlertu.namecase.ConstantCase;

import org.junit.Test;

public class ConstantCaseTests {

  private ConstantCase constantCase = new ConstantCase();

  @Test
  public void toUpperCamelCase() {
    String s = "CONSTANT_CASE";
    String upperCamelCase = constantCase.toUpperCamelCase(s);
    assertThat(upperCamelCase).isEqualTo("ConstantCase");
  }

}
