### Feature: Search for Books
Scenario: Search for books using keywords
  Given I am on the Books category page
  And the search bar is visible and accessible
  When I enter keywords related to the book title, author, or genre in the search bar
  Then I should see search results displaying relevant books based on the entered keywords