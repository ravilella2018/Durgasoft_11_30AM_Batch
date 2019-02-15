package com.durgasoft.launching.chromebrowser;

import org.openqa.selenium.By;

public class TC_002 extends BasePage
{

	public static void main(String[] args) throws Exception
	{
		launch(loadData("chromebrowser"));
		
		navigate(loadData("amazonurl"));
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Beauty')])[5]")).click();

	}

}
