package jobito;



import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome112\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		WebElement getTitle=driver.findElement(By.tagName("title"));
		String pageTitle=getTitle.getText();
		
		System.out.println(pageTitle);	
		
	}
}
