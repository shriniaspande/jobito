package jobito;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome112\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://demo.guru99.com/");
	   
	   WebElement login=driver.findElement(By.xpath("//input[@name='emailid']"));
	   login.sendKeys("shrinivaspande7@gmail.com");
	   WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
	   button.click();
	   WebElement 
	   
	}   
	   					
}
