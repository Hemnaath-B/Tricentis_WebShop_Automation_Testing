Feature: Forgot Password Functionality

  Scenario: Successfully reset password with a registered email
    Given I am on the login page for FP
    When I navigate to the Forgot Password page
    And I enter a registered email "Manas@Haxa.com"
    And I click on the Recover button
    Then I should see a confirmation message "Email with instructions has been sent to you."

  Scenario: Attempt to reset password with an unregistered email
    Given I am on the login page for FP
    When I navigate to the Forgot Password page
    And I enter an unregistered email "invaliduser@example.com"
    And I click on the Recover button
    Then I should see an error message FP "Email not found."

  Scenario: Attempt to reset password with an empty email field
    Given I am on the login page for FP
    When I navigate to the Forgot Password page
    And I leave the email field empty
    And I click on the Recover button
    Then I should see a validation message "Enter your email"
