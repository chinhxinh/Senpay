package Senpay.steps.serenity;

import java.util.concurrent.TimeUnit;

import net.thucydides.core.steps.ScenarioSteps;
import Senpay.pages.LoginPage;

public class UserLoginSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage loginpage;

	public void LoginPage(String phone) throws Throwable {
		loginpage.open();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginpage.inputAccountInfo(phone);
		Thread.sleep(2000);

	}
	
	public void LoginPass(String pass) throws Throwable {
		loginpage.inputPassInfo(pass);
		Thread.sleep(2000);

	}
	

	public void Transaction_Fundin()  throws Throwable {
		// TODO Auto-generated method stub
		loginpage.Transaction_Fundin();
		Thread.sleep(2000);
	}

}
