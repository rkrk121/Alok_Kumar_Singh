package assignmentselinium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RCBLogoScreenshot 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String timeSpan=LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		WebElement royalLogo=driver.findElement(By.xpath("//div[@class='col-md-1 lg-left']//img"));
		File tempFile=royalLogo.getScreenshotAs(OutputType.FILE);
		File premFile=new File("./buglogoshort/"+timeSpan+"royallogoscreenshot.png");
		FileUtils.copyFile(tempFile, premFile);
		driver.manage().window().minimize();
		driver.quit();
	}

}
