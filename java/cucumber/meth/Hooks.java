package cucumber.meth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {

	public static WebDriver driver;
	public static Actions ac;
	
	//@Before
	public static void start() throws InterruptedException {
		//driver=new SafariDriver();
				System.setProperty("webdriver.gecko.driver", "/Users/AK20463837/Documents/geckodriver");
				driver=new FirefoxDriver();
				WebDriverManager.firefoxdriver().setup();
				ac=new Actions(driver);
				driver.manage().window().maximize();
				driver.get("https://www.nykaa.com");
				Thread.sleep(2000);
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//time=new WebDriverWait(driver, Duration.ofSeconds(50));
	}
	
	//@After
	public static void end() {
		driver.quit();
	}
}
