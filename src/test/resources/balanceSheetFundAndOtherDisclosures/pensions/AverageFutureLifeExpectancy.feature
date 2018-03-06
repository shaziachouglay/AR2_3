Feature: Testing the Average future life expectancies

  Scenario Outline:Testing the Average future life expectancies with valid data
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Average future life expectancies page
    And    I enter value in row Current Position Males and column with "<v1>"
    And    I enter value in row Current Position Females and column with "<v2>"
    And    I enter value in row Future pensioners retiring in twenty years males and column with "<v3>"
    And    I enter value in row Future pensioners retiring in twenty years females and column with "<v4>"
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 |
#     data to be provided.

  Scenario Outline:Testing the Average future life expectancies for Errors All Financial Data
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Average future life expectancies page
    And    I enter value in row Current Position Males and column with "<v1>"
    And    I enter value in row Current Position Females and column with "<v2>"
    And    I enter value in row Future pensioners retiring in twenty years males and column with "<v3>"
    And    I enter value in row Future pensioners retiring in twenty years females and column with "<v4>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1       | v2       | v3       | v4       | error |
      | 99999999 | 99999999 | 99999999 | 99999999 | 4     |
#     data to be provided.


  Scenario Outline:Testing the Average future life expectancies for Errors Invalid Data Format 
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Average future life expectancies page
    And    I enter value in row Current Position Males and column with "<v1>"
    And    I enter value in row Current Position Females and column with "<v2>"
    And    I enter value in row Future pensioners retiring in twenty years males and column with "<v3>"
    And    I enter value in row Future pensioners retiring in twenty years females and column with "<v4>"
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1       | v2       | v3       | v4       | error |
      | ******** | ******** | ******** | ******** | 4     |
#     data to be provided.



