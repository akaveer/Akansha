package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS); 
		String baseurl = "https://www.redbus.in/";
		driver.get(baseurl);
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
		
		//driver.close();
		
		
	}

}
