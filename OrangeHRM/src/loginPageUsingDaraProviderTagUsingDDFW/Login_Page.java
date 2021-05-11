package loginPageUsingDaraProviderTagUsingDDFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Page {

	WebDriver driver;

	String [] [] data=	{
			{"Admin", "admin123"},
			{"Adminn", "admin1234"},
			{"Admin", "admin1234"},
			{"Adminn", "admin123"}
	};

	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}

	@Test(dataProvider = "loginData")
	public void login(String uname, String pword) {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement userName=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		userName.sendKeys(uname);
		WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys(pword);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		submit.click();
	}
}
