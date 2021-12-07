package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CompanyNotificationAction;
import Action.FeedbackAction;
import Action.LoginAction;
import utils.WebTestBase;

public class CompanyNotification extends WebTestBase{
	
	static String Screenname = "<b>CompanyNotification</b>";
	
	
	@Test(priority =1)

	public void mainMultiCheckboxVerification()

	{
		
		test=getTest(Screenname + " : Verification of Multi check functionality on Main Checkbox");
		CompanyNotificationAction companynotificationaction = new CompanyNotificationAction(driver);
		new LoginAction(driver).logoutLogin();
		companynotificationaction.GoToCompanyNotificationTab();
		companynotificationaction.VerificationMainMultiCheck();	
	}
	
	
	@Test(priority =2)
	
	 public void  moduleWiseCheckverification()
	 {
		
		test=getTest(Screenname + " : Verification of Multi check functionality module wise");
		CompanyNotificationAction companynotificationaction = new CompanyNotificationAction(driver);
		new LoginAction(driver).logoutLogin();
		companynotificationaction.GoToCompanyNotificationTab();
		companynotificationaction.moduleSubModuleverification();
		
	 }
	
	
	
}
