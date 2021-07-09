package comstepdefinitionpetclinic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commoduledefinition.VeterinariansDetailsPagePetClinic;
import hookdefinitions.HookIntialisation;
import io.cucumber.java.en.Then;

public class PetClinicVeterinarians {
	public WebDriver driver;

	public PetClinicVeterinarians() {
		driver = HookIntialisation.driver;
	}

	@Then("^I click on the veterinarians$")
	public void i_click_on_the_veterinarians() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, VeterinariansDetailsPagePetClinic.class);
		VeterinariansDetailsPagePetClinic.clickVeterinarians(driver);
	}

	@Then("^I Verify the list of veterinarians$")
	public void i_Verify_the_list_of_veterinarians() throws Throwable {
		PageFactory.initElements(driver, VeterinariansDetailsPagePetClinic.class);
		VeterinariansDetailsPagePetClinic.verifyVeterinariansPage(driver);
	}

}
