package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "div.search")
	WebElement viewSearchBtn;
	
	
	@FindBy(id = "txt_search_query")
	WebElement searchTxt;
	
	@FindBy(id = "btn_global_search")
	WebElement  clickSearchBtn;
	
	public void writeInSearchField(String text, WebDriver driver)  {
		clickButton(viewSearchBtn);
		waitElement(searchTxt, driver);
		setTextInFields(searchTxt,  text);
		clickButton(clickSearchBtn);
	}

}
