package Tests;

import java.util.Scanner;

import org.junit.Assert;
import org.testng.annotations.Test;


import Pages.HomePage;
import Pages.SearchPage;

public class SearchTest extends TestBase {
	HomePage homeObject;
	SearchPage searchObject;

	@Test(priority = 1,alwaysRun = true)
	public void openHomePage()
	{
		homeObject= new HomePage(driver);
		homeObject.openHomePagebyLang();
	}
	@Test(dependsOnMethods = "openHomePage")
	public void openSearchPageResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter searchtext");
		String searchtxt = sc.nextLine();
		searchObject= new SearchPage(driver);
		searchObject.writeInSearchField(searchtxt, driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/search"));
		sc.close();
	}
}
