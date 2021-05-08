package chromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void scrollingtoparticularElemnt() throws InterruptedException {
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.name("origin")).sendKeys("5678ygu");
}
}