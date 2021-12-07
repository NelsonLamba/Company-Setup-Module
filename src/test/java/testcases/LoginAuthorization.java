package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.LoginAuthorizationAction;
import Action.TripAction;
import utils.WebTestBase;

public class LoginAuthorization extends WebTestBase {
	
	
	static String Screenname = "<b> Login Authorization </b>";

	@Test(priority = 1,enabled= false)
	public void validationCheck() {
		test = getTest(Screenname + ": Validation message on Add Login Authorization");

		LoginAuthorizationAction loginauthorizationaction = new LoginAuthorizationAction(driver);

		new LoginAction(driver).logoutLogin();
		loginauthorizationaction.goToLoginAuthorizationTab();
		loginauthorizationaction.validationCheck();

	}
	
	@Test(priority = 2)
	public void addLoginAuthorization() {
		test = getTest(Screenname + ": Add Login Authorization");

		LoginAuthorizationAction loginauthorizationaction = new LoginAuthorizationAction(driver);

		new LoginAction(driver).logoutLogin();
		loginauthorizationaction.goToLoginAuthorizationTab();
		loginauthorizationaction.addNew();

	}
	
	@Test(priority = 3)

	public void EditLoginAuthorization() {
		test = getTest(Screenname + "Edit Login Authorization");

		LoginAuthorizationAction loginauthorizationaction = new LoginAuthorizationAction(driver);

		new LoginAction(driver).logoutLogin();
		loginauthorizationaction.goToLoginAuthorizationTab();

		loginauthorizationaction.EditLoginAuthorization();
	}
	
	
	@Test(priority = 4)

	public void TripListing() {
		test = getTest(Screenname + "Login Authorization listing");

		LoginAuthorizationAction loginauthorizationaction = new LoginAuthorizationAction(driver);

		new LoginAction(driver).logoutLogin();
		loginauthorizationaction.goToLoginAuthorizationTab();

		loginauthorizationaction.ActiveStatus();
		loginauthorizationaction.InactiveStatus();
		loginauthorizationaction.delete();
		
	}

}
