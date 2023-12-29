package com.AttestationRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/main/java/com/attestationfeature/att.Feature",
		glue="com.attestationstepdefinition",
		dryRun=false,// it is used to compile feature file
		monochrome=true,// to readable output
		plugin="html:target",
		tags="@login"
		//tags="@jjk, @dash"// tags are used to specific scenario
)
public class Runner {

}
