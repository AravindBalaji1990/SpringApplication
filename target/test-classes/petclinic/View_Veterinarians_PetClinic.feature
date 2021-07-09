@veterinarians
Feature: View veterinarians details
  As a user, I want to view the list of veterinarians.

  Scenario: View the list of veterinarians
    Given I open the application
    Then user checks for the welcome and logo
    And I click on the veterinarians
    Then I Verify the list of veterinarians
