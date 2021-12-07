package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.IndustryTypeAction;
import Action.LoginAction;
import utils.WebTestBase;

public class IndustryType extends WebTestBase {

	
	static String Screenname = "<b> Industry Type </b>";
	
	
	
	@Test (priority =1)
	public void addIndustryTypeValidation()
	{
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button on Add Industry Type Screen");
		IndustryTypeAction industryactions=  new IndustryTypeAction(driver);
		new LoginAction(driver).logoutLogin();
		
		industryactions.goToIndurstryTypeTab();
		industryactions.ValidationCheck();
		industryactions.userGuide();
	}
	
	@Test (priority =2)
	public void addIndustryType()
	{
		test = getTest( Screenname + ":  Add Industry Type");
		IndustryTypeAction industryactions=  new IndustryTypeAction(driver);
		new LoginAction(driver).logoutLogin();
		
		industryactions.goToIndurstryTypeTab();
		industryactions.addIndustryType();
	}
	
	@Test(priority=3)
	public void editIndustryType()
	{
		test = getTest( Screenname + ":  Search and Edit Industry Type Screen");
		IndustryTypeAction industryactions=  new IndustryTypeAction(driver);
		new LoginAction(driver).logoutLogin();
		industryactions.goToIndurstryTypeTab();
		industryactions.editIndustryType();
	}
	
	@Test(priority=4)
	
	public void IndustryTypeListing()
	{
		test = getTest(Screenname + ": Active / Inactive from Action Button  and Delete Functionality");
		IndustryTypeAction industryactions=  new IndustryTypeAction(driver);
		new LoginAction(driver).logoutLogin();
		industryactions.goToIndurstryTypeTab();
		industryactions.ActiveStatus();
		industryactions.InactiveStatus();
		industryactions.delete();
		
	}
	
	
}
