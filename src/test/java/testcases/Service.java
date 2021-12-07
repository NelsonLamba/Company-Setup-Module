package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.PriorityAction;
import Action.ServiceAction;
import utils.WebTestBase;

public class Service extends WebTestBase {
	
	
	static String Screenname ="<b> Service /b>";
	//WebDriver driver ;
	
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Service");
		//PriorityAction priorityaction = new PriorityAction(driver);
		ServiceAction serviceaction = new ServiceAction(driver);
		new LoginAction(driver).logoutLogin();
		serviceaction.goToServiceTab();
		serviceaction.validationCheck();	
			
	}
	
	
	@Test(priority=2)
	
	public void addService()
	{
		test=getTest(Screenname + "Add Service");
		ServiceAction serviceaction = new ServiceAction(driver);
		new LoginAction(driver).logoutLogin();
		serviceaction.goToServiceTab();
		serviceaction.addService();
	}

	
	@Test(priority=3)
	public void editService()
	{
		test=getTest(Screenname + "Edit Service");
		ServiceAction serviceaction = new ServiceAction(driver);
		new LoginAction(driver).logoutLogin();
		serviceaction.goToServiceTab();
		serviceaction.editCreatedService();
	}
	
	@Test(priority=4)
	public void ServiceListing()
	{
		test=getTest(Screenname + "Service Listing");
		ServiceAction serviceaction = new ServiceAction(driver);
		new LoginAction(driver).logoutLogin();
		serviceaction.goToServiceTab();
		//priorityaction.displayOrderCheck();
		serviceaction.ActiveStatus();
		serviceaction.InactiveStatus();
		serviceaction.delete();
	}
	
}
