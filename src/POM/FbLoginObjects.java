package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLoginObjects {
	
	WebDriver driver;
	
	public FbLoginObjects(WebDriver driver) {
		this.driver = driver;
	}	
	
	By userName = By.cssSelector("#email");
	By passWord = By.cssSelector("#pass");
	By login = By.name("login");
	
	public WebElement userName() {
		return driver.findElement(userName);
	}
	
	public WebElement passWord() {
		return driver.findElement(passWord);
		
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
}
