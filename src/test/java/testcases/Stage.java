package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.SkillAction;
import Action.StageAction;
import utils.WebTestBase;

public class Stage extends WebTestBase {
	
	
	static String Screenname = "<b> Stage </b>";

	@Test(priority = 1)
	public void validationCheck() {
		test = getTest(Screenname + ": Validation message on Add Stage");

		StageAction stageaction = new StageAction(driver);

		new LoginAction(driver).logoutLogin();
		stageaction.goToStageTab();
		stageaction.validationCheck();

	}
	
	@Test(priority = 2)

	public void addStage() {
		test = getTest(Screenname + "Add Stage");
		StageAction stageaction = new StageAction(driver);

		new LoginAction(driver).logoutLogin();
		stageaction.goToStageTab();
		stageaction.addNewStage();
	
		
	}
	
	@Test(priority = 3)

	public void EditStage() {
		test = getTest(Screenname + "Edit Stage");

		StageAction stageaction = new StageAction(driver);

		new LoginAction(driver).logoutLogin();
		stageaction.goToStageTab();

		stageaction.EditStage();
	}
	
	@Test(priority = 4)

	public void StageListing() {
		test = getTest(Screenname + "Stage Listing");

		StageAction stageaction = new StageAction(driver);

		new LoginAction(driver).logoutLogin();
		stageaction.goToStageTab();
		
		stageaction.ActiveStatus();
		stageaction.InactiveStatus();
		stageaction.delete();
		
	}
	

}
