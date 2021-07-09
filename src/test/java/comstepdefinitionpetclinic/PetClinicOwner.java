package comstepdefinitionpetclinic;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commoduledefinition.AddOwnerDetailsPagePetClinic;
import commoduledefinition.AddPetToOwnerPagePetClinic;
import commoduledefinition.AddVisitDetailsPetClinic;
import commoduledefinition.HomePagePetClinic;
import commoduledefinition.SearchPagePetClinic;
import commoduledefinition.VeterinariansDetailsPagePetClinic;
import hookdefinitions.HookIntialisation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PetClinicOwner {
	public WebDriver driver;

	public PetClinicOwner() {
		driver = HookIntialisation.driver;
	}

	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		driver.get("http://localhost:8083/");
	}

	@Then("^user checks for the welcome and logo$")
	public void user_checks_for_the_welcome_and_logo() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HomePagePetClinic homepagepetclinic = new HomePagePetClinic(driver);
		HomePagePetClinic.validateLogo(driver);
	}

	@When("^I click on Find Owners menu$")
	public void i_click_on_Find_Owners_menu() throws Throwable {
		HomePagePetClinic homepagepetclinic = new HomePagePetClinic(driver);
		HomePagePetClinic.clickAddOwner(driver);
	}

	@When("^I click on Add owner to fill the owner details$")
	public void i_click_on_Add_owner_to_fill_the_owner_details() throws Throwable {
		PageFactory.initElements(driver, AddOwnerDetailsPagePetClinic.class);
		AddOwnerDetailsPagePetClinic.enterOwnerDetails(driver);

	}

	@Then("^I Verify the Owner details$")
	public void i_click_on_Add_owner_to_add_the_details() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, AddOwnerDetailsPagePetClinic.class);
		AddOwnerDetailsPagePetClinic.verifyOwnerDetails(driver);
	}

	@Then("^I edit the Owner details$")
	public void i_edit_the_Owner_details() throws Throwable {
		PageFactory.initElements(driver, AddOwnerDetailsPagePetClinic.class);
		AddOwnerDetailsPagePetClinic.updateOwnerDetails(driver);
	}

	@Then("^user searches with the lastname$")
	public void user_searches_with_the_lastname(DataTable data) throws Throwable {
		PageFactory.initElements(driver, SearchPagePetClinic.class);
		List<Map<String, String>> datatosearch = data.asMaps(String.class, String.class);
		for (int i = 0; i < datatosearch.size(); i++) {
			System.setProperty("lastname", datatosearch.get(i).get("lastname"));
			SearchPagePetClinic.searchOwner(driver, datatosearch.get(i).get("lastname"));
		}
	}

	

}
