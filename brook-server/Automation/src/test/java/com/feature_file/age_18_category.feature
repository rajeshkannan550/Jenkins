@age_18
Feature: 18_category

  @age_18_category_form_Submission
  Scenario Outline: age_18_category
    Given user is on the STI Order test Kit home page
    When user should choose the theme , know the details
    And user should enters the "<postcode>" , "<age>"
    And user should verify elegible or not with "<elegible message>"
    And user should enter the type of sex and genitals
    And user should enter the "<firstname>" , "<lastname>"
    And user should enter the DOB "<date>","<month>" and "<year>"
    And user should enter the "<mobilenumber>" and "<email>"
    And user should enter the "<adress line1>" , "<address line_2>" and "<town>"
    And user should choose the ethnicity
    And user should choose their gender
    Then user should submit the form

    Examples: 
      | postcode | age | firstname | lastname | date | month | year | mobilenumber | email                  | adress line1 | address line_2 | town |
      | SK144BG  |  18 | manoj     | kumar    |   15 | May   | 2003 | 076881420684 | manojkumar1222@mww.coo |            2 | street         | test |

  @age_18_category_form_verification
  Scenario Outline: age_18_form_approval
    Given user is on the admin home page
    When user should login with valid "<username>" , "<password>"
    And user should verify the name as the form submitted with "<firstname lastname>" and it should be on Auto approved tab

    Examples: 
      | username                                   | password  | firstname lastname |
      | manojkumar+superadmin@mindwaveventures.com | Brook@123 | Manoj Kumar        |
