package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObject.Resources_page_Object;

public class Test_Iframes extends CommonFunctions {
	 
	@Test
    public void test_Iframe() {
       
		Resources_page_Object page = PageFactory.initElements(driver, Resources_page_Object.class);
        page.goToNextPageButton.click();
        
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame( page.iframe);
        page.loginButton.click();
        driver.switchTo().defaultContent();
    }
}