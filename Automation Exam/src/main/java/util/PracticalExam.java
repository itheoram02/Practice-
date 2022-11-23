package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PracticalExam {
	static  WebDriver driver;


	public static WebDriver launchBrowser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\git_hub\\practical-exam-scenario1\\Chrome driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.getTitle();
		System.out.println("Chrome browser opened succesfully");
		System.out.println(driver.getTitle());
 return driver;
	}

	//@After
	public static WebDriver closeBrowser() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		System.out.println("Chrome browser Closed succesfully");

		 return driver;

	}

}
