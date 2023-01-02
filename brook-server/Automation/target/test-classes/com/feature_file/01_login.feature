Feature: login

  @login
  Scenario Outline: login verify
    Given user is on the admin login page
    When user should login with valid "<username>"  "<password>"
    When user should click the logout button
    Then user should log out

    Examples: 
      | username                                   | password  |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 |
