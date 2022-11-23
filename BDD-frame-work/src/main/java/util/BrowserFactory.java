package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrowserFactory {
static WebDriver driver;


public static WebDriver startBrowser () {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\git_hub\\BDD-frame-work\\Chrome driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.techfios.com/billing/?ng=admin/");
return driver;
}


public static WebDriver tearDown () throws Throwable  {
	Thread.sleep(5000);
	driver.close();
	driver.quit();
	return driver;
}

}

