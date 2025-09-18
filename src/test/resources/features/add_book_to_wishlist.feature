### Feature: Add Book to Wishlist
Scenario: Add a book to the wishlist
  Given I am viewing a book on the Books category page or its detail page
  And the book has an "Add to Wishlist" button
  When I click the "Add to Wishlist" button
  Then the book should be added to my wishlist
  And a confirmation message should be displayed