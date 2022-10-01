@MyRegression

Feature: Logged user could filter with color

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

 # Test Scenario 11
  Scenario: logged user could filter with red colour in Shoes Subcategory.

    # Selecting Category Steps:
    And user press on Apparel from homepage.
    And user press on Shoes subcategory.
    And user press on red checkbox.
    Then user gets Shoes options with red colour.
