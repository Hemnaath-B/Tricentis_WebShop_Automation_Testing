
package com.loginsteps;

import org.testng.Assert;

import com.hooks.Hooks;
import com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
	private LoginPage loginPage = new LoginPage(Hooks.getDriver());

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		loginPage.navigateToLoginPage();
	}

	@When("I enter valid email {string} and password {string}")
	public void i_enter_valid_email_and_password(String email, String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
	}

	@When("I enter invalid email {string} and password {string}")
	public void i_enter_invalid_email_and_password(String email, String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
	}

	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertTrue(loginPage.isUserLoggedIn());
	}

	@Then("I should see the message {string}")
	public void i_should_see_the_message(String message) {
		Assert.assertEquals(message, loginPage.getSuccessMessage());
	}

	@Then("I should see an error message {string}")
	public void i_should_see_an_error_message(String errorMessage) {
	    String actualMessage = loginPage.getErrorMessage().trim(); // Remove leading/trailing spaces
	    String expectedMessage = errorMessage.trim(); // Remove leading/trailing spaces
	    
	    Assert.assertEquals(actualMessage.replaceAll("\\s+", " "), expectedMessage.replaceAll("\\s+", " "));
	}

}
