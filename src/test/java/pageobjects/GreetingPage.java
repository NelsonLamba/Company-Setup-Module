package pageobjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class GreetingPage  extends WebBasePage {

		WebDriver driver;
		
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testfiles\\";
		private final static String FILE_NAME = System.getProperty("user.dir")
				+ "\\src\\main\\resources\\testdata.properties";
		private static Properties prop = new PropertiesLoader(FILE_NAME).load();

		
		public  GreetingPage(WebDriver driver)
		{
			
			super(driver," Greeting Page");
			this.driver= driver;
		}
	
		
		public void clickFullMenuDropDown() {
			click(By.cssSelector("a#navbarDropdownPortfolio"), "Full Menu", 30);
			staticWait(2000);
		}

		public void clickCompanySetupLink() {
			click(By.xpath("//a[contains(text(),'COMPANY SETUP')]"), "Company Setup Link", 30);
			staticWait(2000);
		}

		public void clickCompanySetupPage() {
			click(By.xpath("//a[contains(text(),'Company Setup')]"), " Company Setup Page", 30);
			staticWait(2000);
		}

		public void clickOnGreeting() {
			clickByJavascript(By.xpath("//a[text()='Greeting']"), "Greeting", 20);
		}
		
		public void save() {
			clickByJavascript(By.xpath("//a[@id='btnSave']"), "Save Channel Name", 20);
			waitForLoad(30);
		}
		
		public void validationMessage()
		{
			
		  String validationMessage=	getText(By.xpath("//div[@id='notifymessage']//span"),25);
		 String message =  prop.getProperty("ValidationMessage");
		  
		  
		  verifyValidationMessage(By.xpath("//div[@id='notifymessage']//span"),message, 20);
		  
		}
		
		public void deSelectTemplate()
		{
		//	WebElement selectelement = driver.findElement(By.id("TemplateId"));
			//Select select = new Select(selectelement);
			
			selectValueWithText(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]/select"),"Select Template","UnSelect Template", 20);	
			
		}
		
		public void EmailTemplateURL()
		{
			open("https://sandbox2.talygen.com/emailtemplate/add");
		}
		
		public void greetingURL()
		{
			open("https://sandbox2.talygen.com/greeting/Index?search=&sortBy=&sortExp=&pageSize=&pageNum=javascript:;&isPartial=1");
		}
		
		
		public void selectTemplatedropdown()
		{
			selectValueWithText(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]/select"), EmailTemplatePage.GreetingTemplatename , "Anniversary Greeting", 25);
			staticWait(2000);
			selectValueWithText(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]/select"), EmailTemplatePage.GreetingTemplatename , "Anniversary Greeting", 25);
		}
		
		public void successMessage()
		{
			
			 String successMessage =	getText(By.xpath("//div[@id='notifymessage']//span"),25);
			 String message =  prop.getProperty("SuccessMessage");
			  
			  
			 verifySuccessMessage(By.xpath("//div[@id='notifymessage']//span"),message, 20);
		}
		
		
		
	
		
		
	

}
