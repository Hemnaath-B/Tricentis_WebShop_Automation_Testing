### Feature: Filter Books
Scenario: Filter books by genre, price, and rating
  Given I am on the Books category page
  And filters for genre, price, and rating are available
  When I select multiple filters simultaneously
  Then the book list should update to show only the books that match the selected filters