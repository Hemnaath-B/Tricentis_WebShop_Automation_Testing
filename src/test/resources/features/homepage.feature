Feature: Validate Functionality of Demo Web Shop

  Scenario: Check if the homepage is functional
    Given I Landed on the homepage
    Then I should see the page title as "Demo Web Shop"
    And I should verify the presence of the website logo
    And I should confirm that the search bar is functional

  Scenario: Execute a successful product search
    Given I Landed on the homepage
    When I search for "Smartphone" using the search bar
    And I trigger the search button
    Then I should get results that are relevant to "Smartphone"
