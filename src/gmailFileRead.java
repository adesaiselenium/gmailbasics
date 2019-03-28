import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailFileRead {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Downloads/chromedriver 3");

		WebDriver d1 = new ChromeDriver();


		//d1.get("https:www.gmail.com");
		
		///Users/AshwiniDesai/Desktop/gmailTestAccounts.xlsx
		FileInputStream fis = new FileInputStream("/Users/AshwiniDesai/Desktop/gmailTestAccounts.xlsx");
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook1.getSheetAt(0);
		
		
		String Username1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Username1);
		
		String password1 = sheet.getRow(0).getCell(1).getStringCellValue();;
		System.out.println(password1);
		
		
		d1.get("https:www.gmail.com");
		
		// Send the first Username 
		d1.findElement(By.id("identifierId")).sendKeys(Username1);
		d1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);

		//send first Password
		d1.findElement(By.xpath("//*[@name='password']")).sendKeys(password1);
		d1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		Thread.sleep(5000);
		
		////*[@id=":ik"]/div/div
		d1.findElement(By.xpath("//*[@id=\":ik\"]/div/div")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);

		// To enter the 'To' address
		d1.findElement(By.className("vO")).sendKeys("ishan.sharma@sourcebits.com");
		Thread.sleep(2000);
		
		//	To enter the 'Subject'
		d1.findElement(By.name("subjectbox")).sendKeys("The beauty !!");
		Thread.sleep(2000);
		
		//To click on the attachment icon /Users/AshwiniDesai/Desktop/Attachment2.scpt
		
		d1.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("osascript " + "/Users/AshwiniDesai/Desktop/Attachment.scpt");
		Thread.sleep(5000);
		Thread.sleep(5000);
		d1.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		//Thread.sleep(5000);

		
		d1.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")).click();
		Thread.sleep(5000);
		//d1.findElement(By.linkText("Sign out")).click();
		//webDriver.findElement(By.xpath("//a[@href='/docs/configuration']")).click();
		
	//	d1.findElement(By.linkText("Sign out")).click();
		
		d1.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();

		//String str1= d1.findElements(By.id("gb_71").getAttribute(href);
		
		// New Changes to the code
		
		String Username2 = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(Username2);
		
		String password2= sheet.getRow(1).getCell(1).getStringCellValue();;
		System.out.println(password2);
		
		
		//d1.get("https:www.gmail.com");
		
		d1.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div/div/form/content/section/div/content/div/div/ul/li[2]/div")).click();
		
		// Send the second Username 
		Thread.sleep(2000);
		d1.findElement(By.id("identifierId")).sendKeys(Username2);
		d1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);

		//send second Password
		d1.findElement(By.xpath("//*[@name='password']")).sendKeys(password2);
		d1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		Thread.sleep(5000);
		
		////*[@id=":j1"]/div/div
		d1.findElement(By.xpath("//*[@id=':j1']/div/div")).click();
		Thread.sleep(5000);
		// To enter the 'To' address
		d1.findElement(By.className("vO")).sendKeys("ishan.sharma@sourcebits.com");
		Thread.sleep(2000);
		
		//	To enter the 'Subject'
		d1.findElement(By.name("subjectbox")).sendKeys("Handsome Guy!!");
		Thread.sleep(2000);
		
		//To click on the attachment icon
		
		d1.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("osascript " + "/Users/AshwiniDesai/Desktop/Attachment2.scpt");
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		d1.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		//Thread.sleep(5000);
	}

}
