package remove_single_item;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pages.RemoveSingleItem;
import util.PracticalExam;




public class Remove_S_item_test {
	WebDriver driver;
	RemoveSingleItem remove;
	
	@Test
	public void remove_s_item() throws Throwable {
		
	driver = PracticalExam.launchBrowser();
		
	 remove = PageFactory.initElements(driver, RemoveSingleItem.class);
	
	
	 remove.check_S_item();
	 remove.remove_S_tem();
	 remove.takescreenshhot();
		
	}
	
	
	
}
