import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gMailBasics {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");

		WebDriver d1 = new ChromeDriver();
		//WebDriver d2 = new ChromeDriver();


	d1.get("https:www.gmail.com");
	
	// To enter the eMail and Password
	////*[@id="classificationEditable"]/select
	d1.findElement(By.id("identifierId")).sendKeys("ashwini.sinchana27@gmail.com");
	
	d1.findElement(By.xpath("//span[.='Next']")).click();
	Thread.sleep(5000);
	d1.findElement(By.xpath("//*[@name='password']")).sendKeys("ashu@21sanja");
	d1.findElement(By.xpath("//span[.='Next']")).click();
	Thread.sleep(2000);
	Thread.sleep(5000);
	
	// To click on the 'Compose' button
	d1.findElement(By.xpath("//*[@id=':ik']/div/div")).click();
	Thread.sleep(5000);
	// To enter the 'To' address
	d1.findElement(By.className("vO")).sendKeys("ashwini.sinchana27@gmail.com");
	Thread.sleep(2000);
	
	//	To enter the 'Subject'
	d1.findElement(By.name("subjectbox")).sendKeys("The beauty !!");
	Thread.sleep(2000);
	
	//To click on the attachment icon
	
	d1.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("osascript " + "/Users/AshwiniDesai/Desktop/Attachment.scpt");
	Thread.sleep(5000);
	Thread.sleep(5000);
	d1.findElement(By.xpath("//div[text()='Send']")).click();
	
	}

}
