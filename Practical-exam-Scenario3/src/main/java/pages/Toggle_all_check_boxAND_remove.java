package pages;

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

public class Toggle_all_check_boxAND_remove {
	WebDriver driver;

	public Toggle_all_check_boxAND_remove(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement TOGGLE_ALL_CHECK_BOX;
	
	
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON;

	public void toggle_all() {

		TOGGLE_ALL_CHECK_BOX.click();
	
	}

	public void toggle_all_verification() {
	if (TOGGLE_ALL_CHECK_BOX.isSelected()) {

		System.out.println("check boxes veried Successful!!!");
	} else {
		System.out.println("Toggle all box verification fail please refer to your webelements or revise the code as unit testing");
	}
}
	
	public void click_remove_button() throws Throwable {
		Thread.sleep(2000);
		REMOVE_BUTTON.click();
	}
	
	public void takescreenshhot() throws Throwable {
		Thread.sleep(2000);

		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));
	}
}