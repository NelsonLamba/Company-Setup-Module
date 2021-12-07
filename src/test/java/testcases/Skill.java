package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ShiftAction;
import Action.SkillAction;
import utils.WebTestBase;

public class Skill extends WebTestBase {

	static String Screenname = "<b> Skill </b>";

	@Test(priority = 1)
	public void validationCheck() {
		test = getTest(Screenname + ": Validation message on Add Skill");

		SkillAction skillaction = new SkillAction(driver);

		new LoginAction(driver).logoutLogin();
		skillaction.goToSkillTab();
		skillaction.validationCheck();

	}

	@Test(priority = 2)

	public void addSkill() {
		test = getTest(Screenname + "Add skill");

		SkillAction skillaction = new SkillAction(driver);

		new LoginAction(driver).logoutLogin();
		skillaction.goToSkillTab();
		skillaction.addNewSkill();
	}

	@Test(priority = 3)

	public void EditSkill() {
		test = getTest(Screenname + "Edit skill");

		SkillAction skillaction = new SkillAction(driver);

		new LoginAction(driver).logoutLogin();
		skillaction.goToSkillTab();

		skillaction.EditSkill();
	}
	
	
	@Test(priority = 4)

	public void SkillListing() {
		test = getTest(Screenname + "skill Listing");

		SkillAction skillaction = new SkillAction(driver);

		new LoginAction(driver).logoutLogin();
		skillaction.goToSkillTab();
		
		skillaction.ActiveStatus();
		skillaction.InactiveStatus();
		skillaction.delete();
		
	}

}
