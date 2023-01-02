Feature: To change the role as admin as user and approve that request from

  Scenario Outline: To change the role as admin
    Given User is on the Admin login page
    When user is login with "<username>" , "<password>" as user
    And user is navigated to settings page
    And user is requested role change with "<role>" and "<notes>"
    Then user is submitted the request

    Examples: 
      | username                          | password  | role  | notes       |
      | manojkumar+4@mindwaveventures.com | Brook@123 | Admin | give access |

  Scenario Outline: Approve the role change request from Super admin
    Given User is on Admin panel login page
    When user is login with "<username>" , "<password>" as super admin
    And user is navigated to the notification page
    And user is accepted the request
    Then user is re verify the accepted role "<username1>" , "<password1>"

    Examples: 
      | username                                   | password  | username1                         | password1 |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | manojkumar+4@mindwaveventures.com | Brook@123 |
