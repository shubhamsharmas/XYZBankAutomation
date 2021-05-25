package Stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_02_Deposit_XYZ extends TC_01_Login_XYZ {

	public static String amount ;
	
	@Given("i click on Deposit Screen")
	public void i_click_on_Deposit_Screen() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector(val.depositScreenPage())).click();
		throw new cucumber.api.PendingException();
	}

	@Given("I enter the below Amount to be Deposited")
	public void i_enter_the_Amount_to_be_Deposited(List<Map<String, String>> table) {
	    // Write code here that turns the phrase above into concrete actions
		 amount= table.get(0).get("Amount");
		 driver.findElement(By.cssSelector(val.amounttoBeDeposited())).sendKeys(amount);
	    throw new cucumber.api.PendingException();
	}

	@When("I click on the Deposit  button")
	public void i_click_on_the_Deposit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Amount should be desposited successfully")
	public void amount_should_be_desposited_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
