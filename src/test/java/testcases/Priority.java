package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Action.LoginAction;
import Action.PhaseAction;
import Action.PriorityAction;
import utils.WebTestBase;

public class Priority  extends WebTestBase{
	
	static String Screenname ="<b> Priority </b>";
	//WebDriver driver ;
	
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Priority");
		PriorityAction priorityaction = new PriorityAction(driver);
		new LoginAction(driver).logoutLogin();
		priorityaction.goToPriorityTab();
		priorityaction.validationCheck();	
			
	}
	
	@Test(priority=2)
	
	public void addPriority()
	{
		test=getTest(Screenname + "Add Priority");
		PriorityAction priorityaction = new PriorityAction(driver);
		new LoginAction(driver).logoutLogin();
		priorityaction.goToPriorityTab();
		priorityaction.addPriority();
	}
	
	
	@Test(priority=3)
	public void editPriority()
	{
		test=getTest(Screenname + "Edit Priority");
		PriorityAction priorityaction = new PriorityAction(driver);
		new LoginAction(driver).logoutLogin();
		priorityaction.goToPriorityTab();
		priorityaction.editCreatedPriority();
		
		
	}
	
	@Test(priority=4)
	public void priorityListing()
	{
		test=getTest(Screenname + "Priority Listing");
		PriorityAction priorityaction = new PriorityAction(driver);
		new LoginAction(driver).logoutLogin();
		priorityaction.goToPriorityTab();
		//priorityaction.displayOrderCheck();
		priorityaction.ActiveStatus();
		priorityaction.InactiveStatus();
		priorityaction.delete();
	}
}
