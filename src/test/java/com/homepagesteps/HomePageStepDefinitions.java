package com.homepagesteps;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import com.hooks.Hooks;
import com.pages.HomePage;
import io.cucumber.java.en.*;

public class HomePageStepDefinitions {
    WebDriver driver = Hooks.getDriver();
    HomePage homepage = new HomePage(driver);

    @Given("I Landed on the homepage")
    public void i_landed_on_the_homepage() {
        driver.get("https://demowebshop.tricentis.com");
    }

    @Then("I should see the page title as {string}")
    public void i_should_see_the_homepage_title_as(String expectedTitle) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals( expectedTitle, actualTitle);
    }

    @Then("I should verify the presence of the website logo")
    public void i_should_verify_the_presence_of_the_website_logo() {
        Assert.assertTrue(homepage.isLogoDisplayed(), "Logo is not displayed!");
    }

    @Then("I should confirm that the search bar is functional")
    public void i_should_confirm_that_the_search_bar_is_functional() {
        Assert.assertTrue(homepage.isSearchBarAvailable(), "Search bar is not available!");
    }

    @When("I search for {string} using the search bar")
    public void i_search_for_something_using_the_search_bar(String query) {
        homepage.enterSearchText(query);
    }

    @And("I trigger the search button")
    public void i_trigger_the_search_button() {
        homepage.clickSearchButton();
    }

    @Then("I should get results that are relevant to {string}")
    public void i_should_see_search_results_related_to(String query) {
        Assert.assertTrue(homepage.isSearchResultsDisplayed(query), "Search results not displayed!");
    }

}
