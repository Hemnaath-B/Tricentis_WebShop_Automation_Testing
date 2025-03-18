package com.forgotpasswordsteps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.hooks.Hooks;
import com.pages.ForgotPasswordPage;
import io.cucumber.java.en.*;

public class ForgotPasswordStepDefinitions {
    private WebDriver driver = Hooks.getDriver();
    private ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
    
    @Given("I am on the login page for FP")
    public void i_am_on_the_login_page_for_FP() {
      
        driver.get("http://demowebshop.tricentis.com/login");
    }

    @When("I navigate to the Forgot Password page")
    public void i_navigate_to_forgot_password_page() {
        forgotPasswordPage.navigateToForgotPassword();
    }

    @When("I enter a registered email {string}")
    public void i_enter_a_registered_email(String email) {
        forgotPasswordPage.enterEmail(email);
    }

    @When("I enter an unregistered email {string}")
    public void i_enter_an_unregistered_email(String email) {
        forgotPasswordPage.enterEmail(email);
    }

    @When("I leave the email field empty")
    public void i_leave_the_email_field_empty() {
        forgotPasswordPage.enterEmail("");
    }

    @When("I click on the Recover button")
    public void i_click_on_the_recover_button() {
        forgotPasswordPage.clickRecoverButton();
    }

    @Then("I should see a confirmation message {string}")
    public void i_should_see_a_confirmation_message(String expectedMessage) {
        Assert.assertEquals(forgotPasswordPage.getConfirmationMessage(), expectedMessage);
    }

    @Then("I should see an error message FP {string}")
    public void i_should_see_an_error_message_FP(String expectedMessage) {
        Assert.assertEquals(forgotPasswordPage.getErrorMessage(), expectedMessage);
    }

    @Then("I should see a validation message {string}")
    public void i_should_see_a_validation_message(String expectedMessage) {
        Assert.assertEquals(forgotPasswordPage.getValidationMessage(), expectedMessage);
    }
}
