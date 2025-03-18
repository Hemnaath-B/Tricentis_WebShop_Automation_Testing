package com.productdetailssteps;
import com.pages.ProductDetailsPage;
import com.hooks.Hooks;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailsStepDefinitions {
    WebDriver driver;
    ProductDetailsPage productPage;

    public ProductDetailsStepDefinitions() {
        this.driver = Hooks.getDriver();
        productPage = new ProductDetailsPage(driver);
    }

    @Given("User should be on homepage")
    public void user_should_be_on_homepage() {
       driver.get("https://demowebshop.tricentis.com/");
    }

    @Given("Click on the product")
    public void click_on_the_product() throws InterruptedException {
        productPage.clickOnProduct();
        
    }

    @Then("Validate product details for {double} inch Laptop")
    public void validate_product_details_for_inch_laptop(Double double1) {
       productPage.validateProductDetails();
    }

    @When("User adds {double} inch Laptop to the cart")
    public void user_adds_inch_laptop_to_the_cart(Double double1) throws InterruptedException {
       productPage.addToCart();
      
    }

    @Then("The product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {
    	 productPage.displayMsg();
    }


}

