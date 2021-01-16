package Tests;

import java.util.Scanner;

import org.junit.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchPage;
import Pages.SelectSearchLinkPage;
import Pages.WorksheetSectionPage;

public class WorksheetSectionTest extends TestBase{
	HomePage homeObject;
	SearchPage searchObject;
	SelectSearchLinkPage linkObject;
	WorksheetSectionPage worksheetObject;

	@Test(priority = 1,alwaysRun = true)
	public void openHomePage()
	{
		homeObject= new HomePage(driver);
		homeObject.openHomePagebyLang();
	}
	@Test(dependsOnMethods = "openHomePage")
	public void openSearchPageResults()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter searchtext");
		String searchtxt = sc.nextLine();
		searchObject= new SearchPage(driver);
		searchObject.writeInSearchField(searchtxt, driver);
		sc.close();
	}
	@Test(dependsOnMethods ="openSearchPageResults" )
	public void openSecondLink() {
		linkObject= new SelectSearchLinkPage(driver);
		linkObject.openLinkPage(driver);

	}
	@Test(dependsOnMethods ="openSecondLink" )
	public void openSheetPage() throws InterruptedException {
		//	Thread.sleep(3000);
		worksheetObject= new WorksheetSectionPage(driver);
		worksheetObject.openWorkSheet();
		worksheetObject.getQuestionsCount(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/worksheets"));
	}

}
