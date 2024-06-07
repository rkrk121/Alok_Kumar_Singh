package activewebpageelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggessionInSearchFild 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Selenium");
		Thread.sleep(2000);
		 List<WebElement> allAutoSugs = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		 System.out.println(allAutoSugs.size());
		 for(WebElement sugs:allAutoSugs)
		 {
			String sugsText= sugs.getText();
			System.out.println(sugsText);
			if(sugsText.contains("grid"))
			{
				sugs.click();
				break;
			}
			
		 }

	}

}
