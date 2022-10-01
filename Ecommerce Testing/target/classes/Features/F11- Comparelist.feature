@MyRegression

Feature: Logged user could add different products to compare list

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

    # Test Scenario 15
    Scenario: Logged user could add 2nd and 3rd computer desktops to his/her compare list.

    # Selecting Category Steps:
      And user press on Computers from homepage.
      And user press on Desktops option.

    # Adding 2nd product to Compare list Steps:
      And user press on 2nd product add to compare list button.
      Then product has been added to compare list message displayed.

    # Adding 3rd product to compare list Steps:
      And user press on 3rd product add to compare list button.
      Then product has been added to compare list message displayed.

    # Product comparison webpage:
      And user press on product comparison in bar notification message.
      Then user is redirected to compare products webpage.
      And 2nd product is displayed in compare list.
      And 3rd product is displayed in compare list.