package com.sales.AmazonServices;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC_005 extends BasePage
{
	
  
  @BeforeMethod(groups= {"Regression","Sanity"})
  @Parameters("browser")
  public void startProcess(String btype) throws Exception 
  {
	  launch(btype);
	  navigate("amazonurl");
  }
  
  
  @Test(groups= {"Regression","Sanity"})
  public void amazonHomePage() throws Exception
  {
	    selectValue("amazondropdown_id", 15);
		type("amazonsearchtextbox_id", "value");
		click("amazonsearchbutton_xpath");
  }

  @AfterMethod(groups= {"Regression","Sanity"})
  public void endProcess() 
  {
	  closeBrowser();
  }

}
