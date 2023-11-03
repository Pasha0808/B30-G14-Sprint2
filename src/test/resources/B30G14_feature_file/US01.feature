@B30G14-212
Feature: Default

	Background:
		Given user is on the login page


	@B30G14-211
	Scenario: Store and sales managers should view 8 module names. Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

		
		
		  Scenario: Sales Managers and Store Managers should view 8 module names
		    When user enter Sales Manager information
		    Then user should be able to see the following modules:
		      | Dashboards         |
		      | Fleet              |
		      | Customers          |
		      | Sales              |
		      | Activities         |
		      | Marketing          |
		      | Reports & Segments |
		      | System             |	


	@B30G14-210
	Scenario: drivers should view 4 module names Expected module names: Fleet, Customers, Activities, System

	  Scenario: Drivers should view 4 module names
	   When user enter Driver information
	   Then user should be able to see following modules:
	     | Fleet      |
	     | Customers  |
	     | Activities |
		 | System     |


	@B30G14-213
	Scenario: Store managers should view 8 module names. Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

					  Scenario: Store Managers should view 8 module names
				    When user enter Store Manager information
				    Then user should be able to see the following modules:
				      | Dashboards         |
				      | Fleet              |
				      | Customers          |
				      | Sales              |
				      | Activities         |
				      | Marketing          |
				      | Reports & Segments |
				      | System             |