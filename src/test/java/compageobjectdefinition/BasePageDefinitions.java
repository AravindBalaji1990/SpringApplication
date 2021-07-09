package compageobjectdefinition;

import org.openqa.selenium.WebDriver;

public class BasePageDefinitions {
	public static WebDriver driver = null;

	//Constructor
	public BasePageDefinitions(WebDriver driver) {
		BasePageDefinitions.driver = driver;
	}
}
