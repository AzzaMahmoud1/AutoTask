package Tests;


import org.junit.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;

public class LanguagePageTest extends TestBase {

	
	HomePage homeObject;
	
	
	
	 
	@Test(priority = 1, alwaysRun = true)
	public void selectLang() {
		homeObject= new HomePage(driver);
		homeObject.openHomePagebyLang();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nagwa.com/en/"));
	}
}
