package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LoginAction;
import Action.ShiftAction;
import Action.TaxAndDiscountAction;
import utils.WebTestBase;

public class TaxAndDiscount extends WebTestBase {
	
	static String Screenname ="<b> Tax And Disocunt </b>";
	
	@Test(priority=1)
	public void ValidationCheck()
	{
		
		test=getTest(Screenname + ": Validation message on Add Tax and Discount ");
		
		TaxAndDiscountAction taxanddiscountaction = new TaxAndDiscountAction(driver);
		
		new LoginAction(driver).logoutLogin();
		taxanddiscountaction.goToTaxAndDiscount();
		taxanddiscountaction.validationCheck();	
		
	}
	
	
	@Test(priority=2)
	public void AddTaxAndDiscount()
	{
		test=getTest(Screenname + ": Validation message on Add Tax and Discount ");
		
		TaxAndDiscountAction taxanddiscountaction = new TaxAndDiscountAction(driver);
		
		new LoginAction(driver).logoutLogin();
		taxanddiscountaction.goToTaxAndDiscount();
		taxanddiscountaction.addTax();	
		taxanddiscountaction.addDiscount();
	}
	
	@Test(priority=3)
	public void  ActiveAndINactive()
	{
		
		test=getTest(Screenname + ": Change status ");
		
		TaxAndDiscountAction taxanddiscountaction = new TaxAndDiscountAction(driver);
		
		new LoginAction(driver).logoutLogin();
		taxanddiscountaction.goToTaxAndDiscount();
		taxanddiscountaction.ActiveToInactiveTax();
		taxanddiscountaction.ActiveToInactiveDiscount();
		
		
		
		
		
	}
	
	
	

}
