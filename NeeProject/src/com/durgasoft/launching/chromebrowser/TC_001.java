package com.durgasoft.launching.chromebrowser;

public class TC_001 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		launch(loadData("chromebrowser"));
		
		navigate(loadData("flipkarturl"));
	}

	

}
