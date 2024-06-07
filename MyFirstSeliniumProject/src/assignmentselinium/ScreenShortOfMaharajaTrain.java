package assignmentselinium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShortOfMaharajaTrain 
{

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.the-maharajas.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile =ts.getScreenshotAs(OutputType.FILE);
		File premFile=new File("./errorshort/maharajatrainwebpagescreenshort.png");
		FileUtils.copyFile(tempFile, premFile);
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
