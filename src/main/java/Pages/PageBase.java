package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	protected static WebDriver driver;

	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	protected static void clickButton(WebElement button) {
		button.click();

	}

	protected static void setTextInFields(WebElement textElement, String textValue) {
		textElement.sendKeys(textValue);
	}
	public void waitElement(WebElement Element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
}
