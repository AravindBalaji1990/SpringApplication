package commoduledefinition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.BasePageDefinitions;
import compageobjectdefinition.HomePagePageObjects;
import utility.HandlingElementValidation;

public class HomePagePetClinic extends HomePagePageObjects {

	public HomePagePetClinic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static void validateLogo(WebDriver driver) {
		assertTrue("the welcome logo is not available", HomePagePageObjects.header_welcome.isDisplayed());
		assertTrue("the pet logo is not available", HomePagePageObjects.logo_pet.isDisplayed());

	}

	public static void clickAddOwner(WebDriver driver) {
		if (HandlingElementValidation.ElementPresent(driver, HomePagePageObjects.btn_findowners)) {
			HomePagePageObjects.btn_findowners.click();
		} else {
			System.err.println("the button is not enabled");
		}
	}

}
