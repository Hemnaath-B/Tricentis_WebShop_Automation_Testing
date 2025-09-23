### Feature: Checkout
Scenario: Proceed to checkout with books in the cart
  Given I have books in my shopping cart
  And a "Checkout" button is available in the shopping cart
  When I click the "Checkout" button
  Then I should be taken to the checkout page
  And I should be able to enter my shipping and payment information to complete the purchase