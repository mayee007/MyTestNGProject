package com.mine.testNG.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(plugin = {"pretty", "html:target/cucumber-tests"}, 
							features = {"src/test/resources" }, 
							glue={"com.mine.testNG.steps"})	
public class GoogleRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	public static WebDriver driver;
	
	@Test(description = "Runs Cucumber Feature", dataProvider = "googleFeature")
    public void googleHomeFeature(CucumberFeatureWrapper cucumberFeature) {
		System.out.println("inside Google runner");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayee\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
	
	@DataProvider
    public Object[][] googleFeature() {
        return testNGCucumberRunner.provideFeatures();
    }

	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

	
	@AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
