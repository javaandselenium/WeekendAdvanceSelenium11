package dynamiccalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	@Test
	public void futureDate() {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.id("DepartDate")).click();
	
	while(true) {
		try {
			driver.findElement(By.xpath("//td[@data-month='4' and @data-year='2022']/a[text()='28']")).click();
		}
		catch(Exception e) {
			driver.findElement(By.xpath("(//a[@title='Next'])[2]")).click();
		}
	}
	
	}

}
