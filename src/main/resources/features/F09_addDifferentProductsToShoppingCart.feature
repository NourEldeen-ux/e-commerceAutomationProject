@smoke
Feature: SC9- Logged user could add different products to Shopping cart

  Background:
    And user navigate to books pages

  Scenario: Logged user could add different products to Shopping cart
    And user add items to shopping cart
    And user navigate to shopping cart
    Then added items should appear at shopping cart