package Pages;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorksheetSectionPage extends PageBase {

	public WorksheetSectionPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(className = "question-preview")
	WebElement worksheetLink;

	public void openWorkSheet() {
		clickButton(worksheetLink);
	}
	public void getQuestionsCount(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		List<WebElement> fstList= driver.findElements(By.className("instance"));
		int count= fstList.size();
		System.out.println("the count is "+ count);

	}

}
