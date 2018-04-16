package com.chandlertu.spring.data.redis.samples;

import static org.assertj.core.api.Assertions.assertThat;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnumStringRedisTemplateTests {

  @Resource(name = "stringRedisTemplate")
  private HashOperations<String, String, String> hashOps;

  @Autowired
  private RedisConnectionFactory redisConnectionFactory;

  @Before
  public void before() {
    RedisConnection redisConnection = redisConnectionFactory.getConnection();
    redisConnection.flushDb();
    redisConnection.close();
  }

  @Test
  public void test() {
    hashOps.put("key", "hashKey", String.valueOf(EnumExample.ZERO.ordinal()));

    String s = hashOps.get("key", "hashKey");
    EnumExample enumExample = EnumExample.values()[Integer.parseInt(s)];

    assertThat(enumExample).isEqualTo(EnumExample.ZERO);
  }

}
