package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	public FileInputStream fis;
	public Workbook wb;
	public Sheet sh;
	public Row row;
	public Cell cell;
	
	
	public String readDatafromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException {
		 fis=new FileInputStream("./testdatas/wdata.xlsx");
		 wb = WorkbookFactory.create(fis);
		 sh = wb.getSheet("Sheet1");
	     row = sh.getRow(1);
		 cell = row.getCell(5);
		return cell.getStringCellValue();
		
	}
	
	public String getDataFromApplication() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		return driver.getTitle();
		
	}
	
	public void writeDatatoExcel(int rownum,int cellnum,String data) throws IOException {
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fo=new FileOutputStream("./testdatas/wdata.xlsx");
		wb.write(fo);
		
	}
	
	@Test
	public void compareData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String excelData = readDatafromExcel();
		System.out.println("Pass"+excelData);

		String appData = getDataFromApplication();
		System.out.println("read the datat from app"+appData);
		writeDatatoExcel(1,6,appData);
		
		if(excelData.equals(appData)) {
			writeDatatoExcel(1,7,"PASS");
		}
		else
		{
			writeDatatoExcel(1,7,"FAIL");
		}
		
		
	
		
	}
	

}
