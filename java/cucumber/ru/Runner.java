package cucumber.ru;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "/Users/AK20463837/eclipse-workspace/guru99/src/main/java/cucumber/sin.feature",
   //path of step definition file
   glue = {"cucumber.meth"}//,
   ,tags = ("@only"),
		   monochrome=true,
		   plugin= {"pretty","html:target/cucumber-reports/reports2.html"}
   )
public class Runner {

}
