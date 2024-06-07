package activewebpageelement;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Lists;

public class HandleDefaultSuggessionInTheWebpageTextFild 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().click();
		Thread.sleep(2000);
		List<WebElement> allDefaultSugs = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		System.out.println(allDefaultSugs.size());
		for(WebElement Sug: allDefaultSugs)
		{
			String defsugText=Sug.getText();
			System.out.println(defsugText);
			if(defsugText.equals("finland happiest country")) 
			{
				Thread.sleep(2000);
				Sug.click();
				break;
			}
			
			
		}

	}

}
