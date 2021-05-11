package testCases_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateInfoPageObjects;

public class UpdateMyInfo_TC {
	@Test
	public void updateInfo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.loginButton.click();
		
		PageFactory.initElements(driver, UpdateInfoPageObjects.class);
		
		UpdateInfoPageObjects.updateMyInfo.click();
		UpdateInfoPageObjects.editButton.click();
		UpdateInfoPageObjects.otherId.clear();
		UpdateInfoPageObjects.otherId.sendKeys("12345");
		UpdateInfoPageObjects.nickName.clear();
		UpdateInfoPageObjects.nickName.sendKeys("PVR");
		UpdateInfoPageObjects.saveButton.click();
		
		driver.quit();
		
		/*
		 * WebElement userName=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		 * userName.sendKeys("Admin"); WebElement
		 * password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		 * password.sendKeys("admin123"); WebElement
		 * submit=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")); submit.click();
		 * WebElement
		 * info=driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
		 * info.click(); WebElement edit=driver.findElement(By.id("btnSave"));
		 * edit.click(); WebElement
		 * otherId=driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
		 * otherId.clear(); otherId.sendKeys("333"); WebElement
		 * nickName=driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']"
		 * )); nickName.clear(); nickName.sendKeys("kutty"); WebElement
		 * save=driver.findElement(By.id("btnSave")); save.click();
		 */
	}

}
