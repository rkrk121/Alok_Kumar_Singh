package synconization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoScript 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the empty chrome browser
		WebDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Trigger the URL
		driver.get("https://trello.com/");
		//click on login link
		WebElement loginLink=driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup')]/a[.='Log in']"));
		loginLink.click();
		//Thread.sleep(2000);
		//V& V of Login page
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		String expectedLoginPageTitle= driver.getTitle();
		System.out.println("expectedLoginPageTitle=" + expectedLoginPageTitle);
		String actualLoginPagaTitle="Log in to continue - Log in with Atlassian account";
		System.out.println("actualLoginPagaTitle=" + actualLoginPagaTitle);
		if(expectedLoginPageTitle.equals(actualLoginPagaTitle))
		{
			//Enter the Email
			WebElement emailTextFild=driver.findElement(By.id("username"));
			emailTextFild.sendKeys("eng1.jira@gmail.com");
			//click on continue button
			WebElement continueButton = driver.findElement(By.id("login-submit"));
			continueButton.submit();
			//Thread.sleep(2000);
			// Enter the password
			WebElement passwordTextFild=driver.findElement(By.id("password"));
			passwordTextFild.sendKeys("tester@123");
			//click on login button
			WebElement loginButton=driver.findElement(By.xpath("//span[.='Log in']"));
			loginButton.click();
			//Thread.sleep(2000);
			}
		else
		{
			System.out.println("Actual loginPage title is not" + " As per expected loginPageTitle ");
		}
		Thread.sleep(2000);
		// V & V board page
		String expectedBoardPageTitle=driver.getTitle();
		System.out.println("expectedBoardPageTitle" + expectedBoardPageTitle);
		String actualBoardPageTitle= "Boards | Trello";
		System.out.println("actualBoardPageTitle= " + actualBoardPageTitle);
		
		if(expectedBoardPageTitle.equals(actualBoardPageTitle))
		{
			//Click on createNewBoard
			WebElement createBoard=driver.findElement(By.xpath("//span[.='Create new board']"));
			createBoard.click();
			//Thread.sleep(2000);
			//Enter the board title
			WebElement boardTitle=driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
			boardTitle.sendKeys("Selenium Decent");
			//Thread.sleep(2000);
		}
		else
		{
			System.out.println("Actual boardpage title is not as per Expected boardpage title");
			
		}
		//V & V create button
		WebElement createButton=driver.findElement(By.xpath("//span[.='Create new board']"));
		if(createButton.isEnabled())
		{
			createButton.click();
			//Thread.sleep(2000);
		}
		else
		{
			System.out.println("Create button is dissable!");
			}
		//V & V expected create board page
		String expectedcreateboardpage=driver.getTitle();
		System.out.println("expectedcreateboardpage" + expectedcreateboardpage);
		String actualCreatedBoardPage="Selenium | Trello";
		System.out.println("actualCreatedBoardPage" + actualCreatedBoardPage);
		if(expectedcreateboardpage.equals(actualCreatedBoardPage))
		{
			System.out.println("Hurry...............Successful!");
			}
		else
		{
			System.out.println("So sad try again........good luck");
			}
		//Post condition
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
