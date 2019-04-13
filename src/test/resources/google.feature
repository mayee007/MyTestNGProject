Feature: check google home 
  Scenario: 
    Given I open google page
    When I read title
    Then title should be "Google"
