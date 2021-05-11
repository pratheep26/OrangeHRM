package loginPageUsingParameterTagUsingDDFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Correct_Username {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test
	@Parameters({"username", "password"})
	public void correctPassword(String uname, String pword) {
		
		WebElement userName=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		userName.sendKeys(uname);
		WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys(pword);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		submit.click();

	}

	@AfterSuite
	public void closeBrowser() {
		//driver.close();
	}
}
