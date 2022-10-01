@MyRegression

Feature: Logged user could add different products to Wishlist

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

    # Test Scenario 14
  Scenario: user adds two desktop products to his/her wishlist.

    # Selecting Category Steps:
    And user press on Computers from homepage.
    And user press on Desktops option.

    # Adding products to wishlist Steps:
    And user clicks on add to wishlist button for 2nd product.
    And product has been added to wishlist message displayed.
    And user clicks on add to wishlist button for 3rd product.
    And product has been added to wishlist message displayed.
    Then user press on wishlist in webpage header.
    And webpage redirects to wishlist.
    And 2nd product is displayed.
    And 3rd product is displayed.

    # Removing item from wishlist Steps:
    Then user removes 2nd product from wishlist.
    And 2nd product is removed from wishlist.