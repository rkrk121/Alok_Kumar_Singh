package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObSecuredEle 
{
	//EleClickInterceptedException...del....run.....unchecked
	//ObscuredEle

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	WebElement dismissButton = driver.findElement(By.xpath("//span[contains (text(),'Dismiss' )]/..//input[@data-action-type='DISMISS']"));
    dismissButton.click();
    Thread.sleep(2000);
    WebElement customerServiceButton = driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice']"));
    customerServiceButton.click();
    
    
		
	}

}
