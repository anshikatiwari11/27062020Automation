
Feature: Scroll feature

  @tag1
  Scenario: Scroll till footer
    Given user is on home page
    When user scroll till end of page
    Then footer links should displayed
  

