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
Feature: Validate Login Functionality for XYZ bank

  #
  @Login
  Scenario Outline: Validate Login  Functionality
    Given I navigate to the bank URL
    And I click on the customer login button with below details
      | Username   |
      | <Username> |
    And I click on the Login Button
    Then User should be able to login successfully

    Examples: 
      | Username     |
      | Harry Potter |
      | Ron Weasly   |

  @Deposit
  Scenario Outline: Deposit money
    Given i click on Deposit Screen
    And I enter the below Amount to be Deposited
      | Amount     |
      | <Amount> |
    When I click on the Deposit  button
    Then Amount should be desposited successfully

    Examples: 
      | Amount |
      |  10000 |
