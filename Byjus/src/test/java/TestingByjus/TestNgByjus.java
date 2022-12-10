package TestingByjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ByjusAcademy.WatchVideos;

public class TestNgByjus {
	
	WebDriver driver;  // declared globally 
	WatchVideos a;
	
	
	@BeforeClass          // to launch the browser,url,to maximize (all this execute one time only)
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHAMMASHIL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=Cj0KCQjwy5maBhDdARIsAMxrkw30p2qYMoe8xOHblLDi_uHpY-rPiZwNcjD2aSjj0kksaMtQvK4RH9EaAthoEALw_wcB");
		
		
		
	}
	@BeforeMethod
	
	public void beforemethod() {
		JavascriptExecutor js = (JavascriptExecutor)driver;  // dragdown
		js.executeScript("window.scrollBy(0,4500)"); // scroll down
	}
	
	@Test
	public void test1() throws InterruptedException {
		 a = new WatchVideos(driver); // create object of class WatchVideos
		a.class4();
		Thread.sleep(2000);
		a.class5();
		Thread.sleep(4000);
		a.class6();
		Thread.sleep(6000);
		a.class7();
		Thread.sleep(8000);
		a.class8();
		Thread.sleep(9000);
		a.class9();
		Thread.sleep(1000);
		a.class10();
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void aftermethod() {
		// a=null;
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
	}

}
