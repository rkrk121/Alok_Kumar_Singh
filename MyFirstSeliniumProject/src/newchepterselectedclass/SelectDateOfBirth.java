package newchepterselectedclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDateOfBirth 
{
	// 15-08-2000

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		// Day
		WebElement daydroupDown=driver.findElement(By.id("day"));
		Select daySelect=new Select(daydroupDown);
		daySelect.selectByIndex(14);
		//month
		Thread.sleep(2000);
		WebElement monthDropDown=driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDropDown);
		monthSelect.selectByVisibleText("Aug");
		//Year
		Thread.sleep(2000);
		WebElement yearDroupDown=driver.findElement(By.id("year"));
		Select yearSelect=new Select(yearDroupDown);
		yearSelect.selectByValue("2000");
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
