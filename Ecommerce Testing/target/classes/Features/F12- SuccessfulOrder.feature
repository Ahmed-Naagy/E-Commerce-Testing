@MyRegression

Feature: Create successful Order

  Background: user opens chrome browser.
  # Please add Login steps here if you want to proceed manually with this test scenario.

    # Test Scenario 16
  Scenario: Logged user could make a successful order.

    # Selecting Category Steps:
    And user press on Computers from homepage.
    And user press on Desktops option.

    # Shopping Cart Steps (Computers > Desktops):
    # 2nd Item Choice Steps:
    And user press add to cart on 2nd product choice twice.
    And product has been added to cart message displayed.

    # 3rd Item Choice Steps:
    And user press add to cart on the 3rd product choice.
    And product has been added to cart message displayed.

    # User press on webpage header "Shopping Cart" Button Steps:
    And user press on shopping cart in header.
    And user press on agree with the terms of service checkbox.
    And user press on checkout button.

    # User redirected to checkout page.
    Then user is redirected to checkout webpage.
    And user selects Country as Egypt.
    And user enters Cairo as City.
    And user enters his or her address.
    And user enters zip or postal code.
    And user enters his or her phone number.
    And user press on shipping address continue button.

    # Shipping Method Step.
    And user press on shipping method continue button.

    # Payment Method Step.
    And user press on payment method continue button.

    # Payment Information Step.
    And user press on payment information continue button.

    # Confirming order Step.
    And user press on confirm button to confirm the order.

    # User redirected to checkout complete webpage.
    Then user is redirected to checkout completed webpage.
    And order proceeded successfully message appears.

