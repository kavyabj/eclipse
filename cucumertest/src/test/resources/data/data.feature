
Feature: To register and login to parabank
  Scenario: Register using the below details
    Given user is on parabank registerpage
    When user enter firstname
    And user enter lastname
    And user enter lastname
    And user enter address
    And user enter city
    And user enter state
    And user enter zipcpode
    And user enter phone no
    And user enter ssn
    And user enter username
    And user enter password
   And User clicks login button
	Then USer Should be able to register sucessfully and login page opens

  