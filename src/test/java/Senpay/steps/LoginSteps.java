package Senpay.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Senpay.steps.serenity.UserLoginSteps;

public class LoginSteps {
	@Steps
	UserLoginSteps userlogin;
	
	@Given("^Login Senpay site with Phone \"([^\"]*)\"$")
	public void Login_Senpay_site_with_Phone(String phone) throws Throwable {
	    userlogin.LoginPage(phone);
	   // throw new PendingException();
	}
	
	@Given("^Login Senpay site with Pass \"([^\"]*)\"$")
	public void Login_Senpay_site_with_Pass(String pass) throws Throwable {
	    userlogin.LoginPass(pass);
	   // throw new PendingException();
	}
	
	@Given("^Find Fundin menu$")
	public void find_Fundin_menu_test() throws Throwable {
	    userlogin.Transaction_Fundin();
	   // throw new PendingException();
	}
//	@Given("^Find Fundin menu$")
//	public void Find_Fundin_menu throws Throwable{
//		  userlogin.Transaction_Fundin();
//		  }
	
	/*
	 * @Given("^Find Fundin menu") 
	 * public void Find_Fundin_menu throws Throwable{
	 * userlogin.Transaction_Fundin();
	 * 
	 * }
	 */
	
	
}