@B30G14-196
Feature: As a user, I want to view car odometer info on the Vehicles Odometers page


  @B30G14-192
  Scenario Outline: Verify store and sales managers see an error message, “You do not have permission to perform this action.”
    Given user is on homepage
    And user login with "<username>","<password>"
    When user hovers over fleet module
    And user click's vehicle odometer
    Then user see's the error message “You do not have permission to perform this action.”

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |


  @B30G14-194
  Scenario: Verify Drivers see the default page as 1.
    Given user is on homepage
    And user login with "user1","UserUser123"
    When user hovers over fleet module
    And user click's vehicle odometer
    Then user see's the default page as 1



  @B30G14-195
  Scenario: Verify Drivers see the View Per Page is 25 by default.
    Given user is on homepage
    And user login with "user1","UserUser123"
    When user hovers over fleet module
    And user click's vehicle odometer
    Then user see's View Per Page as 25