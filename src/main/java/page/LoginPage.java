package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

	
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME;
@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD;
@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement LOGIN;
	
	public void putUserName(String username) {
		USERNAME.sendKeys(username);
		}
	public void putPassword(String password) {
		PASSWORD.sendKeys(password);
	}
	public void logIn() {
		LOGIN.click();
	}
}
