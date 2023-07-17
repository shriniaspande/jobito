package jobito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException  {	
		
	    System.setProperty("webdriver.chrome.driver","D:\\Resume\\chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		wb.get("https://www.instagram.com/accounts/emailsignup/");
	    Thread.sleep(5000);
		WebElement email=wb.findElement(By.xpath("//input[@name='emailOrPhone']"));
		WebElement name=wb.findElement(By.xpath("//input[@name=\"fullName\"]"));
		WebElement username=wb.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password=wb.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement button=wb.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\" ][@type=\"submit\"]"));


		email.sendKeys("9096636803");
		name.sendKeys("shrinivas");
		username.sendKeys("shreepande7@gmail.com");
		password.sendKeys("shree@75");
		button.click();
	//	wb.close();
		
	}

	
		
	
}
