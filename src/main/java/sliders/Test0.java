package sliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/slider/");
	
	driver.switchTo().frame(0);
	
	WebElement sliders = driver.findElement(By.xpath("//div[@id='slider']"));
Actions a=new Actions(driver);
a.dragAndDropBy(sliders,200,0).perform();
Thread.sleep(3000);
a.dragAndDropBy(sliders,-200,0).perform();

}
}