package comstepdefinitionpetclinic;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utility.Log;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/petclinic", glue = { "hookdefinitions",
		"comstepdefinitionpetclinic" }, monochrome = true, plugin = { "pretty", "html:target/cucumber",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, dryRun = false)
// tags = {"@owner","@petvisit","@veterinarians" })
public class TestRunner {

	@BeforeClass
	public static void runthejar() throws IOException, InterruptedException {
		File dir = new File(System.getProperty("user.dir") + "\\Jar");
		ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "Start", "runapplication.bat");
		pb.directory(dir);
		Process p = pb.start();
		// provided this static wait for the Bat file to run and kick start
		Thread.sleep(9000);
		Log.info("the petclinic jar is started");
	}

	@AfterClass
	public static void terminatethejar() throws IOException {
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		Log.info("the petclinic jar is terminated");
	}
}