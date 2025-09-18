### Feature: View Book Details
Scenario: View detailed information about a book
  Given I am on the Books category page
  And I click on a book's title or image
  Then I should be taken to the book's detail page
  And the detail page should include the book's title, author, description, price, and reviews
  And I should see additional information such as publication date and ISBN