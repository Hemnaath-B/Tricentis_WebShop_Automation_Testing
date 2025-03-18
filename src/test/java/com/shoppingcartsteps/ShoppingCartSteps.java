package com.shoppingcartsteps;

import com.pages.ShoppingCartPage;
import com.hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShoppingCartSteps {
	WebDriver driver = Hooks.getDriver();
	ShoppingCartPage cartPage = new ShoppingCartPage(driver);

	@Given("User is on the homepage")
	public void user_is_on_homepage() {
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("User searches for {string}")
	public void user_searches_for(String product) {
		cartPage.searchForProduct(product);
	}

	@And("User selects the computer product")
	public void user_selects_computer_product() {
		cartPage.selectComputer();
	}

	@And("User clicks add to cart button")
	public void user_clicks_add_to_cart_button() {
		cartPage.clickAddToCart();
	}

	@And("User updates the quantity to {string}")
	public void user_updates_quantity(String quantity) {
		cartPage.updateQuantity(quantity);
	}

	@And("User clicks the final add to cart button")
	public void user_clicks_final_add_to_cart_button() {
		cartPage.finalAddToCart();
	}

	@Then("User should see a success message for adding product")
	public void user_should_see_success_message() {
		Assert.assertTrue(cartPage.isProductAdded());
	}

	@When("User navigates to the shopping cart")
	public void user_navigates_to_shopping_cart() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement notification = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("bar-notification")));

			WebElement closeButton = notification.findElement(By.className("close"));
			closeButton.click();

			wait.until(ExpectedConditions.invisibilityOf(notification));

			WebElement shoppingCart = driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
			shoppingCart.click();
		} catch (Exception e) {
			System.out.println("Error navigating to shopping cart: " + e.getMessage());
		}
	}

	@And("User accepts the terms and proceeds to checkout")
	public void user_accepts_terms_and_proceeds_to_checkout() {
		cartPage.acceptTermsAndCheckout();
	}

	@Then("User should be on the checkout page")
	public void user_should_be_on_checkout_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
	}
}