package general_uility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
 public  WebDriver driver;
	@BeforeSuite
	public void database() {
		System.out.println("database related");
	}
	@BeforeClass
	public void launchchrome() throws Throwable {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		Filee_utility FUTIL=new Filee_utility();
		String url = FUTIL.getproperties("URL");
		System.out.println(url);
		driver.get(url);
	}
	@BeforeMethod
	public void loginorsignin() throws Throwable {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	@AfterMethod
	public void logoutorsignout() throws Throwable {
		WebElement ele = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		Thread.sleep(5000);
	}
	@AfterClass
	public void closechrome() {
		driver.close();
	}
	@AfterSuite
	public void databaseclosed() {
		System.out.println("database closed");
	}
	

}
