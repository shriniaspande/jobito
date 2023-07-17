package jobito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAgilepractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Resume\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
		WebElement login=driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
	//	WebElement login=driver.findElement(By.xpath("//input[@name='uid']"));

		login.sendKeys("9096636803");
		pass.sendKeys("Shree@7575");
		button.click();
	}
}
