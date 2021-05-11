package testCases_POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Annotations;

import pageObjects.LoginPageObjects;

public class Login_TC {
	@Test
	public void loginPage() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.loginButton.click();
		
		driver.quit();
		
		
//		NOTE: We can find webelement without Annotations. how? There is had unique id at this webelement then its possible to use without annotations.
		
		/*
		 * LoginPageObjects.userName(driver).sendKeys("Admin");
		 * LoginPageObjects.password(driver).sendKeys("admin123");
		 * LoginPageObjects.loginButton(driver).click();
		 */

		/*
		 * WebElement userName=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		 * userName.sendKeys("Admin"); WebElement
		 * password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		 * password.sendKeys("admin123"); WebElement
		 * submit=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")); submit.click();
		 */
	}

}
