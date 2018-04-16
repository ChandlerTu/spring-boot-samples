package com.chandlertu.sbs.data.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegerUserRepositoryTests {

  @Autowired
  private IntegerUserRepository repository;

  @Test
  public void test() {
    IntegerUser user = new IntegerUser();
    user.setName("name");

    repository.save(user);
  }

}
