Feature: To change the password

  Scenario Outline: To change the role as admin
    Given User is on Admin home page
    When user is login with "<username>" & "<password>" as user
    And user should be navigated to settings page
    And user should be navigated to password page
    And user should change the "<new password>" by entering the old "<password>"
    Then user should verify the Re-login with "<username>" and "<new password>"

    Examples: 
      | username                                   | password  | new password |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | Brook@12     |
