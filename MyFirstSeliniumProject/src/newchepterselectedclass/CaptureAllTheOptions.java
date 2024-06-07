package newchepterselectedclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllTheOptions
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(4000);
		//yearDroupdown
		WebElement yearDropdown=driver.findElement(By.id("year"));
		Select yearSelect=new Select(yearDropdown);
	List<WebElement> allYearOptstions=yearSelect.getOptions();
	System.out.println(allYearOptstions.size());
	for(WebElement opt :allYearOptstions)
	{
		String optText=opt.getText();
		System.out.println(optText);
		yearSelect.selectByVisibleText(optText);
		if(opt.isSelected())
		{
			System.out.println("The Year option is in the selectable formate!");
		}
		else
		{
			System.out.println("The Year option is  not in the selectable formate!");	
			
		}
	}
		
		Thread.sleep(4000);
		//MonthDroupdown
		WebElement monthDroupdown=driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDroupdown);
		List<WebElement> allMonthOptions = monthSelect.getOptions();
		System.out.println(allMonthOptions.size());
		for(WebElement monthOpt: allMonthOptions)
		{
			String monthOptionText=monthOpt.getText();
			System.out.println(monthOptionText);
			monthSelect.selectByVisibleText(monthOptionText);
			
		if(monthOpt.isSelected())
		{
			System.out.println("The Month option is in the selectable formate!");
		}
		else 
		{
		System.out.println("The Month option is not in the selectable formate!");
		}
		}
		Thread.sleep(4000);
		//DayDroupdown
		WebElement dayDropdown=driver.findElement(By.id("day"));
		Select daySelect= new Select(dayDropdown);
		List<WebElement> allDayOption = daySelect.getOptions();
		System.out.println(allDayOption.size());
		for(WebElement dayOption:allDayOption)
		{
			String dayOptionText=dayOption.getText();
			System.out.println(dayOptionText);
			daySelect.selectByVisibleText(dayOptionText);
			if(dayOption.isSelected())
			{
		System.out.println("The Day option is in the selectable formate!");
			}
			else
			{
		System.out.println("The Day option is in the selectable formate!");
			}
		}
		driver.manage().window().minimize();
		driver.quit();
		
	
	
	}
}
	
	
		

	


