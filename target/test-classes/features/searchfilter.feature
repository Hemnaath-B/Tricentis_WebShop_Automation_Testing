Feature: Search and Filter Products

Background: 
  Given User should be on homepage
  When User enters "Computer" on search bar
  And Clicks on the search button
  Then User should see the related products

Scenario: Filter results by price
  When User filters the products from low to high
  Then page should see sorted products from low to high

Scenario: Filter results by alphabetical order
  When User filters the products A to Z
  Then page should see sorted products from A to Z

