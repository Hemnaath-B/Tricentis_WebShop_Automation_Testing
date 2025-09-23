### Feature: Add Book to Wishlist
Scenario: Add a book to the wishlist
  Given I am on a book's detail page
  And an "Add to Wishlist" button is available
  When I click the "Add to Wishlist" button
  Then the book should be added to my wishlist
  And a confirmation message should be displayed