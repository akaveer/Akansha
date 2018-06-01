package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver",
		// "P:\\Akansha\\Selenium\\Selenium
		// 3.11.0\\resources\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://login.yahoo.com/?.src=ym&.intl=us&done=https%3A%2F%2Fmail.yahoo.com%2F&authMechanism=primary&eid=100&add=1";
		driver.get(baseurl);
		// driver.manage().window().fullscreen();

		driver.findElement(By.id("login-username")).sendKeys("akansha_verma85@yahoo.com");
		driver.findElement(By.id("login-signin")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("login-passwd")).sendKeys("Advik@1984");
		driver.findElement(By.id("login-signin")).click();

		String Expectedurl = "https://login.yahoo.com/?.src=ym&.intl=us&done=https%3A%2F%2Fmail.yahoo.com%2F&authMechanism=primary&eid=100&add=1";
		String Actualurl = driver.getCurrentUrl();

		if (Expectedurl.equals(Actualurl)) {
			System.out.println("Login Passed");
		}

		else {
			System.out.println("Login Failed");
		}

		// driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("********");
		// driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("Advik@1984");
		// driver.findElement(By.name("passwordContext")).sendKeys("Advik@1984");
		// driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Compose")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='message-to-field']")).sendKeys("akanshaverma44@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mail-app-component']/div[1]/div/div[1]/div[3]/div/div/input"))
				.sendKeys("Akansha Verma Test mail");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='editor-container']/div[1]"))
				.sendKeys("HI Sir. Test mail to check Script");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mail-app-component']/div[1]/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
