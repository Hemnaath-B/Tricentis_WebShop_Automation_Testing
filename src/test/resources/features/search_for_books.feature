### Feature: Search for Books
Scenario: Search for books by title, author, or keyword
  Given I am on the Books category page
  And the search bar is prominently displayed
  When I enter a title, author, or keyword into the search bar
  And I submit the search
  Then I should see relevant search results based on my input