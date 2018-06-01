package Script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class Triphobo {

	// drag and drop//

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"P:\\Akansha\\Selenium\\Selenium 3.11.0\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseurl = "https://www.triphobo.com/";
		driver.get(baseurl);

		// Actions action = new Actions(driver);
		// action.moveToElement(driver.findElement(By.className("btn btn-default
		// later-btn mod-btn"))).build().perform();

		// Alert alter = driver.switchTo().alert();
		// System.out.println(alter.getText());

		WebElement Later = driver.findElement(By.xpath("//button[.='Later']"));
		Later.click();
		Thread.sleep(3000);
		WebElement Text = driver.findElement(By.id("spl-autocomplete-search"));
		Text.sendKeys("Houston in Texas");

		WebElement search = driver.findElement(By.id("plan-my-trip"));
		search.click();

		WebElement PlanMyTrip = driver.findElement(By.xpath("//*[@id='spl-autocomplete-search']"));
		PlanMyTrip.sendKeys("Houston");
		Thread.sleep(3000);
		WebElement search1 = driver.findElement(By.xpath("//*[@id='plan-my-trip']"));
		search1.click();

		driver.close();
	}

}
