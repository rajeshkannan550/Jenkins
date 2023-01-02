qa@under_16_reject
Feature: Under 16 - Reject

  @under_16_STI_form_Submission
  Scenario Outline: Under 16 age form
    Given user is on the STI form test Kit page
    When user should choose theme and know the details
    And user should enters "<postcode>" and "<age>"
    And user should verify all the links
    And user should enter  "<firstname>" and "<lastname>"
    And user should enter  "<mobilenumber>" , "<email>"
    And user should verify privacy link
    Then user should submit form

    Examples: 
      | postcode | age | firstname | lastname | mobilenumber | email                  |
      | SK144BG  |  14 | manoj     | kumar    | 076881420684 | manojkumar1221@mww.coo |

  @under_16_STI_form_reject
  Scenario Outline: Under 16 age form reject
    Given user is on admin panel home page
    When user should login with the valid "<username>" and "<password>"
    And user should verify name as the form submitted with "<firstname lastname>"
    And user should reject the form
    Then user should verify that it is navigated to rejected page and Lilie page  with "<firstname lastname>"

    Examples: 
      | username                                   | password  | firstname lastname |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | Manoj Kumar        |
