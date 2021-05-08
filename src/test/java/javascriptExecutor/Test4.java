package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	@Test
	public void scrollingtoparticularElemnt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/advance%20selenium/disabled.html");
		WebElement ele = driver.findElement(By.id("t1"));
		System.out.println(ele.isEnabled());
		
		//pass the data inside disabled element
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t1').value='qwertyuiop'");
		
		//clear the value inside disabled element
		js.executeScript("document.getElementById('t1').value=''");
	}
}