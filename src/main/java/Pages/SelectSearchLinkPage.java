package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectSearchLinkPage extends PageBase {

	public SelectSearchLinkPage(WebDriver driver) {
		super(driver);
	}
	
//	@FindBy(css =  "div.results > ul.list > li:nth-child(2)")
//	WebElement selectLink;
//	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a")
	WebElement selectLink;
	public void openLinkPage(WebDriver driver) {
		waitElement(selectLink, driver);
		clickButton(selectLink);
		//System.out.println(selectLink.getText());
	}

}
