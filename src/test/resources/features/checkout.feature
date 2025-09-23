### Feature: Checkout
Scenario: Proceed to checkout with books in the cart
  Given I have books in my shopping cart
  And a "Checkout" button is visible in the shopping cart
  When I click the "Checkout" button
  Then I should be taken to the checkout page
  And I should be able to enter my payment and shipping information to complete the purchase