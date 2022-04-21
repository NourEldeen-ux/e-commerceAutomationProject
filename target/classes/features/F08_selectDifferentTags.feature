@smoke
Feature: SC8- Logged user could select different tags

  Scenario: Logged user could select awesome tag
    And user open search page
    And user choose awesome tag
    Then awesome products page should appear to the user