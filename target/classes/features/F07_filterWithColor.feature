@smoke
Feature: Logged user could filter with color
  #SC7- Logged user could filter with color

  Scenario: Logged user could filter with red color
    And user hover on apparel category
    And user click on shoes category
    And user change color to red
    Then shoes with red color only should appear to the user