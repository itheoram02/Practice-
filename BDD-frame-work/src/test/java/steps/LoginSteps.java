package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import all_pages.Login_page_elements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	Login_page_elements login;

	
	@Given("^User is opening browser$")
	public void user_is_lounching_browser() {
		driver = BrowserFactory.startBrowser();

	}
	
	@When("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String Username,String Password) {
		
		login = PageFactory.initElements(driver, Login_page_elements.class);
		login.enterUserName(Username);
		login.enterPassword(Password);
		
	}
	
	@And("^user click signin button$")
	public void user_click_signin_button() {
		login.clickOnSignInButton();

	}

	@Then("^user will land on dashboard page$")
	public void user_will_land_on_dashboard_page() {
		
		
	//	login.Verify_dashboard();
	

	}
	
	@Then("^browser will closed automatically$")
	public void browser_will_closed_automatically() throws Throwable {
		
		
//		
//		BrowserFactory.tearDown();
		
	}

}
