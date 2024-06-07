package webdrivermethods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokemLinks 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("allLinks"+ allLinks.size());
		for (WebElement link : allLinks) 
		{
			String url=link.getAttribute("href");
			brokenLink(url);
		}
		driver.quit();
	}
			
		public static void brokenLink(String urlLink)
		{
			try
			{
				URL url = new URL(urlLink);
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				huc.setConnectTimeout(5000);
				huc.connect();
				if(huc.getResponseCode() >=400)
				{
					System.out.println(urlLink + "------"+ huc.getResponseMessage()+ "Broken Link");
				}
				else
				{
					System.out.println(urlLink + "-----" + huc.getResponseCode());
				}
						
			}
			catch(Exception e)
			{
				//Todo:handle exception
			}

	}

}
