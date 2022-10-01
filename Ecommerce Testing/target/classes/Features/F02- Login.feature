@MyRegression

Feature: user should be able to login to the website.


  Background: user opens browser.
    And navigates to login page.

  # Test Scenario 3
  Scenario: user login with valid data (valid email & password).
    # << Login Steps: (Free to use in other test scenarios manual running) >>
    When user enters valid login email.
    And user enters valid login password.
    And user press on login button.
  # Expected Result
    Then user could login successfully.
    And returned to home page of the website.


  # Test Scenario 4
  Scenario: user login with invalid data (invalid email & password).
    When user enters invalid login email.
    And user enters invalid login password.
    And user press on login button.
  # Expected Result
    Then user could not login successfully.
