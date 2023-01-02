@tag
Feature: Filter the forms by regions

  @tag1
  Scenario Outline: Filter the forms by regions
    Given User is on admin login page
    When user should login by valid "<username>"  "<password>"
    And User should filter the region
    Then user should verify the forms based on the filters

    Examples: 
      | username                                   | password  |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 |
