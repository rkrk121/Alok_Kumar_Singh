package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement passwordTextFild = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.name("login"));
		Actions action=new Actions(driver);
		action.pause(2000).sendKeys("alok@123").pause(2000).sendKeys(passwordTextFild, "1234").pause(2000).click(loginButton).perform();
		//action.pause(2000).sendKeys("alok@123").pause(2000).sendKeys(passwordTextFild, "1234").pause(2000).sendKeys(Keys.ENTER).perform();
		// Updating code for pull
	}

}
