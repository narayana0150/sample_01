package general_uility;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Webdriver_utility {
	/**
	 * this method is used to match the speed between the autometion tool and the webdriver(to avoid the syncranization issue)
	 * @param driver
	 * @param timeinsec
	 */
	public void implicitywait(WebDriver driver,int timeinsec) {
		driver.manage().timeouts().implicitlyWait(timeinsec,TimeUnit.SECONDS);
	}
	/**
	 * this method is used for scrool the line
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void javascriptexcutor(WebDriver driver,int x,int y) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy('"+x+"','"+y+"')");
	}
	/**
	 * this method is used for switch one window to another window
	 * @param driver
	 * @param title
	 */
	public void windowshandle(WebDriver driver,String title) {
		Set<String> allids = driver.getWindowHandles();
		Iterator<String> itr=allids.iterator();
		while(itr.hasNext()) {
			String allidss = itr.next();
			String alltitles = driver.switchTo().window(allidss).getTitle();
			if(alltitles.contains(title)) {
				break;
			}
		}
	}
	/**
	 * this method is used for accepting the current operatilon[ex.delete]
	 * @param driver
	 */
		public void acceptallert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		/**
		 * this methos is used for cancel the operation [ex.not delete]
		 * @param driver
		 */
	public void dissmisallert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is used to focus the driver in particular webelement
	 * @param driver
	 * @param element
	 */
	public void movetoelemen(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element);
		act.perform();
	}
	/**
	 * this method is used for drad and drop the particular element to target 
	 * @param driver
	 * @param ele1
	 * @param ele2
	 */
	public void draganddrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2);
	}
	/**
	 * this method is used to drag and drop the webelement by using cordinates
	 * @param driver
	 * @param element
	 * @param x
	 * @param y
	 */
  public void draganddropby(WebDriver driver,WebElement element,int x,int y) {
	  Actions act=new Actions(driver);
	  act.dragAndDropBy(element, x, y);
  }
  /**
   * this method is used to perform the right click of mouse on particular webelement
   * @param driver
   * @param element
   */
  public void rightclick(WebDriver driver,WebElement element) {
	  Actions act=new Actions(driver);
	  act.contextClick(element);
	  act.perform();
  }
  /**
   * this method is used for maximize the window
   * @param driver
   */
  public void maximizethewindow(WebDriver driver) {
	  driver.manage().window().maximize();
  }
  /**
   * this method is used for minimize the window
   * @param driver
   */
  public void minimizethewindow(WebDriver driver) {
	 // driver.manage().window().minimize();
  }
  /**
   * this method is used to refresh the particular window
   * @param driver
   */
  public void refresh(WebDriver driver) {
	  driver.navigate().refresh();
  }
  /**
   * this ethod is used for backward the window form current window
   * @param driver
   */
  public void backward(WebDriver driver) {
	  driver.navigate().back();
  }
  /**
   * this method is used for forward the particuler window from current window
   * @param driver
   */
 public void forwardwindow(WebDriver driver) {
	 driver.navigate().forward();
 }
 /**
  * this methos is used for launch the particuler web application
  * @param driver
  * @param url
  */
 public void launchurl(WebDriver driver,String url) {
	 driver.navigate().to(url);
 }
 /**
  * this methos is used for take screen shots when test sript is fails this screen shots are used to subbmit the bug(or) defect
  * @param driver
  * @param foldpath
  * @throws Throwable
  */
 public void screenshot(WebDriver driver,String foldpath) throws Throwable {
	 TakesScreenshot tsc=(TakesScreenshot)driver;
	 File src=tsc.getScreenshotAs(OutputType.FILE);
	 File dest=new File(foldpath);
	 Files.copy(src, dest);
 }  
}























