
Feature: login with valid credential
  Scenario:  login with validcredential scenario
  
    Given user is in orange hrm login
    When user provide valid credentials
      | Username  | Password | 
      | admin |     admin123| 
     
     Then user should be able to login sucessfully
     
     
 @InValidCredentials
  Scenario: Login with invalid credentials
  Given user is in orange hrm login
    When user provide valid credentials
     | Username  | Password |
      | adminl |     admin123 |
      | admin |     admin321 |
    Then User should be able to see unsucessfull with error message
    