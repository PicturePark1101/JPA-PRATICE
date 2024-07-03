package com.example.demo;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class TestJPA {

  @Autowired
  EntityManager em;

  @Test
  public void test () {


  }


}
