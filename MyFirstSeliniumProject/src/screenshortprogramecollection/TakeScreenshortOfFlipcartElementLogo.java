package screenshortprogramecollection;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshortOfFlipcartElementLogo
{

	public static void main(String[] args) throws IOException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	  String timeRefrence=LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.flipkart.com/");
	WebElement flipCartLogo=driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
	File tempFile =flipCartLogo.getScreenshotAs(OutputType.FILE);
	File premFile=new File("./elementerrorshort/"+timeRefrence+"/flipcartelementscreenshort.png");
	FileUtils.copyFile(tempFile, premFile);
	driver.manage().window().minimize();
	driver.quit();

	}

}
