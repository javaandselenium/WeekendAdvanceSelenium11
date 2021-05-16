package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="admin";
		obj[0][1]="manager";
		
		obj[1][0]="12345";
		obj[1][1]="87687";
		
		obj[2][0]="admin6676%^";
		 obj[2][1]="manager678**";
		return obj;
		
	}
	
	@Test(dataProvider ="getData")
	public void login(String us,String pwd) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

}
