package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownloadPopup 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.selenium.dev/downloads/");
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        WebElement currentVersion=driver.findElement(By.linkText("4.20.0"));
        currentVersion.click();
        driver.get("chrome://downloads/");
        Thread.sleep(2000);
        WebElement shadowHost01=driver.findElement(By.tagName("downloads-manager"));
        SearchContext shadowRoot01= shadowHost01.getShadowRoot();
        
        WebElement shadowHost02= shadowRoot01.findElement(By.id("frb0"));
        SearchContext shadowRoot02= shadowHost02.getShadowRoot();
        WebElement targetEle= shadowRoot02.findElement(By.cssSelector("cr-button[focus-type='save']"));
        targetEle.click();
        Thread.sleep(3000);
        
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
	}

}
