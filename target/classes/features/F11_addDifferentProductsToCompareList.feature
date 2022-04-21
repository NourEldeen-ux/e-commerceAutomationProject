@smoke
Feature: SC9- Logged user could add different products to compare list

  Scenario: Logged user could add different products to compare list

    And user add items to compare list
    And user navigate to compare list
    Then added items should appear at compare list