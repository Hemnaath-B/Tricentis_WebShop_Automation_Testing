### Feature: Leave a Book Review
Scenario: Leave a review for a purchased book
  Given I am on the detail page of a book I purchased
  And the review section is accessible
  When I rate the book and write a review
  And I submit the review
  Then my review should be displayed on the book's detail page