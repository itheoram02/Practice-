package all_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class Login_page_elements {

	WebDriver driver;

	public Login_page_elements(WebDriver driver) {
		this.driver = driver;
	}

	
	
	//*[@id="username"]
	
	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement Dashboard_page;

	// Interactive method
	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SignIn.click();
		
		
	}

	
	public void Verify_dashboard() {

		String actualTitle = "Login - iBilling";
		String expectedTitle = driver.getTitle();
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "page error verify lyour codes!!");
		//SoftAssert soft = new SoftAssert();

	}
}
