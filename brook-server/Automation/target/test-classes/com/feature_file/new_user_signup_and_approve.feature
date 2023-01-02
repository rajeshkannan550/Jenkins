@signup_and_approve
Feature: new_user_signup

  @signup
  Scenario Outline: signup_as_a_new_user
    Given user is on the Admin panel sign up page
    When user should enter valid "<name>" & "<email>" for signup
    And user should create a password "<create password>" and "<re-enter>"
    And user should select the "<region>" , "<role at brook>" and "<pronoun>"
    Then user should submit the Request account

    Examples: 
      | name       | email                        | create password | re-enter  | region    | role at brook | pronoun |
      | Manojkumar | manoj+387@mindwaveventures.com | Brook@123       | Brook@123 | stockport | Admin team    |         |

  @signup_approval_as_superadmin
  Scenario Outline: postcode_barrier_dudely
    Given user is on admin panel login page
    When user should login with valid "<username>" & "<password>"
    And user should navigate to the notification page
    Then user should approve the request for new user

    Examples: 
      | username                                   | password  |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 |
