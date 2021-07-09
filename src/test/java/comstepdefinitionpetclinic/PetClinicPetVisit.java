package comstepdefinitionpetclinic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commoduledefinition.AddPetToOwnerPagePetClinic;
import commoduledefinition.AddVisitDetailsPetClinic;
import commoduledefinition.SearchPagePetClinic;
import hookdefinitions.HookIntialisation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PetClinicPetVisit {
	public WebDriver driver;

	public PetClinicPetVisit() {
		driver = HookIntialisation.driver;
	}

	@Then("^I add a new pet for the owner$")
	public void i_add_a_new_pet_for_the_owner() throws Throwable {
		PageFactory.initElements(driver, AddPetToOwnerPagePetClinic.class);
		AddPetToOwnerPagePetClinic.clickPetDetails(driver);

	}

	@And("^I enter the pet details$")
	public void i_enter_the_pet_details() throws Throwable {
		PageFactory.initElements(driver, AddPetToOwnerPagePetClinic.class);
		AddPetToOwnerPagePetClinic.addPetDetails(driver);
	}

	@Then("^I verify the pet details$")
	public void i_verify_the_pet_details() throws Throwable {
		PageFactory.initElements(driver, AddPetToOwnerPagePetClinic.class);
		AddPetToOwnerPagePetClinic.verifyPetDetails(driver);
	}

	@Then("^I enter the visit details$")
	public void i_enter_the_visit_details() throws Throwable {
		PageFactory.initElements(driver, AddVisitDetailsPetClinic.class);
		AddVisitDetailsPetClinic.addVisitDetails(driver);
	}

	@Then("^I verify the visit details information$")
	public void i_verify_the_visit_details_information() throws Throwable {
		PageFactory.initElements(driver, AddVisitDetailsPetClinic.class);
		AddVisitDetailsPetClinic.verifyVisitDetails(driver);
	}

	@Then("^I click on owner with pets$")
	public void i_click_on_owner_with_pets() throws Throwable {
		PageFactory.initElements(driver, SearchPagePetClinic.class);
		SearchPagePetClinic.clickOwnerWithPets(driver);
	}

	@Then("^I verify the visit and pets$")
	public void i_verify_the_visit_and_pets() throws Throwable {
		PageFactory.initElements(driver, AddVisitDetailsPetClinic.class);
		AddVisitDetailsPetClinic.clickAddVisitDetails(driver);
		AddVisitDetailsPetClinic.verifyPreviousVisits(driver);
	}
}
