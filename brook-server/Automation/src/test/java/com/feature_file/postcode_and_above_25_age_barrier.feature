Feature: above_25_age_barrier

  @postcode_barrier_dudely
  Scenario Outline: postcode_barrier_dudely
    Given user is on the STI form test Kit home page
    When user should choose the theme & know the details
    And user should enters the "<postcode>"
    Then user should verify postcode barrier for dudely with "<barrier message>"

    Examples: 
      | postcode | barrier message                                                   |
      | WV4 6GB  | Brook currently doesn/'t provide STI home test kits in your area. |

  @above_25_age_barrier_manchester
  Scenario Outline: postcode_barrier_dudely
    Given user is on the STI form home page
    When user should choose the theme and understand the details
    And user should enters the "<postcode>" & "<age>"
    Then user should verify age barrier for manchester with "<barrier message>"

    Examples: 
      | postcode | age        | barrier message                                                                      |
      | WV4 6GB  | 25 or over | Brook currently doesn/'t provide STI home test kits in your area for your age group. |
