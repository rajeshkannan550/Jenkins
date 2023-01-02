Feature: Report and Feedback submission

  Scenario Outline: Report and Feedback Submission
    Given User is on the Admin panel login page
    When user should login with "<username>" & "<password>"
    And user should be navigated to feedback page
    And user should enter the "<feedback>"
    Then user should submit the feedback
    When user should navigate to the report problem page
    And user should enter the "<report>" & "<contact number>"
    Then user should submit the report

    Examples: 
      | username                     | password  | feedback      | report                    | contact number |
      | manojkumar@mindwaveventures.com | Brook@123 | Good progress | Need to be quick response |    07123456789 |
