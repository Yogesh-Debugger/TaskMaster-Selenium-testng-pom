package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main_page_Object  {

	@FindBy(xpath = ".//div/h1")
	public  WebElement Title;
	
	@FindBy(xpath = "//*[@id='addTaskButton']")
	public  WebElement lert;
	
	@FindBy(id = "taskInput")
	public  WebElement Text;
	
	@FindBy(xpath = "//*[@id='priorityHigh']")
	public  WebElement r1;
	
	@FindBy(xpath = "//*[@id='priorityMedium']")
	public  WebElement r2;
	
	@FindBy(id = "categorySelect")
	public  WebElement d1;
	
	@FindBy(xpath = "//*[@id='dueDate']")
	public  WebElement f1;
		
	@FindBy(xpath = "//*[@id='downloadButton']")
	public  WebElement c1;
	  
}