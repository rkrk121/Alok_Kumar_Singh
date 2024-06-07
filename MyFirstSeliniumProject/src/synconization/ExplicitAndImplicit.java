package synconization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAndImplicit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		WebElement logInLink = driver
				.findElement(By.xpath("//div[contains(@class,'Buttonsstyles')]//a[text()='Log in']"));
		logInLink.click();
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailTextFild = driver.findElement(By.id("username"));
		emailTextFild.sendKeys("eng1.jira@gmail.com");
		WebElement continueButton = driver.findElement(By.xpath("//span[text()='Continue']"));
		continueButton.submit();
		WebElement passwordTextFild = driver.findElement(By.id("password"));
		passwordTextFild.sendKeys("tester@123");
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginButton.submit();
		wait.until(ExpectedConditions.urlToBe("https://trello.com/u/tester1254/boards"));
		WebElement createNewBoardOpt = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoardOpt.click();
		WebElement boardTitleTextFild = driver.findElement(By.xpath("//input[@autocorrect='off']"));
		boardTitleTextFild.sendKeys("Alok K. Singh");
		WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
		wait.until(ExpectedConditions.elementToBeClickable(createButton));
		createButton.submit();
		driver.manage().window().minimize();
		driver.quit();

	}

}
