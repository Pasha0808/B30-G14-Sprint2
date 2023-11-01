
Feature:As a user, I should be able to select any vehicle from the Vehicle page(web table)


Background:
  Given user is go to login page
  Then  user enter username and password
  And   user click login button
  Then  user sees home page successfully


  Scenario: Sales Manager
    Then user "sales manager" hover over the fleet module
    Then user "sales manager" click the Vehicle module
    And  user "sales manager" go to Vehicle page successfully
    Then user "sales manager" check the all cars button already not selected
    Then user "sales manager" select  the all cars checkbox button can be able to select
    Then user "sales manager" select any car checekbox buttn


  Scenario: Store Manager
    Then user "store manager" hover over the fleet module
    Then user "store manager" click the Vehicle module
    And  user "store manager" go to Vehicle page successfully
    Then user "store manager" check the all cars button already not selected
    Then user "store manager" select  the all cars checkbox button can be able to select
    Then user "store manager" select any car checekbox buttn