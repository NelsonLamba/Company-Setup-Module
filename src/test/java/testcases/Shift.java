package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ServiceAction;
import Action.ShiftAction;
import utils.WebTestBase;

public class Shift extends WebTestBase {
	
	static String Screenname ="<b> Shift </b>";
	
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Shift");

		
		ShiftAction shiftaction = new ShiftAction(driver);
		
		new LoginAction(driver).logoutLogin();
		shiftaction.goToShiftTab();
		shiftaction.validationCheck();	
			
	}
	
	@Test(priority=2)
	
	public void addShiftFexible()
	{
		test=getTest(Screenname + "Add Shift");
		ShiftAction shiftaction = new ShiftAction(driver);
		new LoginAction(driver).logoutLogin();
		shiftaction.goToShiftTab();
		shiftaction.addShiftFlexible();
		shiftaction.addShiftNotFlexible();
	}
	
	
	@Test(priority=3)
	
	public void editShiftFexible()
	{
	
		test=getTest(Screenname + "Edit Shift");
		ShiftAction shiftaction = new ShiftAction(driver);
		new LoginAction(driver).logoutLogin();
		shiftaction.goToShiftTab();
		shiftaction.editShiftFlexible();
		
	}
	
	@Test(priority=4)
	public void ServiceListing()
	{
		test=getTest(Screenname + "Shift Listing");
		ShiftAction shiftaction = new ShiftAction(driver);
		new LoginAction(driver).logoutLogin();
		shiftaction.goToShiftTab();
		//priorityaction.displayOrderCheck();
		shiftaction.ActiveStatus();
		shiftaction.InactiveStatus();
		shiftaction.delete();
	}

}
