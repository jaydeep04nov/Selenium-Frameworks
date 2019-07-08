package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.config.Config;
import com.utility.CloseBrowser;
import com.utility.LaunchApp;

public class FlightfinderPage {
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightFinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignoff;

	public void loadFlightFinderpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyFlightFinder()
	{
		boolean flag=objFlightFinder.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder page is displayed");
		}
	}
	
	public void clickonSignoff()
	{
		objSignoff.click();
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
		
    	FlightfinderPage ff =new FlightfinderPage();
    	ff.loadFlightFinderpage();
    	ff.verifyFlightFinder();
    	ff.clickonSignoff();
    	
    	CloseBrowser cb=new CloseBrowser();
    	cb.closeBrowser();
	}

}
