@fullAndFinal
Feature: Testing Other Income Page
  @sanity
  Scenario Outline: testing Happy path for Other Income Page
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I can see the Total field is now "<Total>"

    Examples: Data: Valid Entries
      | Academies | Government Sources_Non Grant | Non-Government Revenue | Total      | NotionalApprenticeshipLevy | InIncome |
      | 0         | 0                            | 0                      | 0          | 0                          | 0        |
      | 1         | 1                            | 1                      | 4          | 1                          | 1        |
      | 100       | 100                          | 100                    | 400        | 100                        | 100      |
      | 200       | 200                          | 200                    | 800        | 200                        | 200      |
      | 500       | 500                          | 500                    | 2,000      | 500                        | 500      |
      | 111       | 222                          | 333                    | 1,110      | 444                        | 111      |
      | 150       | 250                          | 350                    | 1,200      | 450                        | 150      |
      | 250       | 250                          | 250                    | 1,000      | 250                        | 250      |
      | 999999    | 999999                       | 999999                 | 3,999,996  | 999999                     | 999999   |
      | 999998    | 999998                       | 999998                 | 3,999,992  | 999998                     | 999998   |
      | -1        | -1                           | -1                     | -4         | -1                         | -1       |
      | -100      | -100                         | -100                   | -400       | -100                       | -100     |
      | -200      | -200                         | -200                   | -800       | -200                       | -200     |
      | -500      | -500                         | -500                   | -2,000     | -500                       | -500     |
      | -111      | -222                         | -333                   | -1,110     | -444                       | -333     |
      | -150      | -250                         | -350                   | -1,200     | -450                       | -350     |
      | -250      | -250                         | -250                   | -1,000     | -250                       | -250     |
      | -999999   | -999999                      | -999999                | -3,999,996 | -999999                    | -999999  |
      | -999998   | -999998                      | -999998                | -3,999,992 | -999998                    | -999998  |


  @sanity
  Scenario Outline: testing Unhappy path for Other Income Page
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I can see the Total field is NOT "<Total>" in Other Income page
    Examples: Data: Invalid Entries
      | Academies | Government Sources_Non Grant | Non-Government Revenue | Total      | NotionalApprenticeshipLevy | InIncome |
      | 0         | 0                            | 0                      | 1          | 0                          | 0        |
      | 1         | 1                            | 1                      | 2          | 1                          | 1        |
      | 100       | 100                          | 100                    | 300        | 100                        | 100      |
      | 200       | 200                          | 200                    | 400        | 200                        | 200      |
      | 500       | 500                          | 500                    | 5,000      | 500                        | 500      |
      | 111       | 222                          | 333                    | 6,110      | 444                        | 111      |
      | 150       | 250                          | 350                    | 7,200      | 450                        | 150      |
      | 250       | 250                          | 250                    | 8,000      | 250                        | 250      |
      | 999999    | 999999                       | 999999                 | 9,999,996  | 999999                     | 999999   |
      | 999998    | 999998                       | 999998                 | 9,999,992  | 999998                     | 999998   |
      | -1        | -1                           | -1                     | -3         | -1                         | -1       |
      | -100      | -100                         | -100                   | -200       | -100                       | -100     |
      | -200      | -200                         | -200                   | -100       | -200                       | -200     |
      | -500      | -500                         | -500                   | -1,000     | -500                       | -500     |
      | -111      | -222                         | -333                   | -2,110     | -444                       | -333     |
      | -150      | -250                         | -350                   | -3,200     | -450                       | -350     |
      | -250      | -250                         | -250                   | -4,000     | -250                       | -250     |
      | -999999   | -999999                      | -999999                | -5,999,996 | -999999                    | -999999  |
      | -999998   | -999998                      | -999998                | -6,999,992 | -999998                    | -999998  |



  @sanity
  Scenario Outline: testing Errors: Other Income Page:  All Financial Data Range
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples: Data: Other Income Page: All Financial Data Range
      | Academies | Government Sources_Non Grant | Non-Government Revenue | NotionalApprenticeshipLevy | InIncome | error |
      | 9999999   | 9999999                      | 9999999                | 9999999                    | 9999999  | 5     |
      | 1000000   | 1000000                      | 1000000                | 1000000                    | 1000000  | 5     |
      | -9999999  | -9999999                     | -9999999               | -9999999                   | -9999999 | 5     |
      | -1000000  | -1000000                     | -1000000               | -1000000                   | -1000000 | 5     |


  @sanity
  Scenario Outline: testing Errors: Other Income Page:  Invalid Data Format
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Data: Other Income Page: Invalid Data Format
      | Academies | Government Sources_Non Grant | Non-Government Revenue | NotionalApprenticeshipLevy | InIncome  | error |
      | sampe     | test@                        | 999999a                | 999999a                    | 999999a   | 5     |
      | 100test00 | some@example.com             | 10OO0000               | 10OO0000                   | 1000OO0   | 5     |
      | -99999*9  | -9090tyt                     | -9%%99999              | -9^^99999                  | -9999&&99 | 5     |
      | -100&&00  | -100000ooo                   | -1OOO000               | -A000000                   | -1&&00000 | 5     |


#---------------------
  @smoke
  Scenario Outline: testing Happy path for Other Income Page
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I can see the Total field is now "<Total>"

    Examples: Data: Valid Entries
      | Academies | Government Sources_Non Grant | Non-Government Revenue | Total      | NotionalApprenticeshipLevy | InIncome |
      | -999998   | -999998                      | -999998                | -3,999,992 | -999998                    | -999998  |


  @smoke
  Scenario Outline: testing Unhappy path for Other Income Page
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I can see the Total field is NOT "<Total>" in Other Income page
    Examples: Data: Invalid Entries
      | Academies | Government Sources_Non Grant | Non-Government Revenue | Total      | NotionalApprenticeshipLevy | InIncome |
      | -999998   | -999998                      | -999998                | -6,999,992 | -999998                    | -999998  |



  @smoke
  Scenario Outline: testing Errors: Other Income Page:  All Financial Data Range
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples: Data: Other Income Page: All Financial Data Range
      | Academies | Government Sources_Non Grant | Non-Government Revenue | NotionalApprenticeshipLevy | InIncome | error |
      | -1000000  | -1000000                     | -1000000               | -1000000                   | -1000000 | 5     |


  @smoke
  Scenario Outline: testing Errors: Other Income Page:  Invalid Data Format
    Given  I am on SoFA section
    When   I navigate to the Other Income Page
    And    I enter the value in Academies with "<Academies>"
    And    I enter the value in Government Sources - Non Grant with "<Government Sources_Non Grant>"
    And    I enter the value inNon-Government Revenue with "<Non-Government Revenue>"
    And    I enter the value in Notional Apprenticeship Levy Income with "<NotionalApprenticeshipLevy>"
    And    I enter value in field Investmen income Interest with "<InIncome>" in Other Income
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: Data: Other Income Page: Invalid Data Format
      | Academies | Government Sources_Non Grant | Non-Government Revenue | NotionalApprenticeshipLevy | InIncome  | error |
      | sampe     | test@                        | 999999a                | 999999a                    | 999999a   | 5     |
















