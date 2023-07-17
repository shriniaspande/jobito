package jobito;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class seleniumDemo1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.Chrome.driver","\\Chrome112\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/live-mobile-testing-project.html");
	
		
	}
}
