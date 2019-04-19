import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","/Users/AshwiniDesai/Desktop/Selenium/Drivers/chromedriver");

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		driver1.close();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.gmail.com");
		driver2.quit();
	}

}
