package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"txtUsername\"]")
	public static WebElement userName;
	
	@FindBy(xpath ="//*[@id=\"txtPassword\"]")
	public static WebElement password;
	
	@FindBy(xpath ="//*[@id=\"btnLogin\"]")
	public static WebElement loginButton;
	
	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")); } public static
	 * WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	 * 
	 * } public static WebElement loginButton(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")); }
	 */

}
