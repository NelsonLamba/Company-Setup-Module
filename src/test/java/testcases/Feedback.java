package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.FeedbackAction;
import Action.LoginAction;
import utils.WebTestBase;

public class Feedback  extends WebTestBase{
	
	
	static String Screenname = "<b>Feedback</b>";
	
	@Test (priority=1)
	public void validationCheck()
	{
		
		test=getTest(Screenname + " : Validation message on Add Feedback screen");
		FeedbackAction feedbackaction = new FeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		feedbackaction.GoToFeedbackTab();
		feedbackaction.validationCheck();
		
	}
	
	@Test (priority=2)
	public void addFeedback()
	{
		
		test=getTest(Screenname + " : Add Feedback screen");
		FeedbackAction feedbackaction = new FeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		feedbackaction.GoToFeedbackTab();
		feedbackaction.addFeedback();
		
	}
	
	@Test(priority=3)
	public void editFeedback()
	{
		test=getTest(Screenname + " :  edit Feedback screen");
		FeedbackAction feedbackaction = new FeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		feedbackaction.GoToFeedbackTab();
		feedbackaction.editFeedback();	
	}
	
	@Test(priority=4)
	public void feedbacklisting()
	{
		test=getTest(Screenname + " :  Feedback listing  screen");
		FeedbackAction feedbackaction = new FeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		feedbackaction.GoToFeedbackTab();
		feedbackaction.ActiveStatus();
		feedbackaction.InactiveStatus();		
	}
	
	@Test (priority=5)
	public void deleteAlltickets()
	{
		test=getTest(Screenname + " :  Delete All Tickets  from the listing");
		FeedbackAction feedbackaction = new FeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		feedbackaction.GoToFeedbackTab();
		feedbackaction.delete();
		
		
	}
	
	
	
	

}
