Feature: To create a new role and remove that role

  Scenario Outline: To create a new role and remove
    Given User1 is on Admin home page
    When user1 is login with "<username>" & "<password>"
    And user1 is navigated to over view page in settings page
    And user1 is create a "<new role>"
    And user1 should remove the role

    Examples: 
      | username                                   | password  | new role      |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | Staff manager |
