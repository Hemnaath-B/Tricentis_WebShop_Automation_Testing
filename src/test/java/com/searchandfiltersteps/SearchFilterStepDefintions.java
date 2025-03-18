package com.searchandfiltersteps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;

import com.hooks.Hooks;
import com.pages.SearchAndFilterPage;
import org.testng.Assert;

public class SearchFilterStepDefintions {
	  WebDriver driver = Hooks.getDriver();
	  SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(driver);

    @Given("User should be on homepage")
    public void user_should_be_on_homepage() {
       
        driver.get("http://demowebshop.tricentis.com");
        
    }

    @When("User enters {string} on search bar")
    public void user_enters_on_search_bar(String product) {
        searchAndFilterPage.enterSearchTerm(product);
    }

    @When("Clicks on the search button")
    public void clicks_on_the_search_button() {
        searchAndFilterPage.clickSearchButton();
    }

    @Then("User should see the related products")
    public void user_should_see_the_related_products() {
        Assert.assertTrue(searchAndFilterPage.isProductListDisplayed());
    }

    @When("User filters the products from low to high")
    public void user_filters_the_products_from_low_to_high() {
        searchAndFilterPage.selectSortingOption("Price: Low to High");
    }

    @Then("page should see sorted products from low to high")
    public void page_should_see_sorted_products_from_low_to_high() {
      driver.quit();
    }

    @When("User filters the products A to Z")
    public void user_filters_the_products_A_to_Z() {
        searchAndFilterPage.selectSortingOption("Name: A to Z");
    }

    @Then("page should see sorted products from A to Z")
    public void page_should_see_sorted_products_from_A_to_Z() {
        
        driver.quit();
    }
    @Given("User searched for {string}")
    public void user_searched_for(String productName) {
        user_enters_on_search_bar(productName); 
        clicks_on_the_search_button(); 
    }

}
