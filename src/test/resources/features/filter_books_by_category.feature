### Feature: Filter Books by Category
Scenario: Filter books by selecting a single category
  Given I am on the Books category page
  And a filter option for categories is available
  When I select a specific category from the filter options
  Then the book list should update to show only books in the selected category

Scenario: Filter books by selecting multiple categories
  Given I am on the Books category page
  And a filter option for categories is available
  When I select multiple categories from the filter options
  Then the book list should update to show only books in the selected categories