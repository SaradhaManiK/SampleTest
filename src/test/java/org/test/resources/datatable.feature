#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: New Account creation and signin

  @tag1
  Scenario: As an user, I want to create new account sothat I can sign in
    Given the user is in homepage
    When the user clicks create new account
    And the users enters the Customer name
    |Saradha||Testname2|
    
    And the users enters the Email
    |k.saradhamani@gmail.com||Testname2@gmail.com|
    
    And the users enters the Password
    |Saradha123||Testname2123|
    
    And the users reenters the password
    |Saradha123||Testname2123|
    
    And the users clicks Continue
    Then verify the relevant message is displayed
