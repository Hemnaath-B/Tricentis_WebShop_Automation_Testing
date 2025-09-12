### Feature: View Book Details
Scenario: View detailed information about a book
  Given I am on the Books category page
  When I click on a book title or image
  Then I should be taken to the book's detail page
  And the detail page should display the book's description, author information, price, and reviews
  And I should see related books or recommendations on the detail page