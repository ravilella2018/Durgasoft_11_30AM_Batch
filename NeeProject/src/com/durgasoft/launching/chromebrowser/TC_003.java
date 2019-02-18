package com.durgasoft.launching.chromebrowser;

public class TC_003 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		type("amazonsearchtextbox_id","value");
		
		click("amazonsearchbutton_xpath");
	}

	

	

}
