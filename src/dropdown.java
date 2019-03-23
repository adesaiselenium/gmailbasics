//new changes to the code
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");

		WebDriver driver1 = new ChromeDriver();


	driver1.get("https://www.google.com");
	//To enter the keyword "Hello' in google search bar
	driver1.findElement(By.name("q")).sendKeys("hello");
	Thread.sleep(300);
	
	//To get all the list of values from the dropdown
	List<WebElement> options=driver1.findElements(By.xpath("//ul[@role='listbox']/li")); 
	int size1 = options.size();
	System.out.println(size1);
	
	for (WebElement eachAnchorElem : options) {
		
        System.out.println(eachAnchorElem.getText());

	}

	}
	}
