package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.xmlbeans.impl.regex.REUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Test1 {
	@Test
	public void demo() throws SQLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//Step:1 load the database
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		
		//Step:2 Connect to database
		Connection con = DriverManager
	.getConnection("jdbc:mysql://localhost:3306/advselenium","root","root");
		
		//Step:3 Create statement
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery("select * from logindeatils");
		
		while(result.next()) {
			System.out.println(result.getString(1)+result.getString(2));
			
		
		
		driver.findElement(By.id("username")).sendKeys(result.getString(1));
		driver.findElement(By.name("pwd")).sendKeys(result.getString(2));
		
		
	}
	}
}
