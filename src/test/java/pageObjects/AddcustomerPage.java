package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddcustomerPage {
	
	public static WebDriver driver;
	public AddcustomerPage(WebDriver driver) {
		//ldriver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	By lnkCustomer_menu = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p");
	By lnkCustomer_menuitem = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p");
	
	By btnAddnew = By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
	
	By txtemail = By.xpath("//*[@id=\"Email\"]"); 
	By txtPassword = By.xpath("//*[@id=\"Password\"]");
	
	By txtFirstName = By.xpath("//*[@id=\"FirstName\"]");
	By txtLastName = By.xpath("//*[@id=\"LastName\"]");
	
	By rdMaleGender = By.xpath("//*[@id=\"Gender_Male\"]");
	By rdFemaleGender = By.xpath("//*[@id=\"Gender_Female\"]");
	
	By calendericon = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[6]/div[2]/span[1]/span");
	By calenderDate = By.xpath("//*[@id=\"3696e5ef-8b8f-46a2-a826-ee268c1729f3\"]/div[2]/table/tbody/tr[4]/td[4]/a");
	
	By txtCompanyName = By.xpath("//*[@id=\"Company\"]");
	
	By btncheckexempt = By.xpath("//*[@id=\"IsTaxExempt\"]");
	By txtNewsletter = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div");
	
	By txtcustomerRoles = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div");
	
	By lstitemAdministrator = By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[1]");
	By lstitemForum_Moderators = By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[2]");
	By lstitemGuests = By.xpath("\"//*[@id=\\\"SelectedCustomerRoleIds_listbox\\\"]/li[3]");
	By lstitemRegistered = By.xpath("\"//*[@id=\\\"SelectedCustomerRoleIds_listbox\\\"]/li[4]");
	
	By drpmgrOfVendors = By.xpath("//*[@id=\"VendorId\"]");
	
	By btncheckActive = By.xpath("//*[@id=\"Active\"]");
	
	By txtAdmin_Comment = By.xpath("//*[@id=\"AdminComment\"]");
	
	By btnSave = By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");
	
	
	public void clickOnCustomerMenu() {
		driver.findElement(lnkCustomer_menu).click();		
	}
	
	public void clickOnCustomerMenuItem() {
		driver.findElement(lnkCustomer_menuitem).click();		
	}
	
	public void clickOnAddnew() {
		driver.findElement(btnAddnew).click();		
	}
	public void setEmail(String email) {
		driver.findElement(txtemail).clear();
		driver.findElement(txtemail).sendKeys(email);
	}
	public void setPassword(String password) {
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys(password);
	}
	public void setFirstName(String firstName) {
		driver.findElement(txtFirstName).clear();
		driver.findElement(txtFirstName).sendKeys(firstName);
	}
	

}
