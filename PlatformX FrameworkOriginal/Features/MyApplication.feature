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
Feature: Title of your feature
	I want to use this template for my feature file

@tag1
Scenario:Test application practice site  with valid credentials

Given open Browser and start application
And User is on home page click on Login Button
When I Enter valid "username" and "Password" and click on signin button
Then user is on MyStore Home Page and click on Dresses section
And user click on casual dresses
When user click on printed Dresses
And user enter the quantity and size and click on add to cart
Given user click on proceed to checkout button
When user gets on add to cart summary functionality and click on proceed to checkout
Then user gets on address details summary functionality and user click on proceed to checkout
Then user gets on shipping detail summary functionality and user click on proceed to checkout
And user gets on to payment detail summary functionality then user able to click on order confirmation
Given User is logout Home Page successfully
When User closed browser all pages


