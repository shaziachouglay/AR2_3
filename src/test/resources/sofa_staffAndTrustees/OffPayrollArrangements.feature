@fullAndFinal
Feature: testing the Staff and Trustees Off Payroll Arrangements page

  @sanity
  Scenario Outline: testing the off payroll arrangements

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I see the value in row total and column one with "<v5>" and column two with "<v6>"
    Examples:
      | v1      | v2      | v3      | v4      | v5         | v6         |
      | 1       | 1       | 1       | 1       | 2          | 2          |
      | 100     | 100     | 100     | 100     | 200        | 200        |
      | 500     | 500     | 500     | 500     | 1,000      | 1,000      |
      | 1000    | 1000    | 1000    | 1000    | 2,000      | 2,000      |
      | 999999  | 999999  | 999999  | 999999  | 1,999,998  | 1,999,998  |
      | 999998  | 999998  | 999998  | 999998  | 1,999,996  | 1,999,996  |
      | -1      | -1      | -1      | -1      | -2         | -2         |
      | -100    | -100    | -100    | -100    | -200       | -200       |
      | -500    | -500    | -500    | -500    | -1,000     | -1,000     |
      | -1000   | -1000   | -1000   | -1000   | -2,000     | -2,000     |
      | -999999 | -999999 | -999999 | -999999 | -1,999,998 | -1,999,998 |
      | -999998 | -999998 | -999998 | -999998 | -1,999,996 | -1,999,996 |

  @sanity
  Scenario Outline: testing the off payroll arrangements Invalid Entries

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I see the value in row total and column one with NOT "<v5>" and column two with NOT "<v6>"
    Examples:
      | v1      | v2      | v3      | v4      | v5         | v6         |
      | 1       | 1       | 1       | 1       | 1          | 21         |
      | 100     | 100     | 100     | 100     | 100        | 20         |
      | 500     | 500     | 500     | 500     | 2,000      | 100        |
      | 1000    | 1000    | 1000    | 1000    | 3,000      | 2,001      |
      | 999999  | 999999  | 999999  | 999999  | 2,999,998  | 1,995,998  |
      | 999998  | 999998  | 999998  | 999998  | 2,999,996  | 1,995,996  |
      | -1      | -1      | -1      | -1      | -1         | -23        |
      | -100    | -100    | -100    | -100    | -100       | -210       |
      | -500    | -500    | -500    | -500    | -2,000     | -1,100     |
      | -1000   | -1000   | -1000   | -1000   | -3,000     | -2,100     |
      | -999999 | -999999 | -999999 | -999999 | -2,999,998 | -1,299,998 |
      | -999998 | -999998 | -999998 | -999998 | -2,999,996 | -1,299,996 |

  @sanity
  Scenario Outline: testing the off payroll arrangements ERRORS: All Financial Data Range

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples:
      | v1       | v2       | v3        | v4         | errors |
      | 9999999  | 9999999  | 99999999  | 999999999  | 4      |
      | 1000000  | 1000000  | 1000000   | 1000000    | 4      |
      | -9999999 | -9999999 | -99999999 | -999999999 | 4      |
      | -1000000 | -1000000 | -1000000  | -1000000   | 4      |


  @sanity
  Scenario Outline: testing the off payroll arrangements ERRORS: Invalid Data Format

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples:
      | v1      | v2      | v3       | v4       | errors |
      | test    | &&&&&   | *****    | aasas123 | 4      |
      | 1OOOOOO | 1OOOOOO | 1OOOOOO  | 1OOOOOO  | 4      |
      | -sample | -9nine  | -twenty  | -%%%%%   | 4      |
      | -!!!!!  | -@@@@@@ | -$$$$$$$ | -(((((   | 4      |


#--------------

  @smoke
  Scenario Outline: testing the off payroll arrangements

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I see the value in row total and column one with "<v5>" and column two with "<v6>"
    Examples:
      | v1      | v2      | v3      | v4      | v5         | v6         |
      | -500    | -500    | -500    | -500    | -1,000     | -1,000     |

  @smoke
  Scenario Outline: testing the off payroll arrangements Invalid Entries

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I see the value in row total and column one with NOT "<v5>" and column two with NOT "<v6>"
    Examples:
      | v1      | v2      | v3      | v4      | v5         | v6         |
      | -1000   | -1000   | -1000   | -1000   | -3,000     | -2,100     |


  @smoke
  Scenario Outline: testing the off payroll arrangements ERRORS: All Financial Data Range

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"

    Examples:
      | v1       | v2       | v3        | v4         | errors |
      | 9999999  | 9999999  | 99999999  | 999999999  | 4      |


  @smoke
  Scenario Outline: testing the off payroll arrangements ERRORS: Invalid Data Format

    Given I am on SoFA section
    And   I navigate to Off Payroll Arrangements page
    And   I enter value in row Trustee off-payroll arrangements and column one with "<v1>" and column two with "<v2>"
    And   I enter value in row Other off-payroll arrangements and column one with "<v3>" and column two with "<v4>"
    Then  I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"

    Examples:
      | v1      | v2      | v3       | v4       | errors |
      | test    | &&&&&   | *****    | aasas123 | 4      |

