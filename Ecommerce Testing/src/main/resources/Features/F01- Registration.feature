@MyRegression

Feature: User could register with valid data

  Background: user opens chrome browser.
    And user navigates to registration page.

  # Test Scenario 1
  Scenario: user registers with valid data.
    When user press on male checkbox.
    And user enters valid first name.
    And user enters valid last name.
    And user select valid date of birth.
    And user enters valid email address.
    And user enters valid password.
    And user reenter valid password.
    And user clicks on register button.
      # Expected Result
    Then user could register successfully.
    And user returned to register result webpage.

  # Test Scenario 2
  Scenario: user registers with invalid password.
    When user press on male checkbox.
    And user enters valid first name.
    And user enters valid last name.
    And user select valid date of birth.
    And user enters valid email address.
    And user enters invalid password.
    And user reenter invalid password.
    And user clicks on register button.
    # Expected Result
    Then user could not register successfully.

