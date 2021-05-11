package loginPageUsingExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Login_Page {

	WebDriver driver;

	String [] [] data=null;

	@DataProvider(name="loginData")
	public Object[][] loginDataProvider() throws FileNotFoundException,  BiffException, IOException  {
		data=getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException  {
		File src=new File("C:\\Users\\ADMIN\\Desktop\\Project_Selenium\\Login_Credential.xls");
		FileInputStream excel=new FileInputStream(src);
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		int rowCount= sheet.getRows();
		int columnCount=sheet.getColumns();

		String testData [][]=new String[rowCount-1][columnCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}

		return testData;

	}

	@BeforeTest
	public void launchBrowser() {
		driver=new ChromeDriver();
		

	}

	@Test(dataProvider = "loginData")
	public void login(String uname, String pword) throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		WebElement userName=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		userName.sendKeys(uname);
		//Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys(pword);
		//Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		submit.click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
