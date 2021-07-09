@petvisit
Feature: Add pet , visit and view Owner/pet Details
  As a user, I want to add a new pet for an existing owner.
  As a user, I want to add a visit to the veterinarian for my pet.
  As a user, I want to view my pets & visits details.
  
  Background:
   Given I open the application
    Then user checks for the welcome and logo
    When I click on Find Owners menu
    And I click on Add owner to fill the owner details
    Then I Verify the Owner details

  Scenario: Add a new pet for existing customer
    When I add a new pet for the owner
    Then I enter the pet details
    Then I verify the pet details

  Scenario: Add a visit to veterinarian for my pet and view the details
    When I add a new pet for the owner
    And I enter the pet details
    Then I verify the pet details
    And I enter the visit details
    Then I verify the visit details information

@petvisitcheck
  Scenario: View my pets and visit details
    When I add a new pet for the owner
    And I enter the pet details
    Then I verify the pet details
    And I enter the visit details
    And I click on Find Owners menu
    Then user searches with the lastname
      | lastname           |
      | test lastname |
    And I click on owner with pets
    Then I verify the visit and pets
