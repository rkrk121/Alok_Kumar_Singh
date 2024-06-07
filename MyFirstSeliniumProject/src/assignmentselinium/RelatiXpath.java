package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelatiXpath 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://services.india.gov.in/");
		WebElement textHeadLine=driver.findElement(By.xpath("//div[@class='post-box']//a[@href='https://services.india.gov.in/service/service_url_redirect?id=MjM3NjM=']"));
		textHeadLine.click();
	}

}
