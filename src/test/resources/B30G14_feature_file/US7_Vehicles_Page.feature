@B30G14-220
Feature: Default
		
		Background:
		    Given user is go to login page
		    Given the user logged in as "sales manager"
		    And user hover over Fleet button
		    And user clicks Vehicles button

	@B30G14-217
	Scenario: Users launch on the Vehicle page, all the checkboxes should be unchecked.
		Then all checkboxes should be unchecked	

	@B30G14-218
	Scenario:  Users checks the first checkbox to check all the cars
		Then first checkbox button should be checked all checkboxes	


	@B30G14-219
	Scenario: users can select any car
		Then any checkbox button  should be clickable