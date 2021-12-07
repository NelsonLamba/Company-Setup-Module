package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.ChannelAction;
import Action.LoginAction;
import Action.PhaseAction;
import utils.WebTestBase;

public class Phase extends WebTestBase{
	
	static String Screenname ="<b> Phase /b>";
	
	
	@Test(priority=1)
	public void validationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Phase");
		PhaseAction  phaseaction = new PhaseAction(driver);
		new LoginAction(driver).logoutLogin();
		phaseaction.goToPhaseTab();
		phaseaction.validationCheck();	
	}
	
	@Test(priority=2)
	
		public void addPhase()
		{
			test=getTest(Screenname + "Add Phase");
			PhaseAction  phaseaction = new PhaseAction(driver);
			new LoginAction(driver).logoutLogin();
			phaseaction.goToPhaseTab();
			phaseaction.addPhase();
		}
	
	@Test(priority=3)
	public void editPhase()
	{
		test=getTest(Screenname + "Edit Phase");
		PhaseAction  phaseaction = new PhaseAction(driver);
		new LoginAction(driver).logoutLogin();
		phaseaction.goToPhaseTab();
		phaseaction.editCreatedPhase();

	}
	@Test(priority=4)
	public void phaseListing()
	{
		test=getTest(Screenname + "Phase Listing");
		PhaseAction  phaseaction = new PhaseAction(driver);
		new LoginAction(driver).logoutLogin();
		phaseaction.goToPhaseTab();
		phaseaction.ActiveStatus();
		phaseaction.InactiveStatus();
		phaseaction.delete();
	}
	

}
