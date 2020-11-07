package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChromewithJunit {
	
	WebDriver driver;
	
	@Before
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\Session 1\\driver\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		
		//use implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		//driver.close();
		//dashboard will display
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"))));
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("xpathExpression"))));
		
		//driver.findElement(By.linkText("Add Deposit")).click();
		
	//	Thread.sleep(2000);
		
	//driver.close();
	//	driver.quit();
		
	}
	

}
