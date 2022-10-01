@MyRegression

Feature: Logged user could select different tags.

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

 # Test Scenario 12
  Scenario: logged user could select different tags.

    # Selecting Category Steps:
    And user press on Computers from homepage.

    #Tags Steps:
    And user press on awesome tag option.
    Then webpage redirect to products tagged with awesome.
    And text field containing products tagged with awesome shown.
    Then user press on cool tag option.
    And webpage redirect to products tagged with cool.
    And text field containing products tagged with cool shown.