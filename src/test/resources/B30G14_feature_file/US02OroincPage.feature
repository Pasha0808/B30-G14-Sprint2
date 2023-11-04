@B30G14-204

	#AC #1: users access the Oronic Documentation page by
	#clicking the question icon.
  @B30G14-199
  #Scenario:As a user, I should be access to the Oroinc Documentation page.
Feature:
  User story:
  As a user, I should be access to the Oroinc
  Documentation page.

  Background:For all scenarios users is already on the main page of the Fleet application
    Given user is already on the main  page of the Fleet application

  Scenario:driver  should be able to access to the Oroinc Documentation page.
    When driver clicks on the question icon on the home page
    Then driver is able to access to the Oroinc Documentation page


  Scenario:store_manager should be able to access to the Oroinc Documentation page.
    When store_manager clicks on the  question icon on the home page
    Then store_manager  is able to access to the Oroinc Documentation page


  Scenario:sale_manager should be access to the Oroinc Documentation page.
    When sales_manager clicks on the question icon on the home page
    Then sales_manager is able to access to the Oroinc Documentation page