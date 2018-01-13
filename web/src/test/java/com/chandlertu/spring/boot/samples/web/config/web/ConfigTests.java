package com.chandlertu.spring.boot.samples.web.config.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ConfigTests {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void properties() {
    String body = this.restTemplate.getForObject("/properties", String.class);
    assertThat(body).isEqualTo("properties name");
  }

  @Test
  public void propertiesUtf8() {
    String body = this.restTemplate.getForObject("/propertiesUtf8", String.class);
    assertThat(body).isEqualTo("properties 中文");
  }

  @Test
  public void propertiesProperties() {
    String body = this.restTemplate.getForObject("/propertiesProperties", String.class);
    assertThat(body).isEqualTo("properties properties");
  }

  @Test
  public void propertiesListProperties() {
    String body = this.restTemplate.getForObject("/propertiesListProperties", String.class);
    assertThat(body).isEqualTo("[properties list 1, properties list 2]");
  }

  @Test
  public void yml() {
    String body = this.restTemplate.getForObject("/yml", String.class);
    assertThat(body).isEqualTo("yml name");
  }

  @Test
  public void ymlUtf8() {
    String body = this.restTemplate.getForObject("/ymlUtf8", String.class);
    assertThat(body).isEqualTo("yml 中文");
  }

  @Test
  public void ymlProperties() {
    String body = this.restTemplate.getForObject("/ymlProperties", String.class);
    assertThat(body).isEqualTo("yml properties");
  }

  @Test
  public void ymlListProperties() {
    String body = this.restTemplate.getForObject("/ymlListProperties", String.class);
    assertThat(body).isEqualTo("[yml list properties 0, yml list properties 1]");
  }

}
