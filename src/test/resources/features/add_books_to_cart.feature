### Feature: Add Books to Cart
Scenario: Add a book to the shopping cart
  Given I am viewing a book on the Books category page
  And the book has an "Add to Cart" button
  When I click the "Add to Cart" button
  Then the book should be added to my shopping cart
  And I should be able to view the added books in my cart and proceed to checkout