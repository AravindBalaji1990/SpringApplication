package commoduledefinition;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.BasePageDefinitions;
import compageobjectdefinition.PetVisitsPagePageObjects;
import utility.HandlingElementValidation;
import utility.Log;

public class AddVisitDetailsPetClinic extends PetVisitsPagePageObjects {

	public AddVisitDetailsPetClinic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static void addVisitDetails(WebDriver driver) throws IOException {
		for (int i = 0; i < PetVisitsPagePageObjects.tbl_petrow.size(); i++) {
			if (PetVisitsPagePageObjects.tbl_petrow.get(i).getText().equals(System.getProperty("petname"))) {
				PetVisitsPagePageObjects.btn_petvisits.get(i).click();
				String datavisit = HandlingElementValidation.getDataFromProperties().getProperty("description") + new Random().nextInt(100);
				PetVisitsPagePageObjects.txt_description.sendKeys(datavisit);
				System.setProperty("petvisitdescription", "datavisit");
				PetVisitsPagePageObjects.btn_addvisits.click();
				break;
			}
		}
	}

	public static void clickAddVisitDetails(WebDriver driver) {
		for (int i = 0; i < PetVisitsPagePageObjects.tbl_petrow.size(); i++) {
			Log.info("the pets available : " +PetVisitsPagePageObjects.tbl_petrow.get(i).getText());
			if (PetVisitsPagePageObjects.tbl_petrow.get(i).getText().contains("timon")) {
				PetVisitsPagePageObjects.btn_petvisits.get(i).click();
				break;
			}
		}
	}

	public static void verifyVisitDetails(WebDriver driver) {
		for (int i = 0; i < PetVisitsPagePageObjects.tbl_checkupdetails.size(); i++) {
			if (PetVisitsPagePageObjects.tbl_checkupdetails.get(i).getText()
					.equals(System.getProperty("petvisitdescription"))) {
				Log.info("entry is available");
				break;
			} else {
				Log.error("entry not avaialble");
			}
		}
	}

	public static void verifyPreviousVisits(WebDriver driver) throws IOException {
		if(PetVisitsPagePageObjects.tbl_previousvisit.size()>1) {
			Log.info(PetVisitsPagePageObjects.tbl_previousvisit.get(1).getText());
			assertTrue(PetVisitsPagePageObjects.tbl_previousvisit.size()>1);
		}else {
			HandlingElementValidation.scrollintoview(driver, PetVisitsPagePageObjects.lbl_end);
			assertTrue(PetVisitsPagePageObjects.tbl_previousvisit.size()>1);
		}

	}

}
