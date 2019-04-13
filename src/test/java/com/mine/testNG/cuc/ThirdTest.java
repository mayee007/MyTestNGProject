package com.mine.testNG.cuc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ThirdTest {
  @Test
  public void thirdTest() {
	  System.out.println("inside third test"); 
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

}
