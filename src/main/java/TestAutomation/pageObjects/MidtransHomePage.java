package TestAutomation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestAutomation.helpers.BasePage;
import TestAutomation.helpers.Config;
import TestAutomation.helpers.WaitHelper;

public class MidtransHomePage extends BasePage
{
	
	@FindBy(css = ".btn.buy")
	private WebElement buyButton;

	@FindBy(css = "input[value='budi@utomo.com']")
	private WebElement etEmail;

	@FindBy(css = ".cart-checkout")
	private WebElement checkoutButton;

	@FindBy(css = ".trans-status.trans-error")
	private WebElement errorBottomsheet;
	
	Config testConfig;
	
	public MidtransHomePage(Config testConfig)
	{
		PageFactory.initElements(testConfig.driver, this);
		this.testConfig = testConfig;
	}
	
	public void clickBuyButton()
	{
		WaitHelper.waitForElementToBeClickable(testConfig, buyButton, "waiting for buy button");
		click(testConfig, buyButton, "buyButton is being clicked here");
	}

	public void changeToWrongEmail(){
		WaitHelper.waitForElementToBeDisplayed(testConfig, etEmail, "waiting for edit text email");
		enterData(testConfig, etEmail, "budi@utomo", "enter wrong email");
	}

	public void clickCheckoutButton(){
		//flaky test
		WaitHelper.waitForElementToBeClickable(testConfig, buyButton, "waiting for checkout button");
		click(testConfig, checkoutButton, "checkoutButton is being clicked here");
	}

	public void assertErrorBottomSheet(){
		// WaitHelper.waitForElementToBeDisplayed(testConfig, errorBottomsheet, "waiting for error bottomsheet");

		String a = "asfsad423423fgs";
		String b = "";
		String alphabet = "";
		String number = "";

		// System.out.println(a);
		// for(int i=a.length()-1; i>=0; i--){
		// 	b = b + a.charAt(i);
		// }

		// System.out.println(b);

		System.out.println(a);
		for(int i=0; i<a.length(); i++){
			if (a.charAt(i) == '0' | a.charAt(i) == '1' | a.charAt(i) == '2' | a.charAt(i) == '3' |
			a.charAt(i) == '4' | a.charAt(i) == '5' | a.charAt(i) == '6' | a.charAt(i) == '7' |
			a.charAt(i) == '8' | a.charAt(i) == '9' ) {
				number = number + a.charAt(i);
			}else{
				alphabet = alphabet + a.charAt(i);
			}
		}

		System.out.println(number);
		System.out.println(alphabet);
	}
}