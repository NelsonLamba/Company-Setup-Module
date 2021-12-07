package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CategoryAction;
import Action.DepartmentAction;
import Action.LoginAction;
import utils.WebTestBase;

public class Department extends WebTestBase {

	static String Screenname = "<b> Department </b>";
	
	@Test(priority=1)
	public void addDepartmentValidationCheck()
	{
		
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button on Add department Screen");
		DepartmentAction departmentaction = new DepartmentAction(driver);
		new LoginAction(driver).logoutLogin();
		departmentaction.GoToDepartmentTab();
		departmentaction.ValidationCheck();
		departmentaction.userGuide();
		
	}
	
	@Test(priority=2)
	public void addDepartment()
	{
		test = getTest( Screenname + ": Add Department Screen");
		DepartmentAction departmentaction = new DepartmentAction(driver);
		new LoginAction(driver).logoutLogin();
		departmentaction.GoToDepartmentTab();
		departmentaction.addDepartmentNotVisibleClient();
		departmentaction.addDepartmentVisibleClient();
		
	}
	
	@Test(dependsOnMethods = {"addDepartment"} ,priority=3 )
	public void editDepartment()
	{
		test = getTest( Screenname + ": Search and Edit Screen");
	DepartmentAction departmentaction = new DepartmentAction(driver);
	new LoginAction(driver).logoutLogin();
	departmentaction.GoToDepartmentTab();
	departmentaction.editDepartment();
		
		
	}
	
	@Test(dependsOnMethods = {"addDepartment"} ,priority= 4)
	public void departmentListing()
	{
		test = getTest(Screenname + ": Active / Inactive from Action Button  and Delete Functionality");
		DepartmentAction departmentaction = new DepartmentAction(driver);
		new LoginAction(driver).logoutLogin();
		departmentaction.GoToDepartmentTab();
		//categoryaction.ActionButton();	
		departmentaction.ActiveStatus();
		departmentaction.InactiveStatus();
		departmentaction.delete();
		
	}
	
	
	
}
