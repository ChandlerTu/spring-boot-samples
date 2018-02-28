package com.chandlertu.spring.boot.samples.web.json;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JacksonTests {

  @Autowired
  private ObjectMapper objectMapper;

  @Test
  public void objectMapperIsNotNull() {
    assertThat(objectMapper).isNotNull();
  }

  @Test
  public void test() throws JsonParseException, JsonMappingException, IOException {
    String content = "{\"Name\":\"Bob\", \"Age\":13, \"Birthday\":\"2018-12-27 17:32:12.123\","
        + " \"Home\":\"http://www.baidu.com/<>&=\"}";
    JsonExample example = objectMapper.readValue(content, JsonExample.class);
    assertThat(example.getName()).isEqualTo("Bob");
    assertThat(example.getAge()).isEqualTo(13);

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(example.getBirthday());
    assertThat(calendar.get(Calendar.MILLISECOND)).isEqualTo(123);

    assertThat(example.getHome()).isEqualTo("http://www.baidu.com/<>&=");
  }

  @Test
  public void shouldNullWhenDateEmpty()
      throws JsonParseException, JsonMappingException, IOException {
    JsonExample example = objectMapper
        .readValue("{\"Name\":\"Bob\", \"Age\":13, \"Birthday\":\"\"}", JsonExample.class);
    assertThat(example.getName()).isEqualTo("Bob");
    assertThat(example.getAge()).isEqualTo(13);
    assertThat(example.getBirthday()).isNull();
  }

}
