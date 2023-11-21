@form
Feature: Form feature
  Scenario: As I user, I can interact with different components
    Given I am on the form page
    When I enter text "I love appium"
    Then I should see "I love appium" being displayed
    When I turn on the switch
    Then I should see the turn off message "Click to turn the switch OFF"
    When I click dropdown list and select "Appium is awesome"
    Then I should see "Appium is awesome" being selected
    When I click activate button
    Then I should be able to see a pop up window and close it