package test;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	
	WebDriver driver;
	private By acceptCookies = By.xpath("//*[@id=\"L2AGLb\"]/div");
	ChromeOptions options = new ChromeOptions();
	
    @BeforeClass
	public void TestsetUp() {
		 WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 try {
			 driver.findElement(acceptCookies).click();
		} catch (Exception e) {
			System.out.println("no prompt for cookies");
		}
	
		
		 
	}
    
    
    @AfterClass
    public void TesttearDown(){
        driver.quit();
    }
    

}
