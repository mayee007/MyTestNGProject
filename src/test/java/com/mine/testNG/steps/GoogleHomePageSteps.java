package com.mine.testNG.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mine.testNG.runner.GoogleRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleHomePageSteps {
  String url = "http://google.com"; 
  String capturedTitle; 
  
  @Given("^I open google page$")
  public void whenIGoToGoogle() { 
	  GoogleRunner.driver.get(url); 
	  System.out.println("inside opening page"); 
  }
  
  @When("^I read title$")
  public void iReadTitle() { 
	  capturedTitle = GoogleRunner.driver.getTitle(); 
	  GoogleRunner.driver.close();
	  System.out.println("inside I read title"); 
  }
  
  @Then("^title should be \"([^\"]*)\"$")
  public void title_should_be(String expectedTitle) throws Throwable {
	  System.out.println("inside verify title"); 
	  Assert.assertEquals(capturedTitle, expectedTitle);
  }
}
