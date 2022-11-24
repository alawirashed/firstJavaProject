package CompanyN.FirstMavenProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void Test1() throws InterruptedException{
		System. setProperty("webdriver.chrome.driver", "Driver/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get ("https://demoqa.com/") ;
		
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//[text()='card-body']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Web Table']")).click();
		
		driver.close();
}
}
