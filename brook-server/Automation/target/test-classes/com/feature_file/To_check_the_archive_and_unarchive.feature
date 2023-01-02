Feature: To archive and un archive the account

  @archive_and_unarchive_verification
  Scenario Outline: To archive and unarchive the account as user
    Given user3 is on the admin panel home page
    When user3 is login with "<username>" and "<password>"
    And user3 should navigate to Your account page in settings
    And user3 should give archive account request
    And should log in as a super admin with "<username1>" and "<password1>"
    And Super admin should approve the archive account received
    Then Verify the archive account by loggin in with "<username>" and "<password>"
    When super admin account should be logged in with "<username1>" and "<password1>"
    And super admin should unarchive the account
    Then Verify the unarchive account by logging in with "<username>" and "<password>"

    Examples: 
      | username1                                  | password1 | username       | password  |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | aaaa@gmail.com | Brook@123 |
