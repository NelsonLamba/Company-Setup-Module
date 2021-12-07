package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.ContactTypeAction;
import Action.EmailTemplateAction;
import Action.LoginAction;
import utils.WebTestBase;


public class ContactType extends WebTestBase {
	
	static String Screenname = "<b>ContactType</b>";
	
	
	
	@Test(priority=1)
	public void validationCheck()
	{
	test=getTest( Screenname + " : Validation message on Add Contact Type screen");
	ContactTypeAction contactTypeAction = new ContactTypeAction (driver);
	new LoginAction(driver).logoutLogin();
	contactTypeAction.goToChannelTab();
	contactTypeAction.validationCheck();
	}
	
	@Test(priority=2)
	public void addContactType()
	{
		
			test=getTest( Screenname + " : Add Contact Type screen");
			ContactTypeAction contactTypeAction = new ContactTypeAction (driver);
			new LoginAction(driver).logoutLogin();
			contactTypeAction.goToChannelTab();
			contactTypeAction.addContactType();
	}
	
	
	@Test(priority=3 , dependsOnMethods ="addContactType")
	
	public void editContactType()
	{
		
		test=getTest( Screenname + " : Edit Contact Type screen");
		ContactTypeAction contactTypeAction = new ContactTypeAction (driver);
		new LoginAction(driver).logoutLogin();
		contactTypeAction.goToChannelTab();
		contactTypeAction.editContactType();
	}
	
	@Test(priority=4 , dependsOnMethods ="addContactType")
	
	public void contactTypeListing()
	{
		test=getTest( Screenname + " : Contact Type screen");
		ContactTypeAction contactTypeAction = new ContactTypeAction (driver);
		new LoginAction(driver).logoutLogin();
		contactTypeAction.goToChannelTab();
		contactTypeAction.ActiveStatus();
		contactTypeAction.InactiveStatus();
		contactTypeAction.delete();
		
		
	}
	
			
	
}
