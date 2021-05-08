package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
@Test
public void demo1() {
	String url="https://demo.actitime.com/login.do";
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
	Reporter.log(driver.getTitle(),true);
driver.close();
}
}
