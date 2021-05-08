package dynamiccalender;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		//current date
		LocalDateTime d1=LocalDateTime.now();
		int year = d1.getYear();
		System.out.println(year);
		
		Date d=new Date();
		int month = d.getMonth();
		System.out.println(month);
		
		int date = d.getDate();
		System.out.println(date);
		
		driver.findElement(By.id("DepartDate")).click();
		
		driver.findElement(By.xpath("//td[@data-month='"+month+"' and  @data-year='"+year+"']/a[text()='"+date+"']")).click();
		
		
		
		
		
		
		
		
		

	}

}
