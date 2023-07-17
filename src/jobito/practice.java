package jobito;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Resume\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='quantity']"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("2");                                                      // we select dropdown value, index extra
	    WebElement buy=driver.findElement(By.xpath("//input[@class=\"button special\"]"));
		buy.click();
		WebElement cardno=driver.findElement(By.xpath("//input[@name=\"card_nmuber\"]"));
		cardno.sendKeys("9876543120659865");
		WebElement dropdownmonth=driver.findElement(By.xpath("//select[@name='month']"));
		Select slc=new Select(dropdownmonth);
		slc.selectByVisibleText("05");
		WebElement dropdownyear=driver.findElement(By.xpath("//select[@name='year']"));
		Select slm=new Select(dropdownyear);
		slm.selectByVisibleText("2025");
		WebElement cvv=driver.findElement(By.xpath("//input[@name=\"cvv_code\"]"));
        cvv.sendKeys("123");
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
        button.click();
        
        Alert al=driver.switchTo().alert();
        String msg=al.getText();
        System.out.println(msg);
        
        if(msg.contains("Check card number")) {
        	
        	System.out.println("error msg is correct");
        }
        else {
        	System.out.println("error msg is incorrect");
        }
        driver.switchTo().alert();
        al.accept();
        
	    WebElement cardnum=driver.findElement(By.linkText("Generate Card Number"));
	    cardnum.click();

		
	//	driver.close();
		
	//	WebElement link=driver.findElement(By.partialLinkText("Payment Gateway Project"));
		
		
	//	WebElement qu=driver.findElement(By.xpath("//a[@name='quantity']"));
	//	Select sel=new Select(qu);
	//	sel.selectByIndex(5);
     //   Thread.sleep(5000);
	//	link.click();
	//	qu.click();
	}
}
