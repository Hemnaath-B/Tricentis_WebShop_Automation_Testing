Feature: User Registration
  As a new user
  I want to register an account
  So that I can access the webshop

  Scenario: Successful registration
    Given I am on the registration page
    When I enter valid details:
      | Field        | Value            |
      | First Name   | maathul          |
      | Last Name    | manas            |
      | Email        | manas21@haxa.com |
      | Password     | manas@21         |
      | Confirm Pass | manas@21         |
    And I click on the Register button
    Then I should see a success message "Your registration completed"
    
    
    Scenario: Registration with Existing User Account
    Given I am on the registration page
    When I enter valid details:
      | Field        | Value            |
      | First Name   | maathul          |
      | Last Name    | manas            |
      | Email        | manas15@haxa.com |
      | Password     | manas@15         |
      | Confirm Pass | manas@15         |
    And I click on the Register button
    Then I should see an Existing Mail error message "The specified email already exists"


  Scenario: Registration with invalid email
    Given I am on the registration page
    When I enter "invalid-email" in the Email field
    And I click on the Register button
    Then I should see an error message "Wrong email"

