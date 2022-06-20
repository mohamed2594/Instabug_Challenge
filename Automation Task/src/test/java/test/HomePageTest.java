package test;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends BaseTest{
	HomePage homePageObj;
	
	@Test
	public void verify_That_SearchBar_Is_Accessible() {
		homePageObj = new HomePage(driver);
		Assert.assertTrue(homePageObj.testSearchBarIsEnabled());
	}
	
	@Test
	public void verify_That_SearchButton_Is_Clickable() {
		homePageObj = new HomePage(driver);
		Assert.assertTrue(homePageObj.testSearchButtonIsEnabled());
	}
	
	@Test
	public void verify_That_Image_SearchButton_Is_Clickable() {
		homePageObj = new HomePage(driver);
		Assert.assertTrue(homePageObj.testImageSearchButtonIsEnabled());
	}
	
	@Test
	public void verify_That_X_button_Is_Clickable() {
		homePageObj = new HomePage(driver);
		Assert.assertTrue(homePageObj.testXButtonIsEnabled());
	}

}
