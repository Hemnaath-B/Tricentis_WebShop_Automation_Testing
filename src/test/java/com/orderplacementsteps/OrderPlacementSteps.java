package com.orderplacementsteps;
import com.pages.OrderPlacementPage;
import com.hooks.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderPlacementSteps {
	WebDriver driver = Hooks.getDriver();
	OrderPlacementPage op = new OrderPlacementPage(driver);

	@Given("User launches website in a browser")
	public void user_launches_website() {
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("User clicks on the login link")
	public void user_clicks_login_link() {
		op.clickLoginLink();
	}

	@When("User enters valid email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) {
		op.enterLoginDetails(email, password);
	}

	@When("User navigates to the Computer menu and clicks on Desktop")
	public void user_navigates_to_desktop() {
		op.navigateToDesktops();
	}

	@When("User selects the second desktop")
	public void user_selects_second_desktop() {
		op.selectSecondDesktop();
	}

	@When("User selects RAM and HDD options")
	public void user_selects_ram_hdd_options() {
		op.selectRAMAndHDD();
	}

	@When("User clicks on {string} button")
	public void user_clicks_button(String button) {
		op.clickButton(button);
	}

	@When("User moves to the shopping cart menu")
	public void user_moves_to_cart_menu() {
		op.openShoppingCart();
	}

	@When("User selects {string} checkbox")
	public void user_selects_checkbox(String checkbox) {
		op.selectCheckbox(checkbox);
	}

	@When("User fills in the required billing details")
	public void user_fills_billing_details() throws InterruptedException {
		op.fillBillingDetails("", "", "", "United States", "New York City", "123 Main Street", "10001", "1234567890");
	}

	@When("User continue with shipping address")
	public void user_continue_with_shipping_address() throws InterruptedException {
		op.continueShipping();
	}

	@When("User confirms shipping method")
	public void user_confirms_shipping_method() throws InterruptedException {
		op.confirmShippingMethod();
	}

	@When("User selects {string} as the payment method")
	public void user_selects_payment_method(String method) throws InterruptedException {
		op.selectPaymentMethod(method);
	}

	@When("User confirms with payment information")
	public void user_confirms_payment_information() throws InterruptedException {
		op.confirmPaymentInformation();
	}

	@Then("User should see success message")
	public void user_should_see_message() {
		Assert.assertTrue(op.verifyOrderSuccess());
	}

	@Then("User clicks on the logout button")
	public void user_clicks_logout() {
		op.logout();
	}

}