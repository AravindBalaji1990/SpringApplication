package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPetsPagePageObjects extends BasePageDefinitions {

	public AddPetsPagePageObjects(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Add') or contains(@href,'pets')]")
	public static WebElement btn_addnewpets;

	@FindBy(id = "name")
	public static WebElement txt_petname;

	@FindBy(id = "birthDate")
	public static WebElement txt_petdob;

	@FindBy(name = "type")
	public static WebElement drp_pettype;

	@FindBy(xpath = "//button[contains(text(),'Add Pet')]")
	public static WebElement btn_addpets;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody//dl//dd")
	public static List<WebElement> tbl_petsandvisits;
}
