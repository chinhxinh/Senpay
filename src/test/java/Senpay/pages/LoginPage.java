package Senpay.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://senpay.vn/")

public class LoginPage extends PageObject {

//	@FindBy(xpath = "//a[@id='btnLogin']")
//	WebElement lbLogin;
//	@FindBy(xpath = "//body/div[@id='container-guest']/div/div[@id='signin-area']/div[@class='phone-field']/div[1]")
//	WebElement txtPhone;
	@FindBy(id = "btnLogin")
	WebElement lbLogin;
	@FindBy(xpath = "//input[@type=\"tel\"]")
	WebElement txtPhone;
	@FindBy(xpath="//div[@id='signin-area']//div//button//div")
	WebElement btnNext;
	@FindBy(xpath="//div[@class='pincode-field']//div//input")
	WebElement txtPass;
	@FindBy(xpath="//span[contains(text(),'TIẾP THEO')]")
	WebElement btnNext01;
	@FindBy(xpath="//a[@id='MainMenu_hlTrans']")
	WebElement lblTransaction;
	@FindBy (xpath="//a[@id='MainContent_TransMenu1_hlTopUp']")
	WebElement lblFundin;
	@FindBy(xpath="//div[@id='CardLink']//img[1]")
	WebElement lblVCB;
	
	
	
	
//	@FindBy(xpath = "//div[@id='signin-area']//div//button//div")
//	WebElement btnNext;
	public void inputAccountInfo(String phone) {
		lbLogin.click();
		txtPhone.sendKeys(phone);
		btnNext.click();
		
		
	}
	public void inputPassInfo (String pass) {
		txtPass.sendKeys(pass);
		btnNext01.click();
	}
	
	public void Transaction_Fundin() {
		
		lblTransaction.click();
		lblFundin.click();
		lblVCB.click();
		
		//Actions actionHover = new Actions(getDriver());
		/*
		 * actionHover.moveToElement(lblTransaction).click().build().perform();
		 * actionHover.moveToElement(lblFundin).click().build().perform(); action
		 Hover.moveToElement(lblVCB).click().build().perform();*/
	}


}
;