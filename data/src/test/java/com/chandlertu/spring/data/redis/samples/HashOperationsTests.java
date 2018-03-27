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
public class HashOperationsTests {

  @Resource(name = "stringRedisTemplate")
  private HashOperations<String, Object, Object> hashOps;

  @Autowired
  private RedisConnectionFactory redisConnectionFactory;

  @Before
  public void before() {
    RedisConnection redisConnection = redisConnectionFactory.getConnection();
    redisConnection.flushDb();
    redisConnection.close();
  }

  @Test
  public void increment() {
    String key = "key";
    String hashKey = "hashKey";
    long delta = 1;
    Long result = hashOps.increment(key, hashKey, delta);
    assertThat(result).isEqualTo(1);

    Long result2 = hashOps.increment(key, hashKey, delta);
    assertThat(result2).isEqualTo(2);
  }

  @Test
  public void get() {
    String key = "key";
    String hashKey = "hashKey";
    long delta = 1;
    Long result = hashOps.increment(key, hashKey, delta);
    assertThat(result).isEqualTo(1);

    String result2 = (String) hashOps.get(key, hashKey);
    assertThat(result2).isEqualTo("1");
  }

}
