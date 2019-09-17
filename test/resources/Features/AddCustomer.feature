Feature: Validate guru 99 page

  Scenario: Validate add customer
    Given User is on add customer page
     When User enters login details
    Then Verify url message
    
