package commoduledefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.BasePageDefinitions;
import compageobjectdefinition.OwnerDetailsPageObjects;
import compageobjectdefinition.VeterinariansPagePageObjects;
import utility.*;

public class VeterinariansDetailsPagePetClinic extends VeterinariansPagePageObjects {

	public VeterinariansDetailsPagePetClinic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static void verifyVeterinariansPage(WebDriver driver) {
		if (HandlingElementValidation.ElementPresent(driver, VeterinariansPagePageObjects.btn_Veterinarians)) {
			VeterinariansPagePageObjects.btn_Veterinarians.click();
			if (VeterinariansPagePageObjects.tbl_vets != null) {

				List<WebElement> tablevetsrows = VeterinariansPagePageObjects.tbl_vets.findElements(By.tagName("tr"));
				assertTrue("vets table is empty ", tablevetsrows.size() > 0);

			}
		}
	}
	
	public static void clickVeterinarians(WebDriver driver) {
		if(HandlingElementValidation.ElementPresent(driver, VeterinariansPagePageObjects.btn_Veterinarians)) {
			VeterinariansPagePageObjects.btn_Veterinarians.click();
		}
		
	}

}
