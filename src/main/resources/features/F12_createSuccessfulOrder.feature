@smoke
Feature: SC12- Create successful Order

  Background:
    And user navigate to books pages
    And user add items to shopping cart
    And user navigate to shopping cart
    And user complete order

  Scenario: Create successful Order


    Then order placed successfully