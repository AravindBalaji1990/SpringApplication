package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetVisitsPagePageObjects extends BasePageDefinitions {

	public PetVisitsPagePageObjects(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Visit') or contains(@href,'Visits/new')]")
	public static List<WebElement> btn_petvisits;

	@FindBy(id = "description")
	public static WebElement txt_description;

	@FindBy(xpath = "//button[contains(text(),'Add Visit')]")
	public static WebElement btn_addvisits;

	@FindBy(xpath = "//table[@class='table-condensed']/tbody/tr/td")
	public static List<WebElement> tbl_checkupdetails;
	
	@FindBy(xpath = "//dl[@class='dl-horizontal']")
	public static WebElement tbl_petname;
	
	@FindBy(xpath = "//dl[@class='dl-horizontal']/dd")
	public static List<WebElement> tbl_petrow;
	
	@FindBy(xpath = "//b[contains(text(),'Previous Visits')]/following::table/tbody/tr")
	public static List<WebElement> tbl_previousvisit;
	
	@FindBy(xpath ="//img[@alt='Sponsored by Pivotal']")
	public static WebElement lbl_end;

}
