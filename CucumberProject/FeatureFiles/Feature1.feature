
Feature: Tricentis Search feature


  Scenario: search with valid keyword
    Given user is on home page
    When user search with BMW keyword
    Then relevant results should displayed
