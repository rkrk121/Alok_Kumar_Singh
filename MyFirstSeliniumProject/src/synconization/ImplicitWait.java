package synconization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// Launch the empty chromebrowser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// trigger the url
		driver.get("https://trello.com/");
		// click on loginhttps://trello.com/ link
		WebElement loginLink = driver.findElement(By.xpath("//div[contains(@class, 'Buttonss')]//a[text()='Log in']"));
		loginLink.click();
		// Thread.sleep(2000);
		String expectedLogInPageTitle = driver.getTitle();
		System.out.println("expectedLogInPageTitle=" + expectedLogInPageTitle);
		String actualLoginPageTitle = "Log in with Atlassian account";
		System.out.println("actualLoginPageTitle=" + actualLoginPageTitle);
		WebElement emailTextField = driver.findElement(By.id("username"));
		emailTextField.sendKeys("eng1.jira@gmail.com");
		WebElement continueButton = driver.findElement(By.xpath("//span[text()='Continue']"));
		continueButton.submit();
		// Thread.sleep(2000);
		// Enter the password
		WebElement passwordTextFild = driver.findElement(By.id("password"));
		passwordTextFild.sendKeys("tester@123");
//click on login button
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginButton.submit();
//Thread.sleep(2000);
//v & v of board page
		String expectedBoardPageTitle = driver.getTitle();
		System.out.println("expectedBoardPageTitle=" + expectedBoardPageTitle);
		String actualBoardTitle = "Boards|Trello";
		System.out.println("actualBoardTitle=" + actualBoardTitle);
// click on create newboard
		WebElement createNewBoard = driver.findElement(By.xpath("//span[text()='Create new board']"));
		createNewBoard.click();
//Thread.sleep(2000);
// Enter the boardTitle
		WebElement boardTitleTextFild = driver
				.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		boardTitleTextFild.sendKeys("Alok K. Singh");
//Thread.sleep(2000);
//v & v createButton
		WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
		createButton.click();
//Thread.sleep(2000);
// v& v expectedCreateBoardPage
		String expectedCreateBoardPageTitle = driver.getTitle();
		System.out.println("expectedCreateBoardPageTitle= " + expectedCreateBoardPageTitle);
		String actualCreateBoardPage = "alok|Trello";
		System.out.println("actualCreateBoardPage=" + actualCreateBoardPage);
		System.out.println("Hurry..............Successful!");
////post cond
		driver.manage().window().minimize();
		driver.quit();

	}

}
