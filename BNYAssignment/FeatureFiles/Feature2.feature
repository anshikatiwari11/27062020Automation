
Feature: Navigation feature of Menu Links

  Scenario Outline: Validate navigation of menu links under HR and Personal Menu.
    Given user is on Mysouce <url>.
    When user clicks on HR and Personal Menu.
    And user clicks on HR resources section.
    Then Menu link should be displayed.
    When user clicks on MyReward.
    Then Compensate page in the new tab should be opened.
    When user clicks on HR Governance.
    Then BNY Mellon Policies and Procedures in the new tab should be opened.
    
    Examples: 
      | data |
  
