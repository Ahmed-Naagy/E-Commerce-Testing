@MyRegression

Feature: user should be able to login to the website.


  Background: user opens browser.
    And navigates to login page.

  # Test Scenario 1
  Scenario: user login with valid data (valid email & password).
    When user enters valid login email.
    And user enters valid login password.
    And user press on login button.
    Then user could login successfully.
    And returned to home page of the website.


  # Test Scenario 2
  Scenario: user login with invalid data (invalid email & password).
    When user enters invalid login email.
    And user enters invalid login password.
    And user press on login button.
    Then user could not login successfully.
