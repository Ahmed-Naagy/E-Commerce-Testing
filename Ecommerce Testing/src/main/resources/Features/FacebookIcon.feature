@MyRegression

Feature: user should be able to open facebook Icon for page.


  Background: user opens browser.
    And navigates to Facebook Icon.
    Then user will be Login to facebook

    #Test Scenario 1
  Scenario: user login with valid data (valid email & password).
    When user enters valid login email.
    And user enters valid login password.
    And user press on login button.
    Then user could login successfully.
    And returned to home page of the website.

    #Test Scenario 2
  Scenario: user login with invalid data (invalid email & password).
    When user enters invalid login email.
    And user enters invalid login password.
    And user press on login button.
    Then user could not login successfully.
