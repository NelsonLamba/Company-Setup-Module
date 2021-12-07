package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CategoryAction;
import Action.ChannelAction;
import Action.CompanyHolidaysAction;
import Action.LoginAction;
import utils.WebTestBase;


public class Channel  extends WebTestBase 
	{
	static String Screenname ="<b> Channel/b>";
  
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Channel");
		ChannelAction channelAction = new ChannelAction(driver);
		new LoginAction(driver).logoutLogin();
		channelAction.goToChannelTab();
		channelAction.validationCheck();
	}
	
	@Test(priority=2)
	public void addChannel()
	{
		test=getTest(Screenname  + ": Add Channel");
		ChannelAction channelAction = new ChannelAction(driver);
		new LoginAction(driver).logoutLogin();
		channelAction.goToChannelTab();
		channelAction.addChannel();
	}
	
	@Test(dependsOnMethods = "addChannel" ,priority=3)
	public void editChannel()
	{
		test=getTest( Screenname  + " : Edit Channel");
		ChannelAction channelAction = new ChannelAction(driver);
		new LoginAction(driver).logoutLogin();
		channelAction.goToChannelTab();
		channelAction.editCreatedChannel();	
		
	}
	
	@Test(dependsOnMethods = "addChannel",priority=4)
	public void channellisting()
	{
		test = getTest( Screenname + " : Active / Inactive from Action Button  and Delete Functionality");
		ChannelAction channelAction = new ChannelAction(driver);
		new LoginAction(driver).logoutLogin();
		channelAction.goToChannelTab();
		channelAction.ActiveStatus();
		channelAction.InactiveStatus();
		channelAction.delete();
	
		
	}

	}


