@fullAndFinal
Feature: Testing Other Income Section > Other Trading Activities Page > Sanity Check and In-page validation, computation and errors.

  @sanity
  Scenario Outline: testing the Other Trading Activities Page with valid or  happy path

    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    Then  I see value in field Total is now "<v7>" in Other Trading Activities page

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v6      | v7         |
      | 1       | 1       | 1       | 1       | 1       | 1       | 6          |
      | 100     | 100     | 100     | 100     | 100     | 100     | 600        |
      | 500     | 500     | 500     | 500     | 500     | 500     | 3,000      |
      | 1,000   | 1,000   | 1,000   | 1,000   | 1,000   | 1,000   | 6,000      |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 5,999,988  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 5,999,994  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -6         |
      | -100    | -100    | -100    | -100    | -100    | -100    | -600       |
      | -500    | -500    | -500    | -500    | -500    | -500    | -3,000     |
      | -1,000  | -1,000  | -1,000  | -1,000  | -1,000  | -1,000  | -6,000     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -5,999,988 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -5,999,994 |

  @sanity
  Scenario Outline: testing the Other Trading Activities Page with invalid or  unhappy path

    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    Then  I see value in field Total is NOT "<v7>" in Other Trading Activities page

    Examples: Invalid Entries to test the in page validation and computation
      | v1      | v2      | v3      | v4      | v5      | v6      | v7         |
      | 1       | 1       | 1       | 1       | 1       | 1       | 5          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 500        |
      | 500     | 500     | 500     | 500     | 500     | 500     | 5,000      |
      | 1,000   | 1,000   | 1,000   | 1,000   | 1,000   | 1,000   | 5,000      |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 4,999,988  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 4,999,994  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -5         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -500       |
      | -500    | -500    | -500    | -500    | -500    | -500    | -5,000     |
      | -1,000  | -1,000  | -1,000  | -1,000  | -1,000  | -1,000  | -5,000     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -4,999,988 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -4,999,994 |

  @sanity
  Scenario Outline: testing the Other Trading Activities Page error triggering: All Financial Data Range
    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples:
      | v1       | v2       | v3       | v4       | v5       | v6       | errors |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 6      |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 6      |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 6      |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 6      |

  @sanity
  Scenario Outline: testing the Other Trading Activities Page error triggering: Invalid Data Format
    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples: Invalid Number format data to check the Invalid Number Format Errors.
      | v1       | v2       | v3       | v4       | v5       | v6       | errors |
      | *******  | &&&&&&&  | ££££     | !!!!     | @@@@     | 123wer   | 6      |
      | 9999*99  | 999*999  | 9999$99  | 999(999  | 999&999  | 99!9999  | 6      |
      | -100&000 | -10&0000 | -100$000 | -10(0000 | -10*0000 | -1!00000 | 6      |
      | -999^999 | -99&9999 | -999$999 | -99(9999 | -99*9999 | -9O99999 | 6      |
#--------------

  @smoke
  Scenario Outline: testing the Other Trading Activities Page with valid or  happy path

    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    Then  I see value in field Total is now "<v7>" in Other Trading Activities page

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v6      | v7         |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -5,999,994 |

  @smoke
  Scenario Outline: testing the Other Trading Activities Page with invalid or  unhappy path

    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    Then  I see value in field Total is NOT "<v7>" in Other Trading Activities page

    Examples: Invalid Entries to test the in page validation and computation
      | v1      | v2      | v3      | v4      | v5      | v6      | v7         |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 4,999,994  |

  @smoke
  Scenario Outline: testing the Other Trading Activities Page error triggering: All Financial Data Range
    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples:
      | v1       | v2       | v3       | v4       | v5       | v6       | errors |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 6      |

  @smoke
  Scenario Outline: testing the Other Trading Activities Page error triggering: Invalid Data Format
    Given I am on SoFA section
    And   I have navigated to Other Trading Activities section
    And   I enter value in field Hire of Facilities with "<v1>"
    And   I enter value in field Catering Income with "<v2>"
    And   I enter value in field rental Income with "<v3>"
    And   I enter value in field Recieipts from Supply Teacher Insurance Claims with "<v4>"
    And   I enter value in field risk Protection Arrangements Claims with "<v5>"
    And   I enter value in field Others with "<v6>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples: Invalid Number format data to check the Invalid Number Format Errors.
      | v1       | v2       | v3       | v4       | v5       | v6       | errors |
      | *******  | &&&&&&&  | ££££     | !!!!     | @@@@     | 123wer   | 6      |


  @sofa_references
    Scenario: Testing references for the SOFA Other Income Other Trading Activites page
      Given I am on SoFA section
      And   I have navigated to Other Trading Activities section
      Then I see the correct references are displayed for "s_oi_OtherTradingActivities" page of type "Table"