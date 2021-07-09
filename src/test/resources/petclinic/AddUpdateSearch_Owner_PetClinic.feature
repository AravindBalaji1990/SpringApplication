@owner
Feature: Add, Update, saerch Owner Details
  As a user, I want to add a new owner.
  As a user, I want to update an existing owner.
  As a user, I want to search for an existing owner by his/her lastname.

  Background: 
    Given I open the application
    Then user checks for the welcome and logo

  Scenario: Add a new owner
    When I click on Find Owners menu
    And I click on Add owner to fill the owner details
    Then I Verify the Owner details

  @UpdateExisting
  Scenario: Update Existing Owner details
    When I click on Find Owners menu
    And I click on Add owner to fill the owner details
    Then I Verify the Owner details
    And I edit the Owner details
    Then I Verify the Owner details

  Scenario: Search existing customer with lastname
    Given I open the application
    Then user checks for the welcome and logo
    And I click on Find Owners menu
    Then user searches with the lastname
      | lastname           |
      | test aravind lname |
