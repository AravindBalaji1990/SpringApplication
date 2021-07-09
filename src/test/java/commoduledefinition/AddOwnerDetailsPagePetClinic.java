package commoduledefinition;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.BasePageDefinitions;
import compageobjectdefinition.OwnerDetailsPageObjects;
import utility.*;

public class AddOwnerDetailsPagePetClinic extends OwnerDetailsPageObjects {

	

	public AddOwnerDetailsPagePetClinic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static void enterOwnerDetails(WebDriver driver) throws IOException {
		
		
		OwnerDetailsPageObjects.btn_addowner.click();
		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.txt_firstname)) {
			HandlingElementValidation.TypeElement(driver, OwnerDetailsPageObjects.txt_firstname, HandlingElementValidation.getDataFromProperties().getProperty("firstname"));
			System.setProperty("firstname", HandlingElementValidation.getDataFromProperties().getProperty("firstname"));
		}
		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.txt_lastname)) {
			HandlingElementValidation.TypeElement(driver, OwnerDetailsPageObjects.txt_lastname, HandlingElementValidation.getDataFromProperties().getProperty("lastname"));
			System.setProperty("lastname", HandlingElementValidation.getDataFromProperties().getProperty("lastname"));
		}
		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.txt_address)) {
			HandlingElementValidation.TypeElement(driver, OwnerDetailsPageObjects.txt_address, HandlingElementValidation.getDataFromProperties().getProperty("address"));
			System.setProperty("address", HandlingElementValidation.getDataFromProperties().getProperty("address"));
		}
		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.txt_city)) {
			HandlingElementValidation.TypeElement(driver, OwnerDetailsPageObjects.txt_city, HandlingElementValidation.getDataFromProperties().getProperty("city"));
			System.setProperty("city", HandlingElementValidation.getDataFromProperties().getProperty("city"));
		}

		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.txt_telephone)) {
			HandlingElementValidation.TypeElement(driver, OwnerDetailsPageObjects.txt_telephone, HandlingElementValidation.getDataFromProperties().getProperty("telephone"));
			System.setProperty("telephone", HandlingElementValidation.getDataFromProperties().getProperty("telephone"));

		}

		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.btn_addownersubmit)) {
			OwnerDetailsPageObjects.btn_addownersubmit.click();
		}

	}

	public static void verifyOwnerDetails(WebDriver driver) {
		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.lbl_ownerinformation)) {
			if (OwnerDetailsPageObjects.tbl_ownerdetails != null) {
				assertTrue("the owner information is not as expeceted",
						OwnerDetailsPageObjects.tbl_ownerdetails.getText().contains(System.getProperty("lastname")));
				if (System.getProperty("newaddress") != null) {
					for (int i = 0; i < tbl_ownerdetailsrow.size(); i++) {
						if (OwnerDetailsPageObjects.tbl_ownerdetailsrow.get(i).getText()
								.contains(System.getProperty("newaddress"))) {
							Log.info("the address has been updaetd");
							break;
						}
					}
				}
			}

		}
	}

	public static void updateOwnerDetails(WebDriver driver) {
		if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.btn_editownerdetails)) {
			OwnerDetailsPageObjects.btn_editownerdetails.click();
			if (HandlingElementValidation.ElementPresent(driver, OwnerDetailsPageObjects.txt_address)) {
				int newaddress = new Random().nextInt(1000);
				System.setProperty("newaddress", String.valueOf(newaddress));
				HandlingElementValidation.TypeElement(driver, OwnerDetailsPageObjects.txt_address,
						String.valueOf(newaddress));
			}
		}

		OwnerDetailsPageObjects.btn_updateownersubmit.click();
	}

}
