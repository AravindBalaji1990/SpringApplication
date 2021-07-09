package compageobjectdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VeterinariansPagePageObjects extends BasePageDefinitions {

	public VeterinariansPagePageObjects(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Veterinarians')]")
	public static WebElement btn_Veterinarians;

	@FindBy(xpath = "//table[@id='vets']/tbody")
	public static WebElement tbl_vets;

}
