package com.module;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.FlightfinderPage;
import com.pages.LoginPage;
import com.utility.CloseBrowser;

public class Login {
	
	@Parameters({"usernm","passwd"})
	@Test
	public void executeLoginwithValidds(String username,String password)
	{
		LoginPage lg=new LoginPage();
		lg.loadLoginpage();
		lg.enterUserName(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		
		FlightfinderPage ff=new FlightfinderPage();
		ff.loadFlightFinderpage();
		ff.verifyFlightFinder();
		ff.clickonSignoff();
		
		CloseBrowser cb= new CloseBrowser();
		cb.closeBrowser();
	}

}
