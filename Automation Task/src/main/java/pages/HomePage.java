package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver ;
	private WebDriverWait wait;
	private By searchBar = By.xpath("//input[@name='q']");
	private By searchBtn = By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']");
	private By voiceSearchBtn = By.xpath("//*[name()='path' and contains(@fill,'#4285f4')]");
	private By imgSearchBtn = By.xpath("//a[contains(@href,'/imghp')]");
	private By X_button = By.xpath("//*[name()='path' and contains(@d,'M19 6.41L1')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;	
		}
	
	
	public void searchUsingSearchBtn(String text) {

		wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
		driver.findElement(searchBar).sendKeys(text);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(.,'"+text+"')]")));
		driver.findElement(searchBar).sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
		driver.findElement(searchBtn).click();
	}
	
	public void searchUsingEnterBtn(String text) {

		wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
		driver.findElement(searchBar).sendKeys(text);
		driver.findElement(searchBar).sendKeys(Keys.ENTER);
	}
	
	
	public boolean testSearchBarIsEnabled() {
		return driver.findElement(searchBar).isEnabled();
	}
	
	public boolean testSearchButtonIsEnabled() {
		return driver.findElement(searchBtn).isEnabled();
	}
	
	public boolean testVoiceSearchButtonIsEnabled() {
		return driver.findElement(voiceSearchBtn).isEnabled();
	}
	
	public boolean testImageSearchButtonIsEnabled() {
		return driver.findElement(imgSearchBtn).isEnabled();
	}
	
	public boolean testXButtonIsEnabled() {
		return driver.findElement(X_button).isEnabled();
	}
	
	
}
