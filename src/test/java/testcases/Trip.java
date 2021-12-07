package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.StageAction;
import Action.TripAction;
import utils.WebTestBase;

public class Trip extends WebTestBase {
	
	
	static String Screenname = "<b> Trip </b>";

	@Test(priority = 1)
	public void validationCheck() {
		test = getTest(Screenname + ": Validation message on Add Trip");

		TripAction tripaction = new TripAction(driver);

		new LoginAction(driver).logoutLogin();
		tripaction.goToTripTab();
		tripaction.validationCheck();

	}
	
	
	@Test(priority = 2)

	public void addTrip() {
		test = getTest(Screenname + "Add Trip");
		TripAction tripaction = new TripAction(driver);

		new LoginAction(driver).logoutLogin();
		tripaction.goToTripTab();
		tripaction.addNewTrip();	
	}
	
	
	@Test(priority = 3)

	public void EditTrip() {
		test = getTest(Screenname + "Edit Trip");

		TripAction tripaction = new TripAction(driver);

		new LoginAction(driver).logoutLogin();
		tripaction.goToTripTab();

		tripaction.EditTrip();
	}
	
	
	@Test(priority = 4)

	public void TripListing() {
		test = getTest(Screenname + "Trip Listing");

		TripAction tripaction = new TripAction(driver);

		new LoginAction(driver).logoutLogin();
		tripaction.goToTripTab();
		
		tripaction.ActiveStatus();
		tripaction.InactiveStatus();
		tripaction.delete();
		
	}
	
	
}