package jobito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.driver","D:\\Resume\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
	}
}
