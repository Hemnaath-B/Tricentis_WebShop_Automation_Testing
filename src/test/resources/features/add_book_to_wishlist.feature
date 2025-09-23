### Feature: Add Book to Wishlist
Scenario: Add a book to the wishlist
  Given I am on a book's detail page
  And an "Add to Wishlist" button is visible
  When I click the "Add to Wishlist" button
  Then the book should be added to my wishlist
  And I should be able to view the added book in my wishlist