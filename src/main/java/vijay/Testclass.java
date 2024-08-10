package vijay;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	@Test
	    public void TestGoogle()throws Exception { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("God is good, All the time",Keys.ENTER);
	 	System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();}	
	
		@Test
		public void TestOrkut()throws Exception{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.orkut.com/");
		driver2.findElement(By.name("e")).sendKeys("God is good, All the time",Keys.ENTER);
	 	System.out.println(driver2.getTitle());
		Thread.sleep(3000);
		driver2.quit();	
	}	
}
