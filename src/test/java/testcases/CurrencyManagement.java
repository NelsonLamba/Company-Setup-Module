package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CategoryAction;
import Action.CurrencyManagementAction;
import Action.LoginAction;
import utils.WebTestBase;

public class CurrencyManagement extends WebTestBase {

	
	
	static String Screenname = "<b> Currency Management </b>";
	/* Save button Enable/disable  and check validation message on Source Currency and Currency Rate*/
	@Test
	public void currencyValidationCheck()
	{
		
		
		test = getTest( Screenname + ": Save button Enable/disable , Validation check and Userguide Check and cancel button on Add category Screen");
		CurrencyManagementAction currencyAction = new CurrencyManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		currencyAction.goToCurrencyTab();
		currencyAction.saveButtonCheck();
		currencyAction.validationMessages();
		//currencyAction.alreadySelectedValidation();
		
		
		
	}
	
	
	/* check validation message if select already selected source currency*/
	@Test
	public void SourcecurrencyDuplicateValidation()
	{
		
		
		test = getTest( Screenname + ": Already selected source currency validation message");
		CurrencyManagementAction currencyAction = new CurrencyManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		currencyAction.goToCurrencyTab();
		currencyAction.alreadySelectedSourceValidation();
		
		
	}
	
	
	/* Already selected Base currency validation message */
	@Test
	public void BasecurrencyDuplicateValidation()
	{
		
		
		test = getTest( Screenname + ": Already selected Base currency validation message ");
		CurrencyManagementAction currencyAction = new CurrencyManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		currencyAction.goToCurrencyTab();
		currencyAction.alreadySelectedBaseValidation();
	}
	
	
	@Test
	
	public void addNewCurrencyAndDelete()
	{
		test = getTest( Screenname + ": Already selected Base currency validation message ");
		CurrencyManagementAction currencyAction = new CurrencyManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		currencyAction.goToCurrencyTab();
		currencyAction.addCurrencyAndDelete();
		
	}
	
	
	
	
}
