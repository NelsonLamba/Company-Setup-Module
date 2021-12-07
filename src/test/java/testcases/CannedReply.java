package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CannedReplyAction;
import Action.LoginAction;
import utils.WebTestBase;

public class CannedReply extends WebTestBase {

	static String Screenname ="<b>CannedReply</b>";
	@Test(priority=1)
	public void ValidationCheck()
	{
		
		test=getTest(Screenname + " : Validation message on Add Canned Reply");
		CannedReplyAction cannedaction = new CannedReplyAction(driver);
		new LoginAction(driver).logoutLogin();
		cannedaction.GoToCannedReplyTab();
		cannedaction.ValidationCheck();
		
	}
	
	@Test(priority=2)
	public void  AddCannedReply()
	{
		
		test=getTest(Screenname + " : Add Canned Reply");
		CannedReplyAction cannedaction = new CannedReplyAction(driver);
		new LoginAction(driver).logoutLogin();
		cannedaction.GoToCannedReplyTab();	
		cannedaction.AddPrivateCannedReply();
		cannedaction.AddPublicCannedReply();
	}
	
	@Test(priority=3 , dependsOnMethods ="AddCannedReply")
	public void SearchActiveInactiveDeleteCannedReply()
	{
		test=getTest(Screenname + " : Canned Reply listing ");
		CannedReplyAction cannedaction = new CannedReplyAction(driver);
		new LoginAction(driver).logoutLogin();
		cannedaction.GoToCannedReplyTab();
		cannedaction.SearchCannedReply();
		cannedaction.ActiveInactive();
		cannedaction.Delete();
	}
	
	
}
