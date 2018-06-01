package Script;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://www.amazon.in/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.linkText("Apple iPhone 8 (Space Grey, 64GB)")).click();
	String Expectedurl = "https://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone+8&rh=i%3Aaps%2Ck%3Aiphone+8"
	;
	String actualurl = driver.getCurrentUrl();
	
	Assert.assertEquals(Expectedurl, actualurl);
	driver.close();

	}

}
