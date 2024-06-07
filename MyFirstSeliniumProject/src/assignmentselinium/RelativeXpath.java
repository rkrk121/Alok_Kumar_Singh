package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		WebElement clickOnTheTargatedText=driver.findElement(By.xpath("//ul[@class='release_list']//a[@href='/PressReleseDetail.aspx?PRID=2008185']"));
		Thread.sleep(2000);
		clickOnTheTargatedText.click();

	}

}
