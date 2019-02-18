package com.durgasoft.launching.chromebrowser;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage 
{
	
	public static WebDriver driver;
	public static String path="./testdata.properties";
	
	
	public static String loadData(String key) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(path);
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
	public static void launch(String browser) throws Exception
	{
		if(loadData(browser).equalsIgnoreCase("CHROME"))
		{
			driver=new ChromeDriver();
		}
		else if(loadData(browser).equalsIgnoreCase("FIREFOX"))
		{
			driver=new FirefoxDriver();
		}
		else if(loadData(browser).equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(loadData(browser).equalsIgnoreCase("EDGE"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	
	
	public static void navigate(String url) throws Exception 
	{
		//driver.get(url);
		driver.navigate().to(loadData(url));
	}
	
	public static void type(String keyLocator, String dataKey) throws Exception 
	{
		driver.findElement(By.id(loadData(keyLocator))).sendKeys(loadData(dataKey));
	}
	
	public static void click(String keyLocator) throws Exception 
	{
		driver.findElement(By.xpath(loadData(keyLocator))).click();
	}
	

}
