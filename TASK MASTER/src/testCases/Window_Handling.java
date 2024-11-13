package testCases;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObject.Resources_page_Object;

public class Window_Handling extends CommonFunctions {
  @Test
  public void window_Handling() {
	  Resources_page_Object page = PageFactory.initElements(driver, Resources_page_Object.class);
  
	  String oldwindow = driver.getWindowHandle();
	  page.WH1.click();
	  
	  Set<String> handles = driver.getWindowHandles();
	  
	  for (String newwindow : handles) {
		  driver.switchTo().window(newwindow);
	}
	  String Nameofpage = page.WH2.getText();
	  System.out.println(Nameofpage);
	  driver.close();
	  
	  driver.switchTo().window(oldwindow);
	  
  
  }
}
