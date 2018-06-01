package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Driver Opened");
		String baseurl = "http://www.toolsqa.com/automation-practice-form/";
		driver.get(baseurl);
		//WebElement firstname = driver.findElement(By.name ("firstname"));
		WebElement firstname = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		firstname.sendKeys("Akansha ");
		// WebElement lastname = driver.findElement(By.name("lastName"));
		WebElement lastname = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input"));
		lastname.sendKeys("Verma");
		
		driver.quit();
	}

}
