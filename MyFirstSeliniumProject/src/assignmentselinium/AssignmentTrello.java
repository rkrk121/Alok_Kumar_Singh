package assignmentselinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentTrello {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.get("https://trello.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();

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
		WebElement createNewBoard = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoard.click();
		WebElement Boardtitle = driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		Boardtitle.sendKeys("Selenium Desent Batch");
		WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
		createButton.click();
		// wait.until(ExpectedConditions.elementToBeClickable(createButton));

		// wait.until(ExpectedConditions.urlToBe("https://trello.com/b/qyebTqh9/selenium-desent-batch"));
		// wait.until(ExpectedConditions.titleIs("Selenium Decent Batch | Trello"));
		WebElement listTitle = driver.findElement(By.xpath("//textarea[@dir='auto']"));
		Actions action = new Actions(driver);
		action.sendKeys("Topic").sendKeys(Keys.ENTER).pause(2000).sendKeys("Selenium").sendKeys(Keys.ENTER).pause(2000)
				.sendKeys("Java").sendKeys(Keys.ENTER).pause(2000).sendKeys("Manual").sendKeys(Keys.ENTER).pause(2000)
				.perform();

		WebElement addCard = driver.findElement(By.xpath("(//button[@data-testid='list-add-card-button'])[1]"));
		addCard.click();
		action.sendKeys("Locator").sendKeys(Keys.ENTER).pause(2000).sendKeys("Collection").sendKeys(Keys.ENTER)
				.pause(2000).sendKeys("Agile").sendKeys(Keys.ENTER).pause(2000).perform();
		
		
		WebElement src = driver.findElement(By.xpath("//a[.='Locator']"));
		WebElement dst = driver.findElement(By.xpath("//textarea[.='Selenium']"));
		action.dragAndDrop(src, dst).perform();

		WebElement src1 = driver.findElement(By.xpath("//a[.='Collection']"));
		WebElement dst1 = driver.findElement(By.xpath("//h2[.='Java']"));
		action.dragAndDrop(src1, dst1).perform();
		
		
		
		WebElement src3 = driver.findElement(By.xpath("//a[.='Agile']"));
		WebElement dst3 = driver.findElement(By.xpath("//h2[.='Manual']"));
		action.dragAndDrop(src3, dst3).perform();
	

	}

}
