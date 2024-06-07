package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String faceBookHomePageUrl=driver.getCurrentUrl();
		System.out.println("faceBookHomePageUrl:"+faceBookHomePageUrl);

	}

}
// This program is for getting Current Url of any application