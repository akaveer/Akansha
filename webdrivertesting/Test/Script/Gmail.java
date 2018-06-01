package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

		// System.setProperty("webdriver.chrome.driver","P:\\Akansha\\Selenium\\Selenium
		// 3.11.0\\resources\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		String baseurl = "https://accounts.google.com/signin";
		driver.get(baseurl);
		// driver.manage().window().fullscreen();

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("akanshaverma44@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();

		// driver.findElement(By.className("whsOndzHQkBf")).sendKeys("gyanu1984");

		// WebElement password =
		// driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input']"));
		// password.sendKeys("gyanu1984");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,\'password\')]")).sendKeys("gyanu@1984");

		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("https://mail.google.com")).click();
		driver.findElement(By.className("WaidBe")).click();
		Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
Thread.sleep(3000);
WebElement  Tolist = driver.findElement(By.xpath("//*[@id=':mf']"));
Tolist.sendKeys("ketan@paratussystems.com");



	}

}
