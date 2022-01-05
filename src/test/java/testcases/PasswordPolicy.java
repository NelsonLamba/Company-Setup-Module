package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.PasswordPolicyAction;
import Action.StatusAction;
import utils.WebTestBase;

public class PasswordPolicy extends WebTestBase {
	
	
	static String Screenname = "<b>PasswordPolicy</b>";
	
	@Test(priority = 1)
	public void passwordLength()
	
	{
		test = getTest(Screenname + ": Validation message on Add Password Policy"); 
		PasswordPolicyAction passwordpolicyaction = new PasswordPolicyAction(driver);
		
				new LoginAction(driver).logoutLogin();
				passwordpolicyaction.goToPasswordTab();
				passwordpolicyaction.passwordLengthValidationCheck();
				passwordpolicyaction.resetPasswordLengthValidationCheck();
	}
	
	
	@Test(priority=2)
	 public void blackklist()
	 {
		test = getTest(Screenname + ": Validation message on blacklist Password"); 
		PasswordPolicyAction passwordpolicyaction = new PasswordPolicyAction(driver);
		new LoginAction(driver).logoutLogin();
		passwordpolicyaction.goToPasswordTab();
		passwordpolicyaction.blackListPassword();
		passwordpolicyaction.blacklistPasswordValidationCheck();
		
		
	 }
	
	
	@Test(priority=3)
	 public void reusePassword()
	 {
		test = getTest(Screenname + ": Validation message on  Reuse Password"); 
		PasswordPolicyAction passwordpolicyaction = new PasswordPolicyAction(driver);
		new LoginAction(driver).logoutLogin();
		passwordpolicyaction.createUser();
		passwordpolicyaction.goToPasswordTab();
		passwordpolicyaction.reusePasswordValidation();
	 }
	
	
	//@Test(priority=4)
	
	// public void 
	
	
//	@Test(priority = 1)
//	public void validationCheck() {
//		test = getTest(Screenname + ": Validation message on Add Password Policy"); 
//
//		PasswordPolicyAction passwordpolicyaction = new PasswordPolicyAction(driver);
//
//		new LoginAction(driver).logoutLogin();
//		passwordpolicyaction.goToPasswordTab();
//		passwordpolicyaction.passwordLengthValidationCheck();
//		passwordpolicyaction.blackListPasswordValidation();
//		passwordpolicyaction.reusePasswordValidation();
//		//	passwordpolicyaction
//		//passwordpolicyaction.validationCheck();
//	}
//	
//	@Test(priority=2)
//	public void 

}
