package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resources_page_Object {
	  
	  @FindBy(xpath ="/html/body/div/div[3]/a")
	  public  WebElement goToNextPageButton;
	  
	  @FindBy(xpath ="/html/body/div/div[1]/iframe")
	  public  WebElement iframe;
	  
	  @FindBy(xpath ="//*[@id='page-header']/div/div/div/div[2]/a[2]")
	  public  WebElement loginButton;
	  
	  @FindBy(xpath = "/html/body/div/div[2]/a")
	  public  WebElement Return;
	  
	  @FindBy(xpath = "/html/body/div/div[2]/ul/li[1]/a")
	  public  WebElement WH1;
	  
	  @FindBy(xpath = "/html/head/title")
	  public  WebElement WH2;
	  
  }

