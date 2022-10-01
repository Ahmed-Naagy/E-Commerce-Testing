@MyRegression

Feature: Logged User could search for any product

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

    # Test Scenario 7
  Scenario: logged user should be able to search for any product.

      # Search Steps:
    And user uses the search text field and enters lenovo.
    Then user clicks on the search button.
    And user redirected to a search webpage with the text entered.