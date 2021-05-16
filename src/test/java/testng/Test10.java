package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Test10 {
	
	@Test
	public void demo() throws MalformedURLException {
URL remoteAddress=new URL("http://192.168.0.102:4444/wd/hub");
DesiredCapabilities capabilities =new DesiredCapabilities();
capabilities.setBrowserName("chrome");

	
	
WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");

}}
