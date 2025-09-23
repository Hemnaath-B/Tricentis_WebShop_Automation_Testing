package com.searchandfiltersteps;

import org.openqa.selenium.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ProductSearchSteps {

    WebDriver driver;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        // TODO: implement
        driver.get("http://example.com"); // Replace with actual homepage URL
    }

    @When("I search for a product with the name {string}")
    public void i_search_for_a_product_with_the_name(String productName) {
        // TODO: implement
        WebElement searchBox = driver.findElement(By.id("searchBox")); // Replace with actual search box locator
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
    }

    @Then("I should see search results containing {string}")
    public void i_should_see_search_results_containing(String productName) {
        // TODO: implement
        WebElement searchResults = driver.findElement(By.id("searchResults")); // Replace with actual search results locator
        String resultsText = searchResults.getText();
        Assert.assertTrue("Search results do not contain the expected product name.", resultsText.contains(productName));
    }
}