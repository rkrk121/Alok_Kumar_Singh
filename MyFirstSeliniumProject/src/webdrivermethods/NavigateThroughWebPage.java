package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateThroughWebPage 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.isro.gov.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.isro.gov.in/index.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.isro.gov.in/RTI.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.isro.gov.in/ISROAPP/fFBFNC");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://www.isro.gov.in/ParliamentQuestions.html");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
