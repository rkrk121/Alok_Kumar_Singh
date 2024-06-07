package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usertextFild=driver.findElement(By.id("username"));
	Actions action=new Actions(driver);
	action.keyDown(usertextFild, Keys.CONTROL).pause(2000).sendKeys(usertextFild, "a").pause(2000).sendKeys(usertextFild, Keys.DELETE).pause(2000).
	keyUp(usertextFild, Keys.CONTROL).pause(2000).sendKeys(usertextFild, Keys.DELETE).pause(2000).keyDown(usertextFild, Keys.SHIFT).pause(2000).sendKeys(usertextFild, "AlokKumar").pause(2000).
	keyUp(usertextFild, Keys.SHIFT).pause(2000).sendKeys(usertextFild, "Sitamarhi").perform();
	driver.manage().window().maximize();
	driver.quit();
	

	}

}
