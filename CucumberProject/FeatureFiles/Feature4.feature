Feature: Upload Documents

  Scenario: Test document upload feature
    Given user is on home page
    When click on Automobile link
    And click on Enter Insurance Data link
    And click on open button and upload document
    Then document should be uploaded
