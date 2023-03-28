package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class steps {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Firefox browser")
	public void user_Launch_Chrome_browser() {
//		System.setProperty("Webdriver.firefox.driver", System.getProperty("user")+"//Drivers/Firefox Installer.exe");
//		driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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


	
}
