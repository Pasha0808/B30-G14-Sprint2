
Feature: Manage filters on the Vehicle Costs page

  As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox)


  Background:
    Given user is on the login page
  @US_13_mari
  Scenario:Users should see 3 columns on the Vehicle Costs page.
    Given user logged in the page
    When user navigates to fleet button
    And user clicks on the Vehicle Costs button
    Then user sees following columns:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Scenario:
      Given user logged in the page
      When user navigates to fleet button
      And user clicks on the Vehicle Costs button
      Then user selects all records by clicking first checkbox


  Scenario:Users should see 3 columns on the Vehicle Costs page.
    Given user logged in the page as a store manager
    When user navigates to fleet button
    And user clicks on the Vehicle Costs button
    Then user sees following columns:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

  Scenario:
    Given user logged in the page as a store manager
    When user navigates to fleet button
    And user clicks on the Vehicle Costs button
    Then user selects all records by clicking first checkbox

