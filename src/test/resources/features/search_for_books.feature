### Feature: Search for Books
Scenario: Search for books using keywords
  Given I am on the Books category page
  And the search bar is visible
  When I enter keywords into the search bar
  And I click the search button
  Then I should see a list of books matching the entered keywords