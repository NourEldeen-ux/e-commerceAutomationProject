@smoke
Feature: F01_Login | users could use login functionality to open their accounts

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with "valid" "noureldeen@test.com" and "123456789"
    And user press on login button
    Then user login to the system successfully
