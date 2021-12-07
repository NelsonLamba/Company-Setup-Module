package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.DesignationAction;
import Action.LoginAction;
import Action.TrainingFeedbackAction;
import utils.WebTestBase;

public class TrainingFeedback extends WebTestBase {
	
	static String Screenname = "<b>TrainingFeedback </b>";
	
	
	@Test(priority=1, enabled= false)
	public void addFeedbackValidationCheck()
	{
		
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button on Add Designation Screen");
		TrainingFeedbackAction trainingaction = new TrainingFeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingaction.goToTrainingFeedbackTab();
		trainingaction.validationCheck();	
	}
	
	
	@Test(priority=2)
	public void addTrainingFeedback()
	{
		test = getTest( Screenname + ": Add Training Feedback Screen");
		TrainingFeedbackAction trainingaction = new TrainingFeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingaction.goToTrainingFeedbackTab();
		trainingaction.addTrainingFeedback();
		
	}
	
	@Test(priority=3)
	public void editTrainingFeedback()
	{
		test = getTest( Screenname + ": Add Training Feedback Screen");
		TrainingFeedbackAction trainingaction = new TrainingFeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingaction.goToTrainingFeedbackTab();
		trainingaction.editTrainingFeedback();
	}
	
	@Test(priority=4)
	 public void TrainingFeedbacklisting()
	 {
		
		test = getTest( Screenname + ": Training Feedback Listing");
		TrainingFeedbackAction trainingaction = new TrainingFeedbackAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingaction.goToTrainingFeedbackTab();
		trainingaction.ActiveStatus();
		trainingaction.InactiveStatus();
		trainingaction.delete();
		
	 }
	

}
