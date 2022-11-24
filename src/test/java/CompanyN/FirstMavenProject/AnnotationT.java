package CompanyN.FirstMavenProject;



import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationT {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		@BeforeClass
		public void test1() {
			System. setProperty("webdriver.chrome.driver", "Driver/chromedriver");

			driver=new ChromeDriver();
			
		
	}
		@Test
		public void test2() {
		driver.get ("https://demoqa.com/") ;
	}

	
		@AfterClass
		public void test3() {
			driver.close();
		}
	}
