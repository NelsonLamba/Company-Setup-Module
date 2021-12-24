package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.StageAction;
import Action.StatusAction;
import utils.WebTestBase;

public class Status extends WebTestBase {
	
	static String Screenname = "<b> Status </b>";

	@Test(priority = 1)
	public void validationCheck() {
		test = getTest(Screenname + ": Validation message on Add Status"); 

		StatusAction statusaction = new StatusAction(driver);

		new LoginAction(driver).logoutLogin();
		statusaction.goToStatusTab();
		statusaction.validationCheck();
	}
	
	
	@Test(priority = 2)
	public void addStatus() {
		test = getTest(Screenname + "Add Status");
		StatusAction statusaction = new StatusAction(driver);

		new LoginAction(driver).logoutLogin();
		statusaction.goToStatusTab();
		statusaction.addProductStatus();
		statusaction.addCRMStatus();
		statusaction.addApplicantStatus();
		
	}
	
	
	@Test(priority = 3)

	public void EditStatus() {
		test = getTest(Screenname + "Edit Status");

		StatusAction statusaction = new StatusAction(driver);

		new LoginAction(driver).logoutLogin();
		statusaction.goToStatusTab();
		statusaction.EditStatus();
	}
	
	@Test(priority = 4)

	public void StatusListing() {
		test = getTest(Screenname + "Status Listing");

		StatusAction statusaction = new StatusAction(driver);

		new LoginAction(driver).logoutLogin();
		statusaction.goToStatusTab();
		
		statusaction.ActiveStatus();
		statusaction.InactiveStatus();
		statusaction.delete();
		
	}

}
