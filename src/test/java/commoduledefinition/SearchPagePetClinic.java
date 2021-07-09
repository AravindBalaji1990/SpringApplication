package commoduledefinition;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.BasePageDefinitions;
import compageobjectdefinition.HomePagePageObjects;
import compageobjectdefinition.OwnerDetailsPageObjects;
import utility.HandlingElementValidation;
import utility.Log;

public class SearchPagePetClinic extends HomePagePageObjects {

	public SearchPagePetClinic(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static void searchOwner(WebDriver driver, String data) {
		if (HandlingElementValidation.ElementPresent(driver, HomePagePageObjects.btn_findowners)) {
			if (HandlingElementValidation.ElementPresent(driver, HomePagePageObjects.txt_lastname)) {
				if (System.getProperty("lastname") == null) {
					HandlingElementValidation.TypeElement(driver, HomePagePageObjects.txt_lastname, data);
				} else {
					HandlingElementValidation.TypeElement(driver, HomePagePageObjects.txt_lastname,
							System.getProperty("lastname"));
				}

				HomePagePageObjects.btn_findownersubmit.click();

				for (int i = 0; i > HomePagePageObjects.tbl_searchdata.size(); i++) {
					if (data != null) {
						assertTrue(HomePagePageObjects.tbl_searchdata.get(i).getText().contains(data));
					} else {
						assertNotNull(data);
					}

				}

			}

		} else {
			System.err.println("the button is not enabled");
		}
	}

	public static void clickOwnerWithPets(WebDriver driver) throws IOException {
		HandlingElementValidation.ElementPresent(driver, HomePagePageObjects.tbl_owner);
		if (HomePagePageObjects.tbl_searchowner.size() > 0) {
			for (int i = HomePagePageObjects.tbl_searchowner.size() - 1; i >= 0; i--) {
				if (HomePagePageObjects.tbl_searchowner.get(i).getText()
						.contains(HandlingElementValidation.getDataFromProperties().getProperty("petname"))) {
					HandlingElementValidation.scrollintoview(driver, HomePagePageObjects.tbl_searchowner.get(i));
					WebElement ownerpetlist = driver.findElement(By.cssSelector("table#owners>tbody>tr:nth-child(" + i + ")>td:nth-child(1)>a"));
					HandlingElementValidation.expectedconditionWebElement(driver, ownerpetlist, 20);
					ownerpetlist.click();
					break;
				}
			}

		}

	}

}
