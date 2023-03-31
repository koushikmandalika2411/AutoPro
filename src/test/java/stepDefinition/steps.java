package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class steps extends BaseClass{
	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
//		System.setProperty("Webdriver.firefox.driver", System.getProperty("user")+"//Drivers/Firefox Installer.exe");
//		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL_admin_demo_nopcommerce_com_login(String url) {
		driver.get(url);
	    
	}
	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() {
		lp.clickLogin();        
	  
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
	  if(driver.getPageSource().contains("Login was unsuccessful.")) {
		  driver.close();
		  Assert.assertTrue(false);
	  }else {
		  Assert.assertEquals(title, driver.getTitle());
	  }
	}

	@When("User click on Logout link")
	public void user_click_on_Logout_link() throws InterruptedException {
	   lp.clickLogout();
	   Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();	   
	}
	
	//Customer page
	
	
	
	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() {
		String title = driver.getTitle();
		System.out.println(title);
		addCust = new AddcustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",addCust.getPageTitle());
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() throws InterruptedException {
	    Thread.sleep(3000);
		addCust.clickOnCustomerMenu();
	}

	@When("click on customer Menu Item")
	public void click_on_customer_Menu_Item() throws InterruptedException {
		Thread.sleep(3000);
		addCust.clickOnCustomerMenuItem();
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() {
		addCust.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
	   
	}

	@When("click on save button")
	public void click_on_save_button() {
	    
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	   
	}
	
}