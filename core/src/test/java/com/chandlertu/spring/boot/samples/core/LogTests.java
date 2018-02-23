package com.chandlertu.spring.boot.samples.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTests {

  private static final Log logger = LogFactory.getLog(LogTests.class);

  @Test
  public void test() {
    logger.debug("message");
  }

}
