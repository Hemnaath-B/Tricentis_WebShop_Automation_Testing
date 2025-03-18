Feature: Advanced Search Filter Products

  Scenario: Perform advanced search
    Given User should be on homepage
    When User enters "Computer" on search bar
    And Clicks on the search button
    Then User should see the related products
    When Enables advanced search
    And Filters category to "Computers >> Desktops"
    And Ticks the Automatically search sub categories checkbox
    And Sets price range from "500" to "2000"
    And Ticks the Search in product descriptions checkbox
    And Clicks the advanced search button
    Then User should see products matching advanced search criteria