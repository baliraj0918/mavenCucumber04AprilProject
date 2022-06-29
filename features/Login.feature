@Facebook
Feature: Title of your feature
  I want to use this template for my feature file

@Login
  Scenario Outline: Login Functionality
    Given User should be able to open facebook Application
    When User enter Username <username>
    And User enter Password <password>
    And User click on Login button
    Then User should be able to login successfully
    
    Examples:
      |username|password|
      |Bali    |1234    |
      |Ravi    |4567    |
      
    

        
    
   
    

