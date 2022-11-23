package steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import all_pages.Login_page_elements;
import all_pages.New_account_elements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.BrowserFactory;

public class New_account_steps {

	WebDriver driver;

	New_account_elements new_account;
	Login_page_elements login;

@Given("^User will open browser$")
public void user_will_open_browser() throws Throwable {
	driver = BrowserFactory.startBrowser();
}


@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String username, String password) throws Throwable {
	login = PageFactory.initElements(driver,Login_page_elements.class);
	login.enterUserName(username);
	login.enterPassword(password);
	
	Thread.sleep(2000);
}


@When("^users clicks signin button$")
public void users_clicks_signin_button() throws Throwable {
   login.clickOnSignInButton();
}

@Then("^user will lands on Dashboard page$")
public void user_will_lands_on_Dashboard_page() throws Throwable {
  //login.Verify_dashboard();
	driver.getTitle();
}

@When("^user will be able to click on bank and cash button$")
public void user_will_be_able_to_click_on_bank_and_cash_button() throws Throwable {
	new_account = PageFactory.initElements(driver, New_account_elements.class);
   new_account.clickBank_cash_button();
   
}

@When("^user will be able to click on add account button$")
public void user_will_be_able_to_click_on_add_account_button() throws Throwable {
	new_account.click_new_account_button();
}

@When("^user will enter\"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
public void user_will_enter(String title, String desc, String initBalance, String acc_number, String person, String phone, String url) throws Throwable {
	new_account.enter_account_title(title);
	new_account.enter_account_description(desc);
	new_account.enter_initial_balance(initBalance);
	new_account.enter_account_number(acc_number);
	new_account.enter_contact_person(person);
	new_account.enter_phone_number(phone);
	new_account.enter_internet_banking_url(url);
	
}
 

@When("^user will click on submit button$")
public void user_will_click_on_submit_button() throws Throwable {
	new_account.click_submit_button();
}

@When("^takeScreenshotAtEndOfTest\\(WebDriver driver\\)$")
public void takescreenshotatendoftest_WebDriver_driver() throws Throwable {
	
	new_account.takescreenshoot();
}


@Then("^user will close the browser$")
public void user_will_close_the_browser() throws Throwable {
	
	 BrowserFactory.tearDown(); 
}


}
