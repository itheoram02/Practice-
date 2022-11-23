package toggle_all_check_box_testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Toggle_all_check_boxAND_remove;
import util.PracticalExamScenario3;


public class all_boxAND_remove_testing {
	 WebDriver driver;
	 Toggle_all_check_boxAND_remove allBox ;
	
	 @Test
	public void all_boxAND_remove_tester() throws Throwable {
		
		driver = PracticalExamScenario3.launchBrowser();
		
		Thread.sleep(2000);
		 
	
		 allBox = PageFactory.initElements(driver, Toggle_all_check_boxAND_remove.class);
		 allBox.toggle_all();
		 allBox.toggle_all_verification();
		 allBox.click_remove_button();
		 allBox.takescreenshhot();
		 
		 driver =PracticalExamScenario3.closeBrowser();
	}
	
	
	

}
