package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;
import com.test.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src\\test\\java\\com\\feature\\actine.feature",glue = "com.step_definition",
monochrome = true,
dryRun = false,
strict = true,
tags = "@smoke",
plugin = {"html:Report/Html_Report",
		 "pretty",
		 "json:Reports/Cucumber.json",
		 "com.cucumber.listener.ExtentCucumberFormatter:Report_ER/ExtentReport.html"
		 }
)
@RunWith(Cucumber.class)

public class Test_runner_file {

	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = Base_Class.getBrowser(browser);
	}
	@AfterClass
	public static void teardown() {
		driver.close();
	}
	
}


