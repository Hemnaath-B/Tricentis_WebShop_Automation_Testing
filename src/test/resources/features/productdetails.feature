Feature: Validate product details and add to cart

  Scenario: Validate 14.1 inch Laptop details
    Given User should be on homepage
    And Click on the product
    Then Validate product details for 14.1 inch Laptop

  Scenario: Add 14.1 inch Laptop to cart
    Given User should be on homepage
    When User adds 14.1 inch Laptop to the cart
    Then The product should be added to the cart successfully
