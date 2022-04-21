@smoke
Feature: Logged User could switch between currencies

  Scenario: SC5- Logged User could switch between currencies US-Euro
    And user change currency from usd to euro
    Then all products shown are in euro