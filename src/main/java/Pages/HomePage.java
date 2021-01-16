package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "/html/body/div/div/main/div[2]/ul/li[1]/a")
	WebElement languagebtn;
	
	public void openHomePagebyLang() {
		clickButton(languagebtn);
	}
}
