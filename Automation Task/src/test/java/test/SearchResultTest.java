package test;

import pages.HomePage;
import pages.ResultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchResultTest {
	WebDriver driver ;
	
	ResultPage resultPageObj;
	HomePage homePageObj;
	private By acceptCookies = By.xpath("//*[@id=\"L2AGLb\"]/div");
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 try {
			 driver.findElement(acceptCookies).click();
		} catch (Exception e) {
			System.out.println("no prompt for cookies");
		}
		homePageObj = new HomePage(driver);
		homePageObj.searchUsingEnterBtn("instabug");
//		 driver.findElement(acceptCookies).click();
	}
	@Test
	public void verify_that_AllBtn_is_clickable() {
		
		resultPageObj = new ResultPage(driver);
        Assert.assertTrue(resultPageObj.testAllButtonIsEnabled());
	}
	
	@Test
	public void verify_that_NewsBtn_is_clickable() {
		resultPageObj = new ResultPage(driver);
        Assert.assertTrue(resultPageObj.testNewsButtonIsEnabled());
	}
	
	@Test
	public void verify_that_ImagesBtn_is_clickable() {
		resultPageObj = new ResultPage(driver);
        Assert.assertTrue(resultPageObj.testImagesButtonIsEnabled());
	}
	
	@Test
	public void verify_that_videosBtn_is_clickable() {
		resultPageObj = new ResultPage(driver);
        Assert.assertTrue(resultPageObj.testvideosButtonIsEnabled());
	}
	
	@Test
	public void verify_that_mapsBtn_is_clickable() {
		resultPageObj = new ResultPage(driver);
        Assert.assertTrue(resultPageObj.testmapsButtonIsEnabled());
	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
	

}
