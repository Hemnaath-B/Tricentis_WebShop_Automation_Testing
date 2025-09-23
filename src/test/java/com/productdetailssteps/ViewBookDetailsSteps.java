package com.productdetailssteps;

import org.openqa.selenium.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ViewBookDetailsSteps {

    WebDriver driver;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        // TODO: implement
        // Example: driver.get("http://example.com");
    }

    @When("the user searches for a book titled {string}")
    public void the_user_searches_for_a_book_titled(String bookTitle) {
        // TODO: implement
        // Example: driver.findElement(By.id("searchBox")).sendKeys(bookTitle);
        // Example: driver.findElement(By.id("searchButton")).click();
    }

    @And("the user selects the book from the search results")
    public void the_user_selects_the_book_from_the_search_results() {
        // TODO: implement
        // Example: driver.findElement(By.xpath("//a[contains(text(), 'Book Title')]")).click();
    }

    @Then("the book details page is displayed")
    public void the_book_details_page_is_displayed() {
        // TODO: implement
        // Example: Assert.assertTrue(driver.findElement(By.id("bookDetails")).isDisplayed());
    }

    @And("the book title is {string}")
    public void the_book_title_is(String expectedTitle) {
        // TODO: implement
        // Example: String actualTitle = driver.findElement(By.id("bookTitle")).getText();
        // Example: Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("the book author is {string}")
    public void the_book_author_is(String expectedAuthor) {
        // TODO: implement
        // Example: String actualAuthor = driver.findElement(By.id("bookAuthor")).getText();
        // Example: Assert.assertEquals(expectedAuthor, actualAuthor);
    }

    @And("the book price is {string}")
    public void the_book_price_is(String expectedPrice) {
        // TODO: implement
        // Example: String actualPrice = driver.findElement(By.id("bookPrice")).getText();
        // Example: Assert.assertEquals(expectedPrice, actualPrice);
    }
}