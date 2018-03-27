package com.chandlertu.spring.data.redis.samples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringRedisTemplateTests {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Test
  public void isNotNull() {
    assertThat(stringRedisTemplate).isNotNull();
  }

  @Test
  public void opsForHash() {
    HashOperations<String, Object, Object> opsForHash = stringRedisTemplate.opsForHash();
    assertThat(opsForHash).isNotNull();
  }

}
