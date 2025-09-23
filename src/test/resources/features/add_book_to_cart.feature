### Feature: Add Book to Cart
Scenario: Add a book to the shopping cart
  Given I am on a book's detail page
  And an "Add to Cart" button is available
  When I click the "Add to Cart" button
  Then the book should be added to my shopping cart
  And a confirmation message should be displayed