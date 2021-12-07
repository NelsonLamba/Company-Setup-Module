package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.DepartmentAction;
import Action.DesignationAction;
import Action.LoginAction;
import utils.WebBasePage;
import utils.WebTestBase;

public class Designation extends WebTestBase {
	
	static String Screenname = "<b> Designation </b>";
	
	
	@Test(priority=1)
	public void addDesignationValidationCheck()
	{
		
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button on Add Designation Screen");
		DesignationAction designationaction = new DesignationAction(driver);
		new LoginAction(driver).logoutLogin();
		designationaction.goToDesignationTab();
		designationaction.validationCheck();
		designationaction.userGuide();
		
	}
	
	@Test(priority=2)
	public void addDesignation()
	{
		test = getTest( Screenname + ": Add Designation Screen");
		DesignationAction designationaction = new DesignationAction(driver);
		new LoginAction(driver).logoutLogin();
		designationaction.goToDesignationTab();
		designationaction.addDesignation();
		
	}
	
	@Test(dependsOnMethods = {"addDesignation"} ,priority=3 )
	public void editDesignation()
	{
		test = getTest( Screenname + ": Search and Edit Screen");
		DesignationAction designationaction = new DesignationAction(driver);
		new LoginAction(driver).logoutLogin();
		designationaction.goToDesignationTab();
		designationaction.editDesignation();	
	}
	
	@Test(dependsOnMethods = {"addDesignation"} ,priority= 4)
	public void designationListing()
	{
		test = getTest(Screenname + ": Active / Inactive from Action Button  and Delete Functionality");
		DesignationAction designationaction = new DesignationAction(driver);
		new LoginAction(driver).logoutLogin();
		designationaction.goToDesignationTab();
		designationaction.ActiveStatus();
		designationaction.InactiveStatus();
		designationaction.delete();
		
	}
	
	

}
