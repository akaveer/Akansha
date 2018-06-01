package Script;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.tokens.DirectiveToken;

import com.google.gson.annotations.Until;

public class annapage {

	// In WebDriver - moveToElement//

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver","P:\\Akansha\\Selenium\\Selenium
		// 3.11.0\\resources\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",
				"P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS); 
		
		
		// Implicit
																			
		// wait

		// Explicit wait//

	

		String baseurl = "http://annauniv.edu/";
		driver.get(baseurl);
		Thread.sleep(3000);
		WebElement Departments = driver.findElement(By.linkText("Departments"));
		Departments.click();
		System.out.println("page is Open");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='link3']/strong"))).build().perform();
		
		// WebElement Civil =driver.findElement(By.xpath("//*[@id='menuItemHilite33']"));
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menuItemHilite33")));
		WebElement Civil = driver.findElement(By.id("menuItemHilite33"));
		Civil.click();

		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//*[@id='link3']"))).build().perform();
		WebElement Coastal = driver.findElement(By.xpath("//*[@id='menuItemHilite13']"));
		Coastal.click();

		driver.close();

	}

}
