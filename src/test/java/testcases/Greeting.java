package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.EmailTemplateAction;
import Action.GreetingAction;
import Action.LoginAction;
import utils.WebTestBase;

public class Greeting extends WebTestBase {

	static String Screenname = "<b>Greeting</b>"; 
		
		
	
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest( Screenname  + ": Validation message on  Greeting  screen");
	GreetingAction greetingaction = new GreetingAction (driver);
		new LoginAction(driver).logoutLogin();
		greetingaction.moveToGreetingTab();
		greetingaction.validationMesssageCheck();
	}
	
	
	@Test(priority=2)
	
	public void addGreeting()
	{
		test=getTest( Screenname  + ": Validation message on  Greeting  screen");
	GreetingAction greetingaction = new GreetingAction (driver);
		new LoginAction(driver).logoutLogin();
		greetingaction.moveToGreetingTab();
		greetingaction.addGreetingAndGreetingTemplate();
		
		
		
	}

}
