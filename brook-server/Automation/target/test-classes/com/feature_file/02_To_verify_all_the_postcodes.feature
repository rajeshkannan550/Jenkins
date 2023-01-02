Feature: To verify all the post codes

  Scenario Outline: Verification of post codes
    Given user1 is on the STI Order test Kit home page
    When user1 should choose the theme , know the details
    And user1 should get the post codes from the "<excel>" and "<sheet name>" and verify the page is navigated

    Examples: 
      | excel                                                                                                                                 | sheet name |
      | C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\src\\test\\resources\\data\\Updated Postcodes with Site Codes - Copy.xlsx | Sheet1     |
