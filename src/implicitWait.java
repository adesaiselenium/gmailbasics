import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class implicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Adding Extension to Chrome Allow Control Allow Origin 

		/*ChromeOptions co = new ChromeOptions();
		co.addExtensions(new File ("/Users/AshwiniDesai/Desktop/Selenium/Allow-Control-Allow-Origin_-__v1.0.3.crx"));
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(co.CAPABILITY,co);*/
        System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");
		
		ChromeOptions co = new ChromeOptions();
		co.addExtensions(new File("/Users/AshwiniDesai/Desktop/Selenium/Allow-Control-Allow-Origin_-__v1.0.3.crx"));
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, co);
		ChromeDriver d2 = new ChromeDriver(dc);
		
		
		d2.get("https://172.24.64.16:8443/gemvault-collection/api/articleTypes/activeArticleTypes");

		//Open new Tab

		/*Actions act = new Actions(d2);
		act.keyDown(Keys.COMMAND).sendKeys("t").keyUp(Keys.COMMAND).build().perform(); // Open new tab

       	ArrayList<String> tabs = new ArrayList<String> (d2.getWindowHandles()); 
     	d2.switchTo().window(tabs.get(1)); 
	
		String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND,Keys.RETURN); 
		d2.findElement(By.linkText("http://34.203.242.232/jtv4/#!/discover")).sendKeys(selectLinkOpeninNewTab);
		*/
        
        System.out.println("Testing");
       
        d2.get("http://34.203.242.232/jtv3/#!/discover");
        d2.findElement(By.className("myCollMenuLabel")).click();
		d2.switchTo().activeElement();
	    Thread.sleep(9000);
	
			// To enter the username/password
			d2.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("cust-7233353@jtv.com");
			d2.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[2]/div/input")).sendKeys("P@ssw0rd");
			d2.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[4]/button")).click();
			//d1.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);

			//To click on coachmark
			d2.findElement(By.xpath("//*[@id=\"btnCoachMarkNext\"]")).click();		
			Thread.sleep(5000);

			d2.findElement(By.xpath("//*[@id=\"btnCoachMarkOk\"]")).click();
		    Thread.sleep(9000);

		     d2.findElement(By.xpath("//*[@id=\"collection-landing\"]/div[1]/div/span[2]/span")).click();
		     Thread.sleep(6000);
		      /*
		     d2.findElement(By.xpath("//*[@id=\"classificationEditable\"]/select")).click();
			  Thread.sleep(6000);
			    
		  		Select oSelect = new Select(d2.findElement(By.xpath("//*[@id=\"classificationEditable\"]/select")));
		  	Thread.sleep(3000)
		  	oSelect.selectByIndex(2);  */
		     
		        JavascriptExecutor js = (JavascriptExecutor) d2;
		        WebElement Element=  d2.findElement(By.xpath("//*[@id=\"purchaseDateInput\"]"));
		     
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        
		        Element.click();
		        WebElement ele2 = d2.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[3]/div/div[1]/input"));
		        js.executeScript("arguments[0].scrollIntoView();", ele2);
		        ele2.sendKeys("New Gem");
		       
		        
	}

}
