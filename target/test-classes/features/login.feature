Feature: Login and Forgot Password Functionality

  Scenario Outline: Successful Login with Valid Credentials
    Given I am on the login page
    When I enter valid email "<email>" and password "<password>"
    And I click on the Login button
    Then I should be logged in successfully
    And I should see the message "<message>"

    Examples: 
      | email           | password  | message              |
      | manas@haxa.com  | manas@11  | Welcome to our store |

  Scenario Outline: Failed Login with Invalid Credentials
    Given I am on the login page
    When I enter invalid email "<email>" and password "<password>"
    And I click on the Login button
    Then I should see an error message "<error_message>"

    Examples: 
      | email               | password  | error_message                                                                              |
      | wronguser@haxa.com  | wrongpass | Login was unsuccessful. Please correct the errors and try again. No customer account found |
