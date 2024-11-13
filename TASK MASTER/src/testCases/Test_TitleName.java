package testCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObject.Main_page_Object;

public class Test_TitleName extends CommonFunctions {
	String message = null;
	 
@Test
  public void test_title_Name() {
	
	Main_page_Object page = PageFactory.initElements(driver, Main_page_Object.class);
	 message = page.Title.getText();
     Assert.assertEquals(message, "TaskMaster");
     System.out.println("Page_Title_Name : "+message);
  }

} 
