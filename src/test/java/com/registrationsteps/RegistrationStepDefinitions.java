
package com.registrationsteps;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.hooks.Hooks;
import com.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinitions {
	WebDriver webDriver;
	RegistrationPage rp;

	public RegistrationStepDefinitions() {
		this.webDriver = Hooks.getDriver();
		if (this.webDriver == null) {
			throw new RuntimeException("WebDriver is not initialized! Check Hooks setup.");
		}
		this.rp = new RegistrationPage(webDriver);
	}

	@Given("I am on the registration page")
	public void i_am_on_the_registration_page() {
		webDriver.get("https://demowebshop.tricentis.com/register");
	}

	@When("I enter valid details:")
	public void i_enter_valid_details(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);

		rp.setFirstName(data.get("First Name"));
		rp.setLastName(data.get("Last Name"));
		rp.setEmail(data.get("Email"));
		rp.setPassword(data.get("Password"));
		rp.setConfirmPassword(data.get("Confirm Pass"));
	}

	@When("I click on the Register button")
	public void i_click_on_the_register_button() {
		rp.click();
	}

	@Then("I should see a success message {string}")
	public void i_should_see_a_success_message(String string) {
		rp.getSuccessMsg();
	}

	@Then("I should see an error message {string}")
	public void i_should_see_an_error_message(String string) {
		rp.getWrongEmailMsg();
	}
	@Then("I should see an Existing Mail error message {string}")
	public void i_should_see_an_Existing_mail_Error_message(String string) {
		rp.getExistingErrorMessage();
	}

	@When("I enter {string} in the Email field")
	public void i_enter_in_the_email_field(String string) {
		rp.setEmail(string);
	}

	@When("I enter {string} in the Password field")
	public void i_enter_in_the_password_field(String string) {
		rp.setPassword(string);
	}

	@When("I enter {string} in the Confirm Password field")
	public void i_enter_in_the_confirm_password_field(String string) {
		rp.setConfirmPassword(string);
	}

}
