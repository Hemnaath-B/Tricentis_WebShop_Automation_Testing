### Feature: Review Book
Scenario: Leave a review for a purchased book
  Given I am on a book's detail page
  And a "Write a Review" button is available
  When I enter my review text and rating
  And I submit the review
  Then my review should be displayed on the book's detail page after submission