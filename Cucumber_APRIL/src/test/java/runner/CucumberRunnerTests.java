package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(tags = "@smoke and not @sanity", features = "src/test/resource/Feature/Jobs.feature", 
glue = "GlueCode",
publish = true,
plugin = {"pretty","html:target/reports.html"})



 

//https://stackoverflow.com/questions/41034116/how-to-execute-cucumber-feature-file-parallel
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
 
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
 
}