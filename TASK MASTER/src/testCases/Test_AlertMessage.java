package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObject.Main_page_Object;

public class Test_AlertMessage extends CommonFunctions {
	
  @Test
  public void test_Alert() {
	  
	  Main_page_Object page = PageFactory.initElements(driver, Main_page_Object.class);
	  page.lert.click();
	  
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	  
	  
  }
}
