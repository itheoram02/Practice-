package all_pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class New_account_elements {

	WebDriver driver;

	public New_account_elements(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement ACCOUNTS; // FOR ASSERTION

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]") //*[@id="side-menu"]/li[10]/a   
	WebElement BANK_CASH_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") //*[@id="side-menu"]/li[10]/ul/li[1]/a
	WebElement NEW_ACCOUNT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement ACCOUNT_DESCRIPTION;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITION_BALANCE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement INTERNET_BANKING_URL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_BUTTON;

	public void verify_if_you_are_on_account_page() {

		String expectedTitle = ACCOUNTS.getText();
		String actualTile = driver.getTitle();

		Assert.assertEquals(actualTile, expectedTitle);

	}

	public void clickBank_cash_button() {
		BANK_CASH_FIELD.click();

	}

	public void click_new_account_button() {
		NEW_ACCOUNT.click();
	}

	public void enter_account_title(String accountName) {
		ACCOUNT_TITLE_FIELD.sendKeys(accountName);

	}

	public void enter_account_description(String description) {
		ACCOUNT_DESCRIPTION.sendKeys(description);

	}

	public void enter_initial_balance(CharSequence balance) {
		INITION_BALANCE.sendKeys(balance);

	}

	public void enter_account_number(CharSequence acc_number) {
		ACCOUNT_NUMBER.sendKeys(acc_number);

	}

	public void enter_contact_person(String contact_person) {
		CONTACT_PERSON.sendKeys(contact_person);

	}

	public void enter_phone_number(CharSequence phone) {
		PHONE_NUMBER.sendKeys(phone);

	}

	public void enter_internet_banking_url(String url) {
		INTERNET_BANKING_URL.sendKeys(url);

	}

	public void click_submit_button() {
		SUBMIT_BUTTON.click();

	}
	
	public void takescreenshoot() throws Throwable {
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label +
		".png"));
		
	}

	
}
