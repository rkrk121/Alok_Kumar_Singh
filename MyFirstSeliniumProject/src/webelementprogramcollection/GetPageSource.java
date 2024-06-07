package webelementprogramcollection;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dopsportsrecruitment.cept.gov.in/");
		String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		if(pagesource.contains("Last date for Document Verification is extended up to 29.02.2024.  This is the Final opportunity, Applicants are requested to get original documents verified at identified circle office on or before 29.02.2024"))
		{
			System.out.println("The last date for document verification has been announced");
		}
		else
		{
			System.out.println("The last date for document verification has not been announced");	
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
