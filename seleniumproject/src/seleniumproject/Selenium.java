package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("selenium tutorials");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(10000);
		String at=driver.getTitle();
		String et="youtube";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Youtube Succesfulls");
		}
		else
		{
			System.out.println("Youtube");
		}
	}

}
