package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.EmailTemplateAction;
import Action.LoginAction;
import utils.WebTestBase;

public class Emailtemplate extends WebTestBase {
	
	static String Screenname = "<b>Emailtemplate </b>"; 

	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest( Screenname  + ": Validation message on  Email Template screen");
		EmailTemplateAction emailtemplateaction = new EmailTemplateAction (driver);
		new LoginAction(driver).logoutLogin();
		emailtemplateaction.moveToEmailTemplateTab();
		emailtemplateaction.validationCheck();
	}
	
	@Test(priority=2)
	public void addEmailTemplate()
	{
		test=getTest( Screenname  + ": Add  Email Template ");
		EmailTemplateAction emailtemplateaction = new EmailTemplateAction (driver);
		new LoginAction(driver).logoutLogin();
		emailtemplateaction.moveToEmailTemplateTab();
		emailtemplateaction.AddEmailTemplate();
	}
	
	@Test(priority=3,dependsOnMethods = {"addEmailTemplate"})
	public void editEmailTemplate()
	{
		test=getTest( Screenname + ": Edit Email Template");
		EmailTemplateAction emailtemplateaction = new EmailTemplateAction (driver);
		new LoginAction(driver).logoutLogin();
		emailtemplateaction.moveToEmailTemplateTab();
		emailtemplateaction.editTemplate();
	}
	
	@Test(priority=4,dependsOnMethods = {"addEmailTemplate"})
	public void emailTemplateListing()
	{
		test=getTest( Screenname + ": Email Template Listing");
		EmailTemplateAction emailtemplateaction = new EmailTemplateAction (driver);
		new LoginAction(driver).logoutLogin();
		emailtemplateaction.moveToEmailTemplateTab();
		emailtemplateaction.ActiveStatus();
		emailtemplateaction.InactiveStatus();
		emailtemplateaction.delete();
	}
	
	@Test(priority=5)
	public void addAdvancedEmailTemplate()
	{
		test=getTest( Screenname + " : Add Advanced Email Template ");
		EmailTemplateAction emailtemplateaction = new EmailTemplateAction (driver);
		new LoginAction(driver).logoutLogin();
		emailtemplateaction.moveToEmailTemplateTab();
		
		emailtemplateaction.customTemplate();
		
		emailtemplateaction.addDetailAdvancedTemplate();
	
		
	}
	
	
	
	
}

