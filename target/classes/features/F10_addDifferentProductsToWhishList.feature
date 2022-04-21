@smoke
Feature: SC9- Logged user could add different products to wishlist

  Scenario: Logged user could add different products to wishlist
    And user add items to wishlist
    And user navigate to wishlist
    Then added items should appear at wishlist