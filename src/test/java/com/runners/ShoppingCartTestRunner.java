package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features/shoppingcart.feature",
        glue = {"com.shoppingcartsteps","com.hooks"},
        plugin = {
        		    		"pretty",
        		    		"html:target/Cucumber-Reports/cucumber_report.html",
        		    		"json:target/Cucumber-Reports/cucumber_report.json",
        		    		"junit:target/Cucumber-Reports/cucumber_report.xml",
        		    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/Cucumber-Reports", // Extent Report Adapter
        		    		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        		    	      
        		    }
)
public class ShoppingCartTestRunner extends AbstractTestNGCucumberTests {
}
