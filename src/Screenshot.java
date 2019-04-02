import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");

		WebDriver d1 = new ChromeDriver();
		d1.get("https:www.gmail.com");
		
		//To enter Username
		d1.findElement(By.id("identifierId")).sendKeys("ashwini.sinchana27@gmail.com");
		d1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(5000);
		
		//To enter Password
		d1.findElement(By.xpath("//*[@name='password']")).sendKeys("ashu@21sanja");
		d1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		Thread.sleep(5000);
		
		// To click on the 'Compose' button
		d1.findElement(By.xpath("//*[@id=':ik']/div/div")).click();
		Thread.sleep(5000);
		
		// To enter the 'To' address
		d1.findElement(By.className("vO")).sendKeys("ishan.sharma@sourcebits.com");
		Thread.sleep(2000);
		
		// To take the screenshot and store it
		File src= ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/AshwiniDesai/Desktop/Selenium/April1st2019/screen1.png"));
		
		Thread.sleep(2000);
		Thread.sleep(2000);

		//To enter the 'Subject '
		d1.findElement(By.name("subjectbox")).sendKeys("The screenshot !!");
		Thread.sleep(2000);
		
		// To click on Attachment icon
		d1.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		Thread.sleep(5000);
		
		//To call the Apple script
		Runtime.getRuntime().exec("osascript " + "/Users/AshwiniDesai/Desktop/Attachment.scpt");
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);

		//Click on 'Send' button
		d1.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		//Thread.sleep(5000);
		
	}

}
