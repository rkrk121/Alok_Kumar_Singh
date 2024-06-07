package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		WebElement emailTextFild=driver.findElement(By.cssSelector("input[placeholder='Email or phone']"));
//		WebElement emailTextFild=driver.findElement(By.cssSelector("input[type='email']"));
		int emailStartY=emailTextFild.getLocation().getY();
		System.out.println("emailStartY=" + emailStartY);
		WebElement passwordTextFild=driver.findElement(By.name("pass"));
		int passwordStartY=passwordTextFild.getLocation().getY();
        System.out.println("passwordStartY=" + passwordStartY);
        
        if(emailStartY==passwordStartY)
        {
        System.out.println("Pass:Email and password top alignment is verifide and found correct!");
        }
        else
        {
        System.out.println("Fail:Email and password top alignment is verifide and found Incorrect!");
        }
        driver.manage().window().minimize();
        driver.quit();
	}

}
