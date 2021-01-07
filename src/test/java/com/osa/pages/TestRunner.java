package com.osa.pages;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//features= {".\\src\\test\\java\\com\\bddfinal\\features"},
		//features= {"src/test/java/com/bddfinal/features"},	
		features= {"src//test//java//com//bddfinal//features"},
	glue= {"com.bddfinal.steps"},
	//tags= {"@InvalidUser"},
	plugin= {"pretty", "html:target/html_report"}
	//dryRun=true
		
	)

public class TestRunner {
	
	
	
	

}
