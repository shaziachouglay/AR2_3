Feature: Testing the Analysis fo Pension Finance page

  Scenario Outline: testing the Analysis of Pension finance in Pensions sesction

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Analysis of Pensions Finance page
    Then   I must see value in field Interest Cost is "<v1>"
    Then   I must see value in field Interest Income is "<v2>"
    Then   I must see value in field Net Interest Expense is "<v3>"
    Then   I must see value in field Actuarial gains is "<v4>"
    Examples:
      | v1 | v2 | v3 | v4 |
#    Data to be provided.