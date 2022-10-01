@MyRegression

Feature: Logged user could select different Categories

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

 # Test Scenario 10
  Scenario: logged user could select category (Computers) then subcategory (Desktops)

    # Selecting Category Steps:
    And user press on Computers from homepage.
    And user press on Desktops option.
    Then webpage redirects to Desktops subcategory.
    And webpage shows a Desktop computer.

