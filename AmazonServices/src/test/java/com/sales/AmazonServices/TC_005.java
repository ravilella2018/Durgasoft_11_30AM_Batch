package com.sales.AmazonServices;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.Reporter;
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
	  SoftAssert as=new SoftAssert();
	  
	    Reporter.log("amazonHomePage Test Started....");
	  
	    String actualTitle = verifyTitle();
	    String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.com";
	    
	    //Assert.assertEquals(actualTitle, expectedTitle);
	    
	    // Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle), "Both are not equal...");
	    
	    //Assert.fail("Hi failing....");
	    
	    as.assertEquals(actualTitle, expectedTitle);
	    
	    as.assertEquals("ravi", "kanth", "Ravi &  Kanth are not matching....");
	    
	    
	    
	    selectValue("amazondropdown_id", 15);
	    Reporter.log("Selected the item 15 in dropdown");
	    
		type("amazonsearchtextbox_id", "value");
		Reporter.log("Entered the text :" + loadData("value") + " By using Locator :" + loadData("amazonsearchtextbox_id"));
		
		
		click("amazonsearchbutton_xpath");
		Reporter.log("Clicked on AmazonSearch Button  By using locator :" + loadData("amazonsearchbutton_xpath"));
		
		as.assertAll();
		
  }

  


@AfterMethod(groups= {"Regression","Sanity"})
  public void endProcess() 
  {
	  closeBrowser();
  }

}
