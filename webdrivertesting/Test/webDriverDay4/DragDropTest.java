package webDriverDay4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DragDropTest {
	
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
	/*	System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();*/
		
		
	}

	@Test
	public void testDragDrop() {
		
		driver.get("http://www.cookbook.seleniumacademy.com/DragDropDemo.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
	//	System.out.println(target.getText());
		Actions builder = new Actions(driver);//Builder design Pattern
		builder.dragAndDrop(source, target).build().perform();
		builder.moveToElement(source).build().perform();//mouse hover
		builder.contextClick(source).build().perform();
		builder.dragAndDrop(source, target)
			   .moveToElement(source)
			   .contextClick(source)
			   .click()
			   .sendKeys("niche").build();
		
		//if ()
			 builder.doubleClick().build();
	//	else
			builder.click().build();
		builder.perform();
		
		//builder.
		
		try
		{
			System.out.println(target.getText());
			assertEquals("Dropped!", target.getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}
	
	@After
	public void tearDown()
	{
	//	driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}