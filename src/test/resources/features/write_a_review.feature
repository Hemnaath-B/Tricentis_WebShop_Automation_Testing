### Feature: Write a Review
Scenario: Write a review for a purchased book
  Given I am on a book's detail page
  And a "Write a Review" button is visible
  When I click the "Write a Review" button
  And I enter my review in the provided form
  And I submit the review
  Then my review should be displayed on the book's detail page