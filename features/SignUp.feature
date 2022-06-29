@SignUpPage
Feature: SignUpFeature
  I want to test signup functionality

  @SignUpFun
  Scenario Outline: SignUp Scenario
    Given User should be able to open facebook Application  
    When User click on create new account 
    And user enter firstname <firstname>
    And user enter lastname <lastname>
    Then user Should be able to signup Sucessfully
    
    Examples:
   |firstname|lastname|
   |Bali     |Raj     |
   |Ravi     |Kumar   |
    

  
