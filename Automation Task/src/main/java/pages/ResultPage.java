package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
	
	private WebDriver driver ;
	private WebDriverWait wait;
	private By AllBtn = By.xpath("//span[normalize-space()='الكل'] | //span[normalize-space()='All']");
	private By ImagesBtn = By.xpath("//a[normalize-space()='Images'] | //a[normalize-space()='صور']");
	private By NewsBtn = By.xpath("//a[normalize-space()='News'] | //a[normalize-space()='الأخبار']");
	private By videosBtn = By.xpath("//a[normalize-space()='Videos'] | //a[normalize-space()='فيديو']");
	private By mapsBtn = By.xpath("//a[normalize-space()='Maps'] | //a[normalize-space()='خرائط Google']");
	
	public ResultPage(WebDriver driver) {
		this.driver = driver;	
		}
	
	public boolean testRedirectionToResultPage(String object) {
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("google.com/search?q="));
		return driver.getCurrentUrl().contains("google.com/search?q="+object);
	}
	
	
	public boolean testAllButtonIsEnabled() {
		return driver.findElement(AllBtn).isEnabled();
	}
	
	public boolean testNewsButtonIsEnabled() {
		return driver.findElement(NewsBtn).isEnabled();
	}
	
	public boolean testImagesButtonIsEnabled() {
		return driver.findElement(ImagesBtn).isEnabled();
	}
	
	public boolean testvideosButtonIsEnabled() {
		return driver.findElement(videosBtn).isEnabled();
	}
	
	public boolean testmapsButtonIsEnabled() {
		return driver.findElement(mapsBtn).isEnabled();
	}

}
