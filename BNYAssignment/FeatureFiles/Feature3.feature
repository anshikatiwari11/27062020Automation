
Feature: SSO Login feature

   Scenario Outline: Verify SSO Login of AccessHub Portal from MySource 3.0.
    Given user is on Mysouce <url>.
    When user clicks on AccessHub Link under Key Links.
    Then AccessHub Portal homepage in the new tab should be opened.
  

