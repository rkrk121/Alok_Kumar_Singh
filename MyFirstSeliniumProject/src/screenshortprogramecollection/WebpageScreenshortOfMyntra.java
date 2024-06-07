package screenshortprogramecollection;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageScreenshortOfMyntra 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String timeRefrence=LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.myntra.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		File premFile= new File("./bugshot/"+timeRefrence+"/mintrawebpageahort.png");
		FileUtils.copyFile(tempFile, premFile);
		driver.manage().window().minimize();
		driver.quit();

	}

}
