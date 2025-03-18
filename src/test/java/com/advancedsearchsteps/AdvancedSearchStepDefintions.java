package com.advancedsearchsteps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import com.hooks.Hooks;
import com.pages.*;
import org.testng.Assert;

public class AdvancedSearchStepDefintions {
    WebDriver driver = Hooks.getDriver();
    AdvancedSearchPage as = new AdvancedSearchPage(driver);

    @Given("User should be on homepage")
    public void user_should_be_on_homepage() {
        driver.get("http://demowebshop.tricentis.com");
    }

    @When("User enters {string} on search bar")
    public void user_enters_on_search_bar(String product) {
        as.enterSearchTerm(product);
    }

    @When("Clicks on the search button")
    public void clicks_on_the_search_button() {
        as.clickSearchButton();
    }
    @Then("User should see the related products")
    public void user_should_see_the_related_products() {
        Assert.assertTrue(as.isProductGridDisplayed(), "Related products are not displayed");
    }

    @When("Enables advanced search")
    public void enables_advanced_search() {
        as.enableAdvancedSearch();
    }

    @When("Filters category to {string}")
    public void filters_category_to(String category) {
        as.selectCategory(category);
    }

    @When("Ticks the Automatically search sub categories checkbox")
    public void ticks_the_automatically_search_sub_categories_checkbox() {
        as.tickSearchSubCategories();
    }

    @When("Sets price range from {string} to {string}")
    public void sets_price_range_from_to(String from, String to) {
        as.setPriceRange(from, to);
    }

    @When("Ticks the Search in product descriptions checkbox")
    public void ticks_the_search_in_product_descriptions_checkbox() {
        as.tickSearchInProductDescription();
    }

    @When("Clicks the advanced search button")
    public void clicks_the_advanced_search_button() {
        as.clickFinalSearchButton();
    }

    @Then("User should see products matching advanced search criteria")
    public void user_should_see_products_matching_advanced_search_criteria() {
        Assert.assertTrue(as.isProductGridDisplayed());
    }
}