package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class LogIntoVigier 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
	      Thread.sleep(2000);
	      WebElement userNameTextFild=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[1]/input"));
	      userNameTextFild.sendKeys("alok123@g");
	      Thread.sleep(2000);
	      WebElement userPasswordTextFild=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[2]/input"));
	      userPasswordTextFild.sendKeys("123456789");
	      Thread.sleep(2000);
	      WebElement signInButton=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[3]/button"));
	      signInButton.click();
	}

}
