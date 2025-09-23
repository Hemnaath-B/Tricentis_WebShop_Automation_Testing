### Feature: Filter Books by Category
Scenario: Filter books by selecting a category
  Given I am on the Books category page
  And filter options are visible
  When I select one or more categories from the filter options
  Then the book list should update to show only books from the selected categories