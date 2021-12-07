package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LocationAction;
import Action.LoginAction;
import Action.PaymentGatewayAction;
import utils.WebTestBase;

public class PaymentGateway extends WebTestBase {
	
	static String Screenname = "<b> Payment Gateway </b>";
	
	
	@Test(priority=1 , enabled= false)
	public void addPaymentGatewayValidation()
	{
		
		test = getTest( Screenname + ":  Validation check on Payment Gateway Screen");
		PaymentGatewayAction paymentgatewayaction= new PaymentGatewayAction(driver);
		new LoginAction(driver).logoutLogin();
		paymentgatewayaction.goToPaymentGatewayTab();
		paymentgatewayaction.ValidationCheck();
		paymentgatewayaction.userGuide();
		
		
	}
	
	@Test(priority=2)
	public void addPaymentGateway()
	{
		test = getTest( Screenname + ": Add Payment Gateway Screen");
		PaymentGatewayAction paymentgatewayaction= new PaymentGatewayAction(driver);
		new LoginAction(driver).logoutLogin();
		paymentgatewayaction.goToPaymentGatewayTab();
		paymentgatewayaction.addPaymentGateway();
		
	}
	
	@Test(priority=3)
	public void editPaymentGateway()
	{
		test = getTest( Screenname + ": edit Screen on Payment Gateway Screen");
		PaymentGatewayAction paymentgatewayaction= new PaymentGatewayAction(driver);
		new LoginAction(driver).logoutLogin();
		paymentgatewayaction.goToPaymentGatewayTab();
		paymentgatewayaction.editPaymentGateway();
		
	}
	
	@Test(priority=4, enabled= false)
	public void PaymentGatewayListing()
	{
		
		test = getTest( Screenname + ": Payment Gateway Listing");
		PaymentGatewayAction paymentgatewayaction= new PaymentGatewayAction(driver);
		new LoginAction(driver).logoutLogin();
		paymentgatewayaction.goToPaymentGatewayTab();
		paymentgatewayaction.ListingActions();
//		paymentgatewayaction.InactiveStatus();
//		paymentgatewayaction.delete();
//		
	}
	
	

}
