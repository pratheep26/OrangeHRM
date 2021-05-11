package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateInfoPageObjects {
	
	@FindBy(xpath ="//a[@id='menu_pim_viewMyDetails']")
	public static WebElement updateMyInfo;
	
	@FindBy(id="btnSave")
	public static WebElement editButton;
	
	@FindBy(xpath ="//input[@id='personal_txtOtherID']")
	public static WebElement otherId;
	
	@FindBy(xpath ="//input[@id='personal_txtEmpNickName']")
	public static WebElement nickName;
	
	@FindBy(id ="btnSave")
	public static WebElement  saveButton;
	
	
	/*
	 * public static WebElement updateMyInfo(WebDriver driver) { return
	 * driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")); } public
	 * static WebElement editButton(WebDriver driver) { return
	 * driver.findElement(By.id("btnSave")); } public static WebElement
	 * otherId(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")); } public
	 * static WebElement nickName(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")); }
	 * public static WebElement saveButton(WebDriver driver) { return
	 * driver.findElement(By.id("btnSave")); }
	 */

}
