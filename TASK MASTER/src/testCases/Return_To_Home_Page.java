package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObject.Resources_page_Object;

public class Return_To_Home_Page extends CommonFunctions {
  @Test
  public void Test_Return_To_HomePage() {
	  
	  Resources_page_Object page = PageFactory.initElements(driver, Resources_page_Object.class);
      page.Return.click();
  }
}
