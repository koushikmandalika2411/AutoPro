package stepDefinition;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	
	//Created for geerating the unique emailid randomly.  
	public static String randomestring() {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		   LocalDateTime now = LocalDateTime.now();  
		   //System.out.println(dtf.format(now));
		return dtf.format(now);   
	}
   public static void main(String[] args) {
	BaseClass baseClass=new BaseClass();
	baseClass.randomestring();
}
}
