
@vytrackLogin
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager

  Background:
 Given user is on the login page

  @smoke
  Scenario: Login as driver
    #Given user is on the login page
    When user enters the driver information
    Then user should be able to login

  Scenario: Login as sales manager
    #Given user is on the login page
    When user enters the sales manager information
    Then user should be able to login

  Scenario: Login as store manager
    #Given user is on the login page
    When user enters the store manager information
    Then user should be able to login

  @param
  Scenario: Login with parameterization
    #Given user is on the login page
    When user enters the "store manager" information
    Then user should be able to login


  @invalidLoginWithParamsSceOutLine
  Scenario Outline: Login with invalid credential
    #Given user is on the login page
    When the user login with "<username>","<password>"
    Then the user should not be able to log in

    Examples:
      | username        | password      |
      | wrongUserName   | UserUser123   |
      | salesmanager101 | wrongPassword |
      | wrongUserName   | wrongPassword |
      | wrongUserName   | empty         |
      | empty           | wrongPassword |
      | empty           | empty         |


