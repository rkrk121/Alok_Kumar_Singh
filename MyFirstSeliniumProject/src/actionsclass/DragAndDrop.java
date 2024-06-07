package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		WebElement draggableElement=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(draggableElement, 80, 90).perform();

	}

}
