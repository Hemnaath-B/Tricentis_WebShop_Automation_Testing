Feature: Shopping Cart Functionality

  Scenario: Add an item to the shopping cart and proceed to checkout
    Given User is on the homepage
    When User searches for "computer"
    And User selects the computer product
    And User clicks add to cart button
    And User updates the quantity to "3"
    And User clicks the final add to cart button
    Then User should see a success message for adding product
    When User navigates to the shopping cart
    And User accepts the terms and proceeds to checkout
    Then User should be on the checkout page