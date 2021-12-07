 package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CompanyHolidaysAction;
import Action.LoginAction;
import utils.WebTestBase;

public class CompanyHolidays extends WebTestBase {
	
	static String Screenname = " <b> CompanyHolidays </b>";
	
	@Test(priority=1, enabled= false)
	public void ValidationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Holiday");
		CompanyHolidaysAction holidayAction = new CompanyHolidaysAction(driver);
		new LoginAction(driver).logoutLogin();
		holidayAction.goToCompanyHolidayTab();
		holidayAction.validationCheck();
	}
	
	@Test(priority=2)
	public void AddCompanyHolidayFullDay()
	{
		test=getTest(Screenname  + " : Add Company Holiday");
		CompanyHolidaysAction holidayAction = new CompanyHolidaysAction(driver);
		new LoginAction(driver).logoutLogin();
		holidayAction.goToCompanyHolidayTab();
		holidayAction.addHolidayFullDay();	
	}
	
	
	@Test(priority=3)
	 public void ActiveInactiveSearch()
	{
		test=getTest( Screenname + " : Search Active Inactive Company Holiday");
		CompanyHolidaysAction holidayAction = new CompanyHolidaysAction(driver);
		new LoginAction(driver).logoutLogin();
		holidayAction.goToCompanyHolidayTab();
		holidayAction.SearchHoliday();
			
		
	}
	
	
	

}
