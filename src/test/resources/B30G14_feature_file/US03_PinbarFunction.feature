@B30G14-209
Feature: Pinbar functionality
	User Story :  As a user, I want to learn how to use the pinbar.

	Background:
		#@B30G14-201
		Given user is on the login page
		

	@B30G14-208
	Scenario: US3AC2: Store manager user should see an image on the page. 
		When user enters the store manager information
		Then user should be able to login
		Then user should click on Learn how to use this space
		Then user should see an image on the page

	@B30G14-207
	Scenario: US3AC2: Sales manager user should see an image on the page. 
		When user enters the sales manager information
		Then user should be able to login
		Then user should click on Learn how to use this space
		Then user should see an image on the page


	@B30G14-206
	Scenario: US3AC2: Driver user should see an image on the page. 
		When user enters the driver information
		Then user should be able to login
		Then user should click on Learn how to use this space
		Then user should see an image on the page


	@B30G14-205
	Scenario: US3AC1: Store manager user should see two texts related to pinbar 
		When user enters the store manager information
		Then user should be able to login
		Then user should click on Learn how to use this space
		Then user should see How To Use Pinbar text
		And user should see Use the pin icon on the right top corner of the page to create fast access link in the pinbar text


	@B30G14-203
	Scenario: US3AC1: Sales manager user should see two texts related to pinbar 
		When user enters the sales manager information
		Then user should be able to login
		Then user should click on Learn how to use this space
		Then user should see How To Use Pinbar text
		And user should see Use the pin icon on the right top corner of the page to create fast access link in the pinbar text


	@B30G14-202
	Scenario: US3AC1: Driver user should see two texts related to pinbar 
		When user enters the driver information
		Then user should be able to login
		Then user should click on Learn how to use this space
		Then user should see How To Use Pinbar text
		And user should see Use the pin icon on the right top corner of the page to create fast access link in the pinbar text