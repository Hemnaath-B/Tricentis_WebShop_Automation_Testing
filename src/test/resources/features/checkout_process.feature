### Feature: Checkout Process
Scenario: Complete the checkout process
  Given I have books in my shopping cart
  And I am on the shopping cart page
  When I proceed to checkout
  And I enter valid shipping and payment information
  Then I should receive an order confirmation upon successful completion of the checkout