@login
Feature: Login form feature

  Scenario: As a user, when I enter the valid email and password, I should see the success message
    Given I am on the login page
    When I enter the email address "test@test.com"
    And I enter the password "12345678"
    And I click Login Button
    Then I should see the success message