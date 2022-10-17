package test_runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\adileep\\eclipse-workspace\\SalesIntelProjectPractice\\Features"
			,glue= {"step_defination"}
		//,format= {"pretty","html:test-outout"}
		)

public class test_run {
	
	

}

