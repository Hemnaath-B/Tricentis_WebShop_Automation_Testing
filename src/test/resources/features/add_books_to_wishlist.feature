### Feature: Add Books to Wishlist
Scenario: Add a book to the wishlist
  Given I am viewing a book on the Books category page
  And the book has an "Add to Wishlist" button
  When I click the "Add to Wishlist" button
  Then the book should be added to my wishlist
  And I should be able to view and manage my wishlist from my account