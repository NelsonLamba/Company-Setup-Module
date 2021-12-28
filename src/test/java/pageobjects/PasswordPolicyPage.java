package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class PasswordPolicyPage extends WebBasePage {
	
	
	WebDriver driver;

	String pattern = "yyMMddHHmmss";
	Date date = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat(pattern);

	String datevalue = dateformat.format(date);

	String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testfiles\\";
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	//static String statusproductname;
	
	public PasswordPolicyPage(WebDriver driver) {

		super(driver, "Password Policy Page");
		this.driver = driver;
	}
	
	public void clickFullMenuDropDown() {
		click(By.cssSelector("a#navbarDropdownPortfolio"), "Full Menu", 30);
		staticWait(2000);
	}
	
	public void clickCompanySetupSideMenu() {
		clickByJavascript(By.xpath("//li[@data-name='COMPANY']//a//i//following::text()[1]//following::span[1]"),
				"Company setup side Menu", 10);
	}

//	public void clickCompanySetupLink() {
//		click(By.xpath("//a[contains(text(),'COMPANY SETUP')]"), "Company Setup Link", 30);
//		staticWait(2000);
//	}

	 public void clickUserListingPage()
	 {
		 click(By.xpath("//li[@class='menuitem']/a[@data-original-title='User']"), " User Listing Page ", 30);
			staticWait(2000);
	 }
	public void clickCompanySetupPage() {
		click(By.xpath("//a[contains(text(),'Company Setup')]"), " Company Setup Page", 30);
		staticWait(2000);
	}

	public void clickOnPasswordPolicy() {
		clickByJavascript(By.xpath("//ul[@id='upper']//li/a[text()='Password Policy']"), "Password Policy", 20);
		staticWait(2000);
	}
	
	 public void clearMaxAndMinPassLength()
	 {
		 clear(By.id("MinLengthPwd"),"Password Minimum Length",25);
		 clear(By.id("MaxLengthPwd"),"Password Maximum Length",25);
		 
	 }
	 
	  public void enterValueMaxAndMinPassLength()
	  {
		  enter(By.id("MinLengthPwd"),"6","Password Minimum Length",25);
		  enter(By.id("MaxLengthPwd"),"10" ,"Password Minimum Length", 25);
	  }
	 
	 public void save() {
			clickByJavascript(By.xpath("//a[@id='btnSave']"), "Save Status Name", 20);
			staticWait(3500);
		}
	 
	 public void verifyPasswordLengthValidation()
		{
			String  Message = driver.findElement(By.xpath("//div[@id='notifymessage']/div/span")).getText(); 
			 if(Message.equals("Enter a number between 4-31"))
			 {
				 getTest().log(LogStatus.PASS, "Validation message is displayed as expected " + Message);
	            logger.info("Validation message is displayed as expected " + Message);	
			 }
			 else
			 {
				 getTest().log(LogStatus.FAIL, "Validation message is not displayed as expected "+ Message);
	            logger.info("Validation message is not displayed as expected " + Message);
	            takeScreenshot(new Object() {
	            }.getClass().getEnclosingMethod().getName());
	            //Assert.fail("" + e);
			 }
		}
	 
	 public void verifyBlacklistPassValidation()
		{
			String  Message = driver.findElement(By.xpath("//div[@id='notifymessage']/div/span")).getText(); 
			 if(Message.equals("Black Listed Passwords is required"))
			 {
				 getTest().log(LogStatus.PASS, "Validation message is displayed as expected " + Message);
	            logger.info("Validation message is displayed as expected " + Message);	
			 }
			 else
			 {
				 getTest().log(LogStatus.FAIL, "Validation message is not displayed as expected " + Message );
	            logger.info("Validation message is not displayed as expected " + Message);
	            takeScreenshot(new Object() {
	            }.getClass().getEnclosingMethod().getName());
	            //Assert.fail("" + e);
			 }
		}
	 
	  public void closeNotifyMessage()
	  {
		  click(By.id("closenotifymessage"),"Close Notify Message ", 20);
	  }
	  
	  public void clearBlackListPassword() 
	  {
		  
		 clear(By.xpath("//div[@id='alldivBlackListedPwd']/div/input"),"Clear Black List Password ", 20);
	  }
	  
	  public void enterValueBlacklistfield()
	  {
		  enter(By.xpath("//div[@id='alldivBlackListedPwd']/div/input"),"talygenpassword","enter Black List Password ",25);
	  }
	  
	  public void clearReusePasswordCount()
	  {
		  clear(By.id("ReusePwdNumber")," Clear the Reuse Password Count ", 25);
	  }
	  
	  public void verifyreusePasswordValidation()
	  {
		  String  Message = driver.findElement(By.xpath("//div[@id='notifymessage']/div/span")).getText(); 
			 if(Message.equals("Enter a number larger than 0"))
			 {
				 getTest().log(LogStatus.PASS, "Validation message is displayed as expected " + Message);
	            logger.info("Validation message is displayed as expected " + Message);	
			 }
			 else
			 {
				 getTest().log(LogStatus.FAIL, "Validation message is not displayed as expected " + Message );
	            logger.info("Validation message is not displayed as expected " + Message);
	            takeScreenshot(new Object() {
	            }.getClass().getEnclosingMethod().getName());
	            //Assert.fail("" + e);
			 } 
	  }
	  
	   public void enterPasswordCount()
	   {
		   enter(By.id("ReusePwdNumber"),"1","Enter Reuse Password Count",25);
	   }
	   
	    public void  searchLoginUser()
	    {
	    	 String loginusername = getText(By.xpath("//a[@id='navbarDropdownMenuLink']/span[2]"), 20);
	    	 click(By.xpath("//div[@id='headingOne1']//span[@id='searchbyname']/following-sibling::i")," click on the  search by name field", 25);
	    	 enter(By.xpath("//input[@id='txtsearchByUserName']"),loginusername," Search By name", 20);
	    	 click(By.xpath("//a[@id='Go']")," Click on search buttton", 25);
	    }
	    
	     public void clickOnUsername()
	     {
	    	 click(By.xpath("//a[@id='ancEdituser']"),"Click on the Username", 25);
	    	// click(By.xpath("//a[@data-original-title='Reset and Send Password']"), "Reset Password Link", 25);
	     }
	     
	      public void clickOnResetPassword()
	      {
	    	  click(By.xpath("//a[@data-original-title='Reset and Send Password']"), "Reset Password Link", 25);
	      }
	
	       public void enterLessThanLimit()
	       {
	    	   enter(By.id("txtNewPass"),"Passw","Entered Less then limit Password", 20);
	    	  
	    	   
	       }
	       public void enterGreaterThanLimit()
	       {
	    	   enter(By.id("txtNewPass"),"Password12345","Entered Greater then limit Password", 20);
	    	   
	    	   
	       }
	       public void verifyResetPasswordValidation()
	 	  {
	 		  String  Message = driver.findElement(By.xpath("//span[@for='txtNewPass']")).getText(); 
	 			 if(Message.equals("Please enter a valid New Password! (e.g. abc123#@_)"))
	 			 {
	 				 getTest().log(LogStatus.PASS, "Validation message is displayed as expected " + Message );
	 	            logger.info("Validation message is displayed as expected " + Message);	
	 			 }
	 			 else
	 			 {
	 				 getTest().log(LogStatus.FAIL, "Validation message is not displayed as expected "+ Message );
	 	            logger.info("Validation message is not displayed as expected " + Message);
	 	            takeScreenshot(new Object() {
	 	            }.getClass().getEnclosingMethod().getName());
	 	            //Assert.fail("" + e);
	 			 } 
	 	  }
	       public void closePopup()
	       {
	    	   click(By.xpath("//h5[text()='Reset Password']/..//Button[@data-original-title='Close']"),"Close popup", 25);
	       }
	        public void resetButton()
	        {
	        	click(By.xpath("//Button[text()='Reset']")," Reset Button", 25);
	        }
	        
	         public void enterBlacklistPassword()
	         {
	        	 enter(By.id("txtNewPass"),"talygenpassword","Enter Blacklist Password",25);
	         }
}

