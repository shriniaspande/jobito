package jobito;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Resume\\chromedriver.exe");
//		WebDriver wb=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\userData.xlsx");  // step 1: give the path of File
		
		Workbook wb1=new XSSFWorkbook(fis);   //step 2: refer to workBook
		
		Sheet sh=wb1.getSheet("Sheet1");     //step 3: refer to sheet from the workbook
		
		Row rw=sh.getRow(0);
		
		int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();  // step 4 total count of rows
		
		Row newRw=sh.createRow(rowCount+1);
		
		for(int i=0;i<rw.getLastCellNum();i++) {
			Cell ch=newRw.createCell(i);
			ch.setCellValue("jobito india");	
		}
		
		fis.close();
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\userData.xlsx");
		wb1.write(fos);
		fos.close();
		
		
		
		
		
		
		
		

	}
}
