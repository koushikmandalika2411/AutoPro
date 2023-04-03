package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddcustomerPage {
	
	public static WebDriver driver;
	public AddcustomerPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	//By lnkCustomer_menu = By.xpath("//a[@class='nav-link']//p[text()=' Customers']");
	///html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p
	//p[text()=' Customers']
	//aside/div/div[4]/div[1]/div/nav/ul/li[3]/a/p/text()
	By lnkCustomer_menu = By.xpath("//div/nav/ul/li[4]/a/p[contains (text(),'Customers')]");
	
	By lnkCustomer_menuitem = By.xpath("//a/p[text()=' Customers']");
	
	By btnAddnew = By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
	
	By txtemail = By.xpath("//*[@id=\"Email\"]"); 
	By txtPassword = By.xpath("//*[@id=\"Password\"]");
	
	By txtFirstName = By.xpath("//*[@id=\"FirstName\"]");
	By txtLastName = By.xpath("//*[@id=\"LastName\"]");
	
	By rdMaleGender = By.id("Gender_Male");
	By rdFemaleGender = By.id("Gender_Female");
	
	By calendericon = By.xpath("//*[@id=\"DateOfBirth\"]//ancestor::span/span/span[@role='button']");
	By calenderDate = By.xpath("//*[@id=\"3696e5ef-8b8f-46a2-a826-ee268c1729f3\"]/div[2]/table/tbody/tr[4]/td[4]/a");
	
	By dob = By.xpath("//*[@id='DateOfBirth']");
	
	By txtCompanyName = By.id("Company");
	
	By btncheckexempt = By.xpath("//*[@id=\"IsTaxExempt\"]");
	By txtNewsletter = By.xpath("//*[@id='customer-info']/div[2]/div[9]/div[2]/div/div[1]/div/div/input");
	By txtYourStoreName = By.xpath("//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[1]");
	By txtTestStore = By.xpath("//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[2]");
	
	By txtcustomerRoles = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div");
	By lstitemAdministrator = By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[1]");
	By lstitemForum_Moderators = By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[2]");
	By lstitemGuests = By.xpath("\"//*[@id=\\\"SelectedCustomerRoleIds_listbox\\\"]/li[3]");
	By lstitemRegistered = By.xpath("\"//*[@id=\\\"SelectedCustomerRoleIds_listbox\\\"]/li[4]");
	
	By drpmgrOfVendors = By.id("VendorId");
	By txtnotaVendor = By.xpath("//*[@id='VendorId']/option[1]");
	By txtVendor1 = By.xpath("//*[@id='VendorId']/option[2]");
	By txtVendor2 = By.xpath("//*[@id='VendorId']/option[3]");
	
	By btncheckActive = By.xpath("//*[@id=\"Active\"]");
	
	By txtAdmin_Comment = By.id("AdminComment");
	
	By btnSave = By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");
	
	
	public void clickOnCustomerMenu() {
		WebElement ele=customer(lnkCustomer_menu,60);
				ele.click();
	}
	
	public void clickOnCustomerMenuItem() throws InterruptedException {
		Thread.sleep(5000);
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
	public void setLastName(String lastName) {
		driver.findElement(txtLastName).clear();
		driver.findElement(txtLastName).sendKeys(lastName);
	}
	public void setGender(String gender) {
	if(gender == "Male") {
		driver.findElement(rdMaleGender).click();;
	}else if(gender == "Female"){
		driver.findElement(rdFemaleGender).click();;
	}
	}
	public void setDateOfBirth(String cdob) {
		driver.findElement(dob).sendKeys(cdob);
        //WebElement ele=wdob(dob,60);
		//ele.sendKeys(cdob);
	}
	public void setCompanyName(String companyName) {
		driver.findElement(txtCompanyName).clear();
		driver.findElement(txtCompanyName).sendKeys(companyName);
	}
	public void clickOnExempt() {
		driver.findElement(btncheckexempt).click();
	}
	public void setNewsletter(String newsitems) throws InterruptedException {
		driver.findElement(txtNewsletter).click();
		Thread.sleep(1000);
		if(newsitems == "Your Store Name") {
			driver.findElement(txtYourStoreName).click();
		}else if(newsitems == "Test	Store") {
			driver.findElement(txtTestStore).click();
		}
	}
	public void setVendor(String vendor) {
		driver.findElement(drpmgrOfVendors).click();
		if(vendor == "Vendor1") {
			driver.findElement(txtVendor1).click();
		}else if(vendor == "Vendor2") {
			driver.findElement(txtVendor2).click();
		}else {
			driver.findElement(txtnotaVendor).click();
		}
	}
//	public void checkActive(boolean status ) {
//		if(!driver.findElement(btncheckActive).isSelected()) {
//			driver.findElement(btncheckActive).click();
//		}
//	}
	public void checkActive(boolean status ) {
		if(!status) {
		   driver.findElement(btncheckActive).click();
		}
	}
	public void setAdminCommit(String commit) {
		driver.findElement(txtAdmin_Comment).sendKeys(commit);;
	}
	
	public void clickOnSave() throws InterruptedException {
		driver.findElement(btnSave).click();
		Thread.sleep(5000);
	}
	
	
	//For Customer_Menu click
	private static WebElement customer(By locator, int timeout)
	{
	    WebElement element=new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(locator));
	    return element;
	}
	//For dob
	private static WebElement wdob(By locator, int timeout)
	{
	    WebElement element=new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(locator));
	    return element;
	}
	

}
