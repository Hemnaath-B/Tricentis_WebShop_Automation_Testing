### Feature: Write a Review for a Book
Scenario: Write and submit a review for a book
  Given I am viewing a book's detail page
  And there is an option to write a review
  When I enter a rating and comments in the review form
  And I submit the review
  Then my review should be visible to other customers on the book's page