package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.config.Config;

public class LaunchApp {
	

	public void openBrowser(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
		Config.driver=new ChromeDriver();
		
	}
	
    public void enterApplicationURL(String url)
    {
    	Config.driver.get(url);
    }
    
    public void maximizeBrowser()
    {
    	Config.driver.manage().window().maximize();
    }
    
    public void waittillLoginpageLoaded(int timeoutseconds)
    {
    	Config.driver.manage().timeouts().pageLoadTimeout(timeoutseconds, TimeUnit.SECONDS);
    	
    }
    
    public static void main(String[] args) 
    {
    	LaunchApp lc =new LaunchApp();
    	lc.openBrowser("chrome");
    	lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
    	lc.maximizeBrowser();
    	lc.waittillLoginpageLoaded(15);
	}

}
