package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/home/kishore/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		FbLoginObjects pom = new FbLoginObjects(driver);
		
		pom.userName().sendKeys("kishorekishore2610@gmail.com");
		
		Thread.sleep(3000);
		
		pom.passWord().sendKeys("smkishore");
		
		Thread.sleep(2000);
		
		pom.login().click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
