 package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LocationAction;
import Action.LoginAction;
import utils.WebTestBase;

public class Location extends WebTestBase {
	
	
	static String Screenname = "<b> Location </b>";
	
	
	@Test (enabled = false)
	public void addParentLocationValidation()
	{
		test = getTest( Screenname + ":  Validation check of Parent Location and Userguide Check and cancel button on Add Parent Location Screen");
		LocationAction locationaction = new LocationAction(driver);
		new LoginAction(driver).logoutLogin();
		locationaction.goToLocationTab();
		locationaction.parentLocationValidationCheck();	
		locationaction.userGuide();
	}
	
	
	@Test (priority =1)
	public void addParentLocation()
	{
		test = getTest( Screenname + ":  Add parent Location");
		LocationAction locationaction = new LocationAction(driver);
		new LoginAction(driver).logoutLogin();
		locationaction.goToLocationTab();
		locationaction.addLocation();	
	}
	
	@Test(priority =2)
	 public void addChildLocation()
	 {
		test = getTest( Screenname + ":  Add Child Location");
		LocationAction locationaction = new LocationAction(driver);
		new LoginAction(driver).logoutLogin();
		locationaction.goToLocationTab();
		locationaction.addChildLocation();	
	 }
	
	@Test(priority =3, dependsOnMethods ="addParentLocation")
	public void editLocation()
	{
		test = getTest( Screenname + ":  Add Child Location");
		LocationAction locationaction = new LocationAction(driver);
		new LoginAction(driver).logoutLogin();
		locationaction.goToLocationTab();
		locationaction.editParentLocation();
		locationaction.editChildLocation();
			
	}
	
	@Test(priority =4, dependsOnMethods ="addParentLocation")
	 public void LocationListing()
	 {
		 test = getTest( Screenname + ":  Add Child Location");
			LocationAction locationaction = new LocationAction(driver);
			new LoginAction(driver).logoutLogin();
			locationaction.goToLocationTab();
			locationaction.inactiveParentLocation();
			locationaction.inactiveChildLocation();
		//	locationaction.deleteLocation();
	 }
	
	
	
	

}
