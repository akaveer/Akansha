package Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countoflink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String baseurl = "https://www.ebay.com/";
		driver.get(baseurl);
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for (int i=0; i<linklist.size(); i++){

	String linkText= 	linklist.get(i).getText();
		System.out.println(linkText);
			
	}

}}
