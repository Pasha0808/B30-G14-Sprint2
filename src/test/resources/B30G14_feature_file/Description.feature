@tag
Feature: users should be able to write messages in the Description ** field on the calendar event page.

  As a user:
   I want to write the “Description” when I create a calendar event.

  Background:
    Given user is on the login page


  Scenario: Store manager writes description for calendar event
    When user enters the "store manager" information
  When user click on the activities button.
    Then user should be able to click the calender Event.
    When user click on the creat calender event button.
    Then user click on repeat box.
    When user write message in description.
    Then the message should be displayed.


  Scenario: Driver writes description for calendar event
    When user enters the "driver" information
    When user click on the activities button.
    Then user should be able to click the calender Event.
    When user click on the creat calender event button.
    Then user click on repeat box.
    When user write message in description.
    Then the message should be displayed.


  Scenario:  Sales manager writes description for calendar event
    When user enters the "sales manager" information
    When user click on the activities button.
    Then user should be able to click the calender Event.
    When user click on the creat calender event button.
    Then user click on repeat box.
    When user write message in description.
    Then the message should be displayed.



