package jobito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Resume\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.myntra.com/login");
		Thread.sleep(10000);
		WebElement mobileno=wb.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]"));
		WebElement button=wb.findElement(By.xpath("//button[@class=\"submitBottomOption\"]"));

	//	WebElement password=wb.findElement(By.xpath("//input[@type=\"password\"]"));
		mobileno.sendKeys("9096636803");
		Thread.sleep(10000);
		button.click();
		
	}
}
