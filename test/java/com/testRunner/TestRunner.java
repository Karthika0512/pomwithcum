package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features",
                        glue="com.stepdefinition",
                        plugin="html:target")

public class TestRunner {
	

}
