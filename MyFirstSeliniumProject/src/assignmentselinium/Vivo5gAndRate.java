package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vivo5gAndRate 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/tyy/4io/~cs-mrx9on1jx0/pr?sid=tyy%2C4io&collection-tab-name=vivo+T2x+New+colour&param=76576&otracker=clp_bannerads_1_14.bannerAdCard.BANNERADS_a_mobile-phones-store_GRCPCWYWGI2R");
		WebElement clickOnVivo5g=driver.findElement(By.xpath("//div[text()='vivo T2x 5G (Black Gladiator, 128 GB)']/..//li[@class='rgWa7D']/../../../..//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		clickOnVivo5g.click();

	}

}
