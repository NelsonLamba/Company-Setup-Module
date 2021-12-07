package testcases;
import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CategoryAction;
import Action.LoginAction;
import utils.WebTestBase;

import org.testng.annotations.Test;

public class Category extends WebTestBase {

	
	static String Screenname = "<b> Category </b>";
	/* Validation check and Userguide Check and cancel button*/
	@Test
	public void addCategoryValidationCheck()
	{
		
		
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button on Add category Screen");
		CategoryAction categoryaction = new CategoryAction(driver);
		new LoginAction(driver).logoutLogin();
		categoryaction.GoToCategoryTab();
		categoryaction.ValidationCheck();	
		categoryaction.userGuide();
	}
	
	
	/* Add Category */
	@Test
	public void  addCategory()
	{
		
		test = getTest( Screenname + ": Add Category Screen");
		CategoryAction categoryaction = new CategoryAction(driver);
		new LoginAction(driver).logoutLogin();
		categoryaction.GoToCategoryTab();
		categoryaction.AddCategory();
		//categoryaction.editCategory();
	}
	
	
	
	/* Search and Edit category */
	@Test(dependsOnMethods = {"addCategory"})
	public void editCategory()
	{
		test = getTest(Screenname + " :Search and Edit category");
		CategoryAction categoryaction = new CategoryAction(driver);
		new LoginAction(driver).logoutLogin();
		categoryaction.GoToCategoryTab();
		categoryaction.editCategory();
	}
	
	/* Active / Inactive from Action Button and Delete Functionality */
	@Test(dependsOnMethods = {"addCategory"})
	public void CategoryListing()
	{
		test = getTest(Screenname + ": Active / Inactive from Action Button  and Delete Functionality");
		CategoryAction categoryaction = new CategoryAction(driver);
		new LoginAction(driver).logoutLogin();
		categoryaction.GoToCategoryTab();
		//categoryaction.ActionButton();	
		categoryaction.ActiveStatus();
		categoryaction.InactiveStatus();
		categoryaction.delete();
	
		
	}
	
	
	
	
	
	
	
}
