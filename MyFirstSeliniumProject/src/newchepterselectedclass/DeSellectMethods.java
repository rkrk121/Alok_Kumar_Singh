package newchepterselectedclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSellectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// file:///C:/Users/alok0/OneDrive/Desktop/dropdown.html
		//driver.get("file:///C:/Users/alok0/OneDrive/Desktop/dropdown.html");
		driver.get("file:///C:/Users/alok0/OneDrive/Desktop/dropmulti.html");
		
//		Thread.sleep(2000);
		WebElement carsDropDown = driver.findElement(By.xpath("//select[@multiple='carid']"));
		Select carsSelect = new Select(carsDropDown);
		
		if (carsSelect.isMultiple()) {
			carsSelect.selectByValue("1");
//			Thread.sleep(2000);
			carsSelect.selectByValue("2");
			Thread.sleep(2000);
			carsSelect.selectByVisibleText("Benz");
			Thread.sleep(2000);
			carsSelect.selectByIndex(1);
			Thread.sleep(2000);
			 carsSelect.deselectAll();
			carsSelect.deselectByValue("2");
		} 
		else 
		{
			System.out.println("The dropdown is single select!");

		}
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
