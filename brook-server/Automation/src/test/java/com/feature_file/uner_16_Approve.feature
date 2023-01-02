@under_16_approve
Feature: Under 16 - Approve

  @under_16_STI_form_Submission
  Scenario Outline: Under 16 age
    Given user is on the STI Order test Kit page
    When user should choose the theme and know the details
    And user should enters the "<postcode>" and "<age>"
    And user should verify the all the links
    And user should enter  "<firstname>" , "<lastname>"
    And user should enter "<mobilenumber>" and "<email>"
    And user should verify the privacy link
    Then user submitted the form

    Examples: 
      | postcode | age | firstname | lastname | mobilenumber | email                |
      | SK144BG  |  14 | manoj     | kumar    |  07881420684 | manojkumar221@mww.coo |

  @under_16_STI_form_tapproval
  Scenario Outline: Under 16 age form approval
    When user is on the admin panel home page
    When user should login with valid "<username>" and "<password>"
    And user should verify the name as the form submitted with "<firstname lastname>"
    And user should approve the form
    And user should enter the "<address1>" , "<address2>" , "<town>", "<details>"
    Then user should verify that it is navigated to approved page and Lilie page  with "<firstname lastname>"

    Examples: 
      | username                                   | password  | firstname lastname | address1 | address2         | town | details |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | Manoj Kumar        |        2 | 3rd cross street | test | test    |
