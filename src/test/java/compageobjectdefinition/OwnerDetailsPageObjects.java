package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerDetailsPageObjects extends BasePageDefinitions {

	public OwnerDetailsPageObjects(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Add Owner')]")
	public static WebElement btn_addowner;

	@FindBy(id = "firstName")
	public static WebElement txt_firstname;

	@FindBy(id = "lastName")
	public static WebElement txt_lastname;

	@FindBy(id = "address")
	public static WebElement txt_address;

	@FindBy(id = "city")
	public static WebElement txt_city;

	@FindBy(id = "telephone")
	public static WebElement txt_telephone;

	@FindBy(xpath = "//button[contains(text(),'Add Owner')]")
	public static WebElement btn_addownersubmit;

	@FindBy(xpath = "//h2[contains(text(),'Owner Information')]")
	public static WebElement lbl_ownerinformation;

	@FindBy(xpath = "//button[contains(text(),'Update Owner')]")
	public static WebElement btn_updateownersubmit;

	@FindBy(xpath = "//span[contains(text(),'Find owners')]")
	public static WebElement btn_findowner;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr")
	public static WebElement tbl_ownerdetails;
	
	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr")
	public static List<WebElement> tbl_ownerdetailsrow;

	@FindBy(xpath = "//a[contains(@href,'edit') and contains(text(),'Owner')]")
	public static WebElement btn_editownerdetails;

}
