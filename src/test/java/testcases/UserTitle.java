package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.StageAction;
import Action.TripAction;
import Action.UserTitleAction;
import utils.WebTestBase;

public class UserTitle  extends WebTestBase  {
	
	
	static String Screenname = "<b> UserTitle </b>";

	@Test(priority = 1, enabled=false)
	public void validationCheck() {
		test = getTest(Screenname + ": Validation message on Add Trip");

		UserTitleAction usertitle = new UserTitleAction(driver);

		new LoginAction(driver).logoutLogin();
		usertitle.clickOnUserTitleLink();
		usertitle.validationCheck();

	}
	
	
	@Test(priority = 2)

	public void addUserTitle() {
		test = getTest(Screenname + "Add User Title");
		UserTitleAction usertitle = new UserTitleAction(driver);

		new LoginAction(driver).logoutLogin();
		usertitle.clickOnUserTitleLink();
		usertitle.addUserTitle();	
	}

	
	@Test(priority = 3)

	public void EditUserTitle() {
		test = getTest(Screenname + "Edit User Title");

		UserTitleAction usertitle = new UserTitleAction(driver);

		new LoginAction(driver).logoutLogin();
		usertitle.clickOnUserTitleLink();

		usertitle.EditUserTitle();
	}
	
	@Test(priority = 4)

	public void StageListing() {
		test = getTest(Screenname + "User Title Listing");

		UserTitleAction usertitle = new UserTitleAction(driver);

		new LoginAction(driver).logoutLogin();
		usertitle.clickOnUserTitleLink();
		
		usertitle.ActiveStatus();
		usertitle.InactiveStatus();
		usertitle.delete();
		
	}
}
