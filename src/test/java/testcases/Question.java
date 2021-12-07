package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Action.LoginAction;
import Action.PriorityAction;
import Action.QuestionAction;
import utils.WebBasePage;
import utils.WebTestBase;

public class Question extends WebTestBase {
	

	 
	 static String Screenname ="<b> Question /b>";
		
		
		@Test(enabled=false)
		public void validationCheck()
		{
			test=getTest(Screenname + ": Validation message on Add Question");
			QuestionAction questionaction = new QuestionAction(driver);
			new LoginAction(driver).logoutLogin();
			questionaction.goToQuestionTab();
			questionaction.validationCheck();	
				
		}

		@Test(priority=2)
		
		public void addQuestion()
		{
			test=getTest(Screenname + "Add Question");
			QuestionAction questionaction = new QuestionAction(driver);
			new LoginAction(driver).logoutLogin();
			questionaction.goToQuestionTab();
			questionaction.addQuestion();
		}
		
		@Test(priority=3)
		public void editQuestion()
		{
			test=getTest(Screenname + "Edit Question");
			QuestionAction questionaction = new QuestionAction(driver);
			new LoginAction(driver).logoutLogin();
			questionaction.goToQuestionTab();
			questionaction.editCreatedQuestion();
			
			
		}
		
		@Test(priority=4)
		public void priorityListing()
		{
			test=getTest(Screenname + "Question Listing");
			QuestionAction questionaction = new QuestionAction(driver);
			new LoginAction(driver).logoutLogin();
			questionaction.goToQuestionTab();
			questionaction.ActiveStatus();
			questionaction.InactiveStatus();
			questionaction.delete();
		}
}
