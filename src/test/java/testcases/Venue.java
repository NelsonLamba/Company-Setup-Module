package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.DesignationAction;
import Action.LoginAction;
import Action.VenueAction;
import utils.WebTestBase;

public class Venue extends WebTestBase {

	
static String Screenname = "<b> Venue </b>";
	
	
	@Test(priority=1 ,enabled = false )
	public void addVenueValidationCheck()
	{
		
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button on Venue Screen");
		VenueAction venueaction = new VenueAction(driver);
		new LoginAction(driver).logoutLogin();
		venueaction.goToVenueTab();
		venueaction.validationCheck();
		venueaction.userGuide();
		
	}
	
	
	@Test(priority=2)
	public void addVenue()
	{
		test = getTest( Screenname + ": Add Venue");
		VenueAction venueaction = new VenueAction(driver);
		new LoginAction(driver).logoutLogin();
		venueaction.goToVenueTab();
		venueaction.addVenue();
		
	}
	
	@Test(priority=3)
	public void editVenue()
	{
		test = getTest( Screenname + ": Edit Venue");
		VenueAction venueaction = new VenueAction(driver);
		new LoginAction(driver).logoutLogin();
		venueaction.goToVenueTab();
		venueaction.editVenue();
	}
	
	
	@Test(priority=4)
	public void addLayout()
	{
		test = getTest( Screenname + ": Edit Venue");
		VenueAction venueaction = new VenueAction(driver);
		new LoginAction(driver).logoutLogin();
		venueaction.goToVenueTab();
		venueaction.addLayout();
		venueaction.rectangleLayout();
		venueaction.circleLayout();
		venueaction.halllayout();	
		
	}
	@Test(priority=5)
	 public void deleteVenue()
	 {
		 test = getTest( Screenname + ": Deleye Venue");
			VenueAction venueaction = new VenueAction(driver);
			new LoginAction(driver).logoutLogin();
			venueaction.goToVenueTab();
			venueaction.deleteVenue();
			//venueaction.addLayout();
	 }
	
	
	
	
}
