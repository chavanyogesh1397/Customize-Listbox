import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class listbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(6000);
		//step 1
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Actions Act = new Actions(driver);
		Act.click(month).perform();
		Thread.sleep(2000);
		
		for(int i=1;i<=12;i++)
		{
			Act.sendKeys(Keys.ARROW_UP).perform();
		}
		for(int i=1;i<=5;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		Act.click().perform();
	}
}
