import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");

		WebDriver driver1 = new ChromeDriver();


	driver1.get("https://www.facebook.com");
	Select sel= new Select(driver1.findElement(By.id("day")));
	Thread.sleep(3000);
	
	sel.selectByValue("27");

	}

}
