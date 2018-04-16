package com.chandlertu.sbs.data.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntUserRepositoryTests {

  @Autowired
  private IntUserRepository repository;

  @Test
  public void test() {
    IntUser user = new IntUser();
    user.setName("name");

    repository.save(user);
  }

}
