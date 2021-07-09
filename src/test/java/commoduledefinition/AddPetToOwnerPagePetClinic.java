package commoduledefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import compageobjectdefinition.AddPetsPagePageObjects;
import compageobjectdefinition.BasePageDefinitions;
import compageobjectdefinition.OwnerDetailsPageObjects;
import compageobjectdefinition.VeterinariansPagePageObjects;
import utility.*;

public class AddPetToOwnerPagePetClinic extends AddPetsPagePageObjects {

	public AddPetToOwnerPagePetClinic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static void clickPetDetails(WebDriver driver) {
		if (HandlingElementValidation.ElementPresent(driver, AddPetsPagePageObjects.btn_addnewpets)) {
			AddPetsPagePageObjects.btn_addnewpets.click();
		}
	}

	public static void addPetDetails(WebDriver driver) throws IOException {
		HandlingElementValidation.TypeElement(driver, AddPetsPagePageObjects.txt_petname, HandlingElementValidation.getDataFromProperties().getProperty("petname"));
		System.setProperty("petname", HandlingElementValidation.getDataFromProperties().getProperty("petname"));
		HandlingElementValidation.TypeElement(driver, AddPetsPagePageObjects.txt_petdob, HandlingElementValidation.getDataFromProperties().getProperty("dob"));
		Select pettype = new Select(AddPetsPagePageObjects.drp_pettype);
		int totalpettype = pettype.getOptions().size();
		pettype.selectByIndex(new Random().nextInt(totalpettype));
		AddPetsPagePageObjects.btn_addpets.click();
	}

	public static void verifyPetDetails(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		if (AddPetsPagePageObjects.tbl_petsandvisits.size() > 0) {
			for (int i = 0; i < AddPetsPagePageObjects.tbl_petsandvisits.size(); i++) {
				assertEquals("both values are not equal", System.getProperty("petname"),
						AddPetsPagePageObjects.tbl_petsandvisits.get(i).getText());
				break;

			}
		} else {
			assertTrue(AddPetsPagePageObjects.tbl_petsandvisits.size() > 0);
		}

	}
}
