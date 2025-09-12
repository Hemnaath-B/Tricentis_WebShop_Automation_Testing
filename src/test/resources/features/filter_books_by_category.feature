### Feature: Filter Books by Category
Scenario: Filter books by selecting one or multiple categories
  Given I am on the Books category page
  And the filter options are visible
  When I select one or multiple categories from the filter options
  Then the book list should update to show only books that match the selected categories