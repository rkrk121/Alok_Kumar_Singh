package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLearnMore 
{

	public static void main(String[] args) throws InterruptedException 
	{

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://trello.com/");
Thread.sleep(2000);
WebElement learnMore=driver.findElement(By.xpath("//a[@href='https://community.atlassian.com/t5/Trello-articles/Accelerate-your-teams-work-with-Atlassian-Intelligence-AI/ba-p/2499009']"));
learnMore.click();

	}

}
