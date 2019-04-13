package com.mine.testNG.cuc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void firstTest() {
	  System.out.println("hello from firstTest()");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
