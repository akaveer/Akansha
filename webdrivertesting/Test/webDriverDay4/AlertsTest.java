package webDriverDay4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AlertsTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		/*System.setProperty("webdriver.ie.driver", "test\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();*/
		//driver = new FirefoxDriver();
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
	}
	
	@Test
	public void testSimpleAlert()
	{
		//Clicking button will show a simple Alert with OK Button
		WebElement button = driver.findElement(By.id("simple"));
	//	System.out.println("About to click on a button");
		button.click();
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	//		System.out.println("Seems there is a problem in Thread.sleep()");
		}
		try {
			
			//Get the Alert
		//	fail("Alert was expected but do not know what developer has done");
			System.out.println("About to switch to an alert");
			Alert alert = driver.switchTo().alert();//new Alert() indirectly
			//Alert alert = new Alert();
			
			//Get the Text displayed on Alert using getText() method of Alert class
			String textOnAlert = alert.getText();
			
			//Click OK button, by calling accept() method of Alert Class
			alert.accept();
			
			//Verify Alert displayed correct message to user
			assertEquals("Hello! I am an alert box!",textOnAlert);
			System.out.println("Post verification");
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			System.out.println("Alert was not present");
			fail("Alert was expected but do not know what developer has done");
		}
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConfirmAccept()
	{
		//Clicking button will show a Confirmation Alert with OK and Cancel Button
		WebElement button = driver.findElement(By.id("confirm"));
		button.click();
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		
			//Get the Alert
			Alert alert = driver.switchTo().alert();
			
			//Click OK button, by calling accept() method of Alert Class
			alert.accept();
			
			//Verify Page displays correct message on Accept
			WebElement message = driver.findElement(By.id("demo"));
			assertEquals("You Accepted Alert!", message.getText());
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConfirmDismiss()
	{
		//Clicking button will show a Confirmation Alert with OK and Cancel Button
		WebElement button = driver.findElement(By.id("confirm"));
		button.click();
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			//Get the Alert
			Alert alert = driver.switchTo().alert();
			
			//Click Cancel button, by calling dismiss() method of Alert Class
			alert.dismiss();

			//Verify Page displays correct message on Dismiss
			WebElement message = driver.findElement(By.id("demo"));
			assertEquals("You Dismissed Alert!", message.getText());
			
		} catch (NoAlertPresentException e) {
		//	e.printStackTrace();
			fail("alert was expected but not found");
		}
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPrompt()
	{
		//Clicking button will show a Prompt Alert asking user to enter
		//value/text with OK and Cancel Button
		WebElement button = driver.findElement(By.id("prompt"));
		button.click();
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			//Get the Alert
			Alert alert = driver.switchTo().alert();

			//Enter some value on Prompt by calling sendKeys() method of Alert Class
			alert.sendKeys("Foo");
			
			
			//Click OK button, by calling accept() method of Alert Class
			alert.accept();
			
			//Verify Page displays message with value entered in Prompt
			WebElement message = driver.findElement(By.id("prompt_demo"));
			assertEquals("Hello Foo! How are you today?", message.getText());
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		//Sleep is introduced below is purely for demo purpose so you can see 
				// the effect of action on the page before it closes and not to be used
				//in actual test cases as it delays the overall test execution
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}
}
