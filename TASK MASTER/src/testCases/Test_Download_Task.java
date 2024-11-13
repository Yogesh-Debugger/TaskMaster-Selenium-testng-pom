package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObject.Main_page_Object;

public class Test_Download_Task  extends CommonFunctions {
	
  @Test
  public void test_TextBox() {
	  
	  Main_page_Object page = PageFactory.initElements(driver, Main_page_Object.class);
	 
	  //Task Name
	  page.Text.sendKeys("My First Task");
 
	  //Radio Button
	  boolean status1 = page.r1.isSelected();
	  boolean status2 = page.r2.isSelected();
	  page.r2.click();
	  System.out.println("RadioButton High : "+status1);
	  System.out.println("RadioButton Medium : "+status2);
 
	  //DropDown
	  Select select = new Select (page.d1);
	  select.selectByIndex(1);
 
	  //Calendar
	  page.f1.sendKeys("16-11-2024"+Keys.ENTER);
	  
	  //Add Task
	  page.lert.click();
	  
	  //Download Task
	  page.c1.click();
 
	  //Web Table
	  List<WebElement> columns = driver.findElements(By.tagName("th"));
	  int count = columns.size();
	  System.out.println("Number of columns in table : "+ count);  
  }
  
}
