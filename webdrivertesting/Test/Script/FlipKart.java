package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipKart {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","P:\\Users\\u5365293\\Desktop\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Driver Opened");

		// System.setProperty("webdriver.firefox.driver","P:\\Akansha\\Selenium\\Selenium
		// 3.11.0\\resources\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// System.out.println("FireFox Driver Opened");

		String baseurl = "https://www.flipkart.com/";
		driver.get(baseurl);
		
		driver.manage().window().fullscreen(); // will do full screen
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 

		System.out.println("Filpkart Page Open");

		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		WebDriverWait edriver = new WebDriverWait(driver, 30);
//		edriver.until(ExpectedConditions.alertIsPresent());
//		
//		EventFiringWebDriver edriver1 = new EventFiringWebDriver(driver);
//		edriver1.getScreenshotAs(OutputType.FILE);
		
		driver.close();
		System.exit(0);

	}

}
