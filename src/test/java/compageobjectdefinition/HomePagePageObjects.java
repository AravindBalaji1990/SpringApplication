package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePageObjects extends BasePageDefinitions {

	public HomePagePageObjects(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath= "//a[contains(text(),'Add Owner') and @href='/owners/new']")
	public static WebElement btn_addowner;
	
	@FindBy(xpath ="//div/img[@src='/resources/images/pets.png']")
	public static WebElement logo_pet;
	
	@FindBy(xpath="//h2[contains(text(),'Welcome')]")
	public static WebElement header_welcome;
	
	@FindBy(xpath = "//*[contains(text(),'Find owners')]")
	public static WebElement btn_findowners;

	@FindBy(xpath= "//table[@id='owners']//tr")
	public static List<WebElement> tbl_searchdata;
	
	@FindBy(id = "lastName")
	public static WebElement txt_lastname;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	public static WebElement btn_findownersubmit;
	
	@FindBy(css = "table#owners")
	public static WebElement tbl_owner;
	
	@FindBy(css = "table#owners>tbody>tr")
	public static List<WebElement> tbl_searchowner;
	
	
	
	
	
}
