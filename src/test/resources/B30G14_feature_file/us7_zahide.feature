Feature:As a user, I should be able to select any vehicle from the Vehicle page(web table)


  Background:
    Given user is go to login page
    Given the user logged in as "sales manager"
    And user hover over Fleet button
    And user clicks Vehicles button

  Scenario: Sales Manager,Store Manager
    Then all checkboxes should be unchecked

  Scenario: Store Manager,Store Manager
    Then all checkboxes should be checked

  Scenario: Store Manager,Store Manager
    Then any checkbox should be checked