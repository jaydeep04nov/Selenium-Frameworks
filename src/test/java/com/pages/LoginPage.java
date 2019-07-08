package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.Config;
import com.utility.LaunchApp;

public class LoginPage {

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	

	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUserName(String username)
	{
		objusername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		objlogin.click();
	}
	
	public static void main(String[] args) 
	{
		LaunchApp lc =new LaunchApp();
    	lc.openBrowser("chrome");
    	lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
    	lc.maximizeBrowser();
    	lc.waittillLoginpageLoaded(15);
    	
    	LoginPage lg =new LoginPage();
    	lg.loadLoginpage();
    	lg.enterUserName("Suvidyap1");
    	lg.enterPassword("P@ssword1");
    	lg.clickonLogin();
		
	}
	
}
