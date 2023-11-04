@B30G14-225
Feature: Default

	
	@B30G14-221
	Scenario:   As a store manager i want to write the “Description” when I create a calendar event.
		Given user is on the login page
		    When user enters the "store manager" information
		    When user click on the activities button.
		    Then user should be able to click the calender Event.
		    When user click on the creat calender event button.
		    Then user click on repeat box.
		    When user write message in description.
		    Then the message should be displayed.	

	
	@B30G14-222
	Scenario:  As a driver i want to write the “Description” when I create a calendar event.
		Given user is on the login page
		    When user enters the "driver" information
		    When user click on the activities button.
		    Then user should be able to click the calender Event.
		    When user click on the creat calender event button.
		    Then user click on repeat box.
		    When user write message in description.
		    Then the message should be displayed.	

	
	@B30G14-223
	Scenario:  As a sales manager i want to write the “Description” when I create a calendar event.
		Given user is on the login page
		    When user enters the "sales manager" information
		    When user click on the activities button.
		    Then user should be able to click the calender Event.
		    When user click on the creat calender event button.
		    Then user click on repeat box.
		    When user write message in description.
		    Then the message should be displayed.