package webDriverDay4;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuTest {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver","P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
//		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	/*	System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
	*/	 
		 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo/accesskeys.html");
	}
	
	@Test
	public void testContextMenu() {
	  WebElement clickMeElement =  driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
	  WebElement editMenuItem = driver.findElement(By.cssSelector("li.context-menu-item.icon-edit"));
	  
	  Actions builder = new Actions(driver);
	  builder.contextClick(clickMeElement).moveToElement(editMenuItem).click().perform();
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	  Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	  assertEquals("clicked: edit", alert.getText());
	  alert.dismiss();
	}

	@Test
	public void testContextMenuWithKeys() {
	  WebElement clickMeElement = 
			  driver.findElement(By.cssSelector("div.context-menu-one.box.menu-1"));
	  
	  Actions builder = new Actions(driver);
	  builder.contextClick(clickMeElement)
	  	.sendKeys(Keys.chord(Keys.ALT, "e"))
	  	.perform();
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	  Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	  assertEquals("clicked: edit", alert.getText());
	  alert.dismiss();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
