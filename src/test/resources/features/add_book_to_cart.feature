### Feature: Add Book to Cart
Scenario: Add a book to the shopping cart
  Given I am on a book's detail page
  And an "Add to Cart" button is visible
  When I click the "Add to Cart" button
  Then the book should be added to my shopping cart
  And I should be able to view the added book in my shopping cart