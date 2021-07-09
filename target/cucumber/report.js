$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/petclinic/AddUpdateSearch_Owner_PetClinic.feature");
formatter.feature({
  "name": "Add, Update, saerch Owner Details",
  "description": "  As a user, I want to add a new owner.\n  As a user, I want to update an existing owner.\n  As a user, I want to search for an existing owner by his/her lastname.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@owner"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new owner",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@owner"
    }
  ]
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add owner to fill the owner details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_fill_the_owner_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the Owner details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_add_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update Existing Owner details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@owner"
    },
    {
      "name": "@UpdateExisting"
    }
  ]
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add owner to fill the owner details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_fill_the_owner_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the Owner details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_add_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I edit the Owner details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_edit_the_Owner_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the Owner details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_add_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search existing customer with lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@owner"
    }
  ]
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches with the lastname",
  "rows": [
    {
      "cells": [
        "lastname"
      ]
    },
    {
      "cells": [
        "test aravind lname"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_searches_with_the_lastname(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/petclinic/AddVisitView_PetVisit_PetClinic.feature");
formatter.feature({
  "name": "Add pet , visit and view Owner/pet Details",
  "description": "  As a user, I want to add a new pet for an existing owner.\n  As a user, I want to add a visit to the veterinarian for my pet.\n  As a user, I want to view my pets \u0026 visits details.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@petvisit"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add owner to fill the owner details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_fill_the_owner_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the Owner details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_add_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new pet for existing customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petvisit"
    }
  ]
});
formatter.step({
  "name": "I add a new pet for the owner",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicPetVisit.i_add_a_new_pet_for_the_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the pet details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicPetVisit.i_enter_the_pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the pet details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicPetVisit.i_verify_the_pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add owner to fill the owner details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_fill_the_owner_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the Owner details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_add_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a visit to veterinarian for my pet and view the details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petvisit"
    }
  ]
});
formatter.step({
  "name": "I add a new pet for the owner",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicPetVisit.i_add_a_new_pet_for_the_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the pet details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicPetVisit.i_enter_the_pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the pet details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicPetVisit.i_verify_the_pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the visit details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicPetVisit.i_enter_the_visit_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the visit details information",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicPetVisit.i_verify_the_visit_details_information()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add owner to fill the owner details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_fill_the_owner_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the Owner details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Add_owner_to_add_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "View my pets and visit details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@petvisit"
    },
    {
      "name": "@petvisitcheck"
    }
  ]
});
formatter.step({
  "name": "I add a new pet for the owner",
  "keyword": "When "
});
formatter.match({
  "location": "PetClinicPetVisit.i_add_a_new_pet_for_the_owner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the pet details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicPetVisit.i_enter_the_pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the pet details",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicPetVisit.i_verify_the_pet_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the visit details",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicPetVisit.i_enter_the_visit_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Find Owners menu",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicOwner.i_click_on_Find_Owners_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches with the lastname",
  "rows": [
    {
      "cells": [
        "lastname"
      ]
    },
    {
      "cells": [
        "test lastname"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_searches_with_the_lastname(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on owner with pets",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicPetVisit.i_click_on_owner_with_pets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the visit and pets",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicPetVisit.i_verify_the_visit_and_pets()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/petclinic/View_Veterinarians_PetClinic.feature");
formatter.feature({
  "name": "View veterinarians details",
  "description": "  As a user, I want to view the list of veterinarians.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@veterinarians"
    }
  ]
});
formatter.scenario({
  "name": "View the list of veterinarians",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@veterinarians"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "PetClinicOwner.i_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks for the welcome and logo",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicOwner.user_checks_for_the_welcome_and_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the veterinarians",
  "keyword": "And "
});
formatter.match({
  "location": "PetClinicVeterinarians.i_click_on_the_veterinarians()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify the list of veterinarians",
  "keyword": "Then "
});
formatter.match({
  "location": "PetClinicVeterinarians.i_Verify_the_list_of_veterinarians()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});