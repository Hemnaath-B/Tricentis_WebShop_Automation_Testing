Feature: Order Placement on Demo Web Shop

  Scenario: User places an order successfully
    Given User launches website in a browser
    When User clicks on the login link
    And User enters valid email "manas@haxa.com" and password "manas@11"
    And User navigates to the Computer menu and clicks on Desktop
    And User selects the second desktop
    And User selects RAM and HDD options
    And User clicks on "Add to Cart" button
    And User moves to the shopping cart menu
    And User clicks on "Go to Cart" button
    And User selects "I agree with terms" checkbox
    And User clicks on "Checkout" button
    And User fills in the required billing details
    And User continue with shipping address
    And User confirms shipping method
    And User selects "Cash on Delivery" as the payment method
    And User confirms with payment information
    And User clicks on "Confirm" button
    Then User should see success message
    And User clicks on the logout button
