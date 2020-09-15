
Feature: MySource 3.0 Search feature


  Scenario Outline: Verify Search of commit id in MySource 3.0.
    Given user is on Mysouce <url>
    When user enter commit id in serch box
    Then verify corresponding <username> getting displayed in the serach results.
    When user clicks on username link.
    Then corporate directory getting displayed.
		Examples: 
      |url   | data |
      |      |      |