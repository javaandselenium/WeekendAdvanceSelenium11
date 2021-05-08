package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	@Test
	public void scrollingtoparticularElemnt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		WebElement ele = driver.findElement(By.xpath("//a[text()='Sell']"));

		// click on the element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

		// To get the Url of the application
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);

		// To get the Title of the application
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);

		// To refresh the page
		js.executeScript("history.go(0)");

		driver.close();
	}
}