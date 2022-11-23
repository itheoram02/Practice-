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

public class RemoveSingleItem {
	WebDriver driver;

	public RemoveSingleItem(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[1]/input")
	WebElement S_item;
	

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement R_item;
	
	
	
	public void check_S_item() {

		S_item.click();

		
	}
	
	
	
	public void remove_S_tem() {

		R_item.click();

		
	}
	
	

//	public void toggle_all_verification() {
//	if (gugfyuiu.isSelected()) {
//
//		System.out.println("check boxes veried Successful!!!");
//	} else {
//		System.out.println("Toggle all box verification fail please refer to your webelements or revise the code as unit testing");
//	}
//}
	
	
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