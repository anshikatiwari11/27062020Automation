Feature: Enhanced search feature

  Scenario Outline: Test search scenario with multiple test data
    Given user is on home page
    When user search with <data> keyword
    Then relevant results should displayed

    Examples: 
      | data |
      | BMW  |
      | VM   |
      | Audi |
