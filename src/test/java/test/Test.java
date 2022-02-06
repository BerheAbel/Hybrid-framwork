package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class Test {
	
	WebDriver driver;
	ExcelReader read = new ExcelReader("src\\main\\java\\data\\EXLproject.xlsx");
	String username = read.getCellData("Sheet1", "USERNAME", 2);
	String password = read.getCellData("Sheet1", "PASSWORD", 2);
	@org.testng.annotations.Test
	public void verifyThePage() {
		driver = BrowserFactory.init();
       
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.putUserName(username);
		loginPage.putPassword(password);
		loginPage.logIn();
	}
}
