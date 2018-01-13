package com.chandlertu.spring.boot.samples.config.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.chandlertu.spring.boot.samples.web.config.web.HomeController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTests {

  @Autowired
  private MockMvc mvc;

  @Test
  public void home() throws Exception {
    mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Home"));
  }

}
