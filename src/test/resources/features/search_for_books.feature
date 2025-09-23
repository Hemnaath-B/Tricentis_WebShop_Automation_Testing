### Feature: Search for Books
Scenario: Search for books by title, author, or keyword
  Given I am on the Books category page
  And the search bar is accessible
  When I enter a title, author, or keyword into the search bar
  Then relevant search results should be displayed based on my input