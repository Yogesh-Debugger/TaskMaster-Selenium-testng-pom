package commonFunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	
	public static WebDriver driver=null;
	
  @BeforeSuite
  public void setup() {
	  if (driver==null) {
	  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Yogesh M\\OneDrive\\Desktop\\Java\\chrome\\chromedriver-win32\\\\chromedriver.exe");
	  driver= new ChromeDriver();
	   driver.get("https://yogesh-debugger.github.io/TaskMaster/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    System.out.println("Driver initialized");
	  } 
  }
  
  @AfterSuite
  public void tearDown(){
	 //  driver.quit();
	  if (driver != null) {
	      driver.quit();
	  }
	}

}
