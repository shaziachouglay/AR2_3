@fullAndFinal
Feature: testing the Loss Of Office Payment section

  @sanity
  Scenario Outline: Check the Loss Of Office Payment section with Valid Credentials

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    Then  I see the value in row Total and column Accounting Office Number Of Payments is "<v11>" and value of Payments is "<v12>"
    Then  I see the value in row Total and column Other Trustees Number Of Payments is "<v13>" abd value of payment is "<v14>"
    Examples:
      | v1      | v2      | v3      | v4      | v5  | v6      | v7      | v8      | v9      | v10 | v11        | v12        | v13        | v14        |
      | 1       | 1       | 1       | 1       | Yes | 1       | 1       | 1       | 1       | No  | 2          | 2          | 2          | 2          |
      | 10      | 10      | 10      | 10      | Yes | 10      | 10      | 10      | 10      | No  | 20         | 20         | 20         | 20         |
      | 100     | 100     | 100     | 100     | Yes | 100     | 100     | 100     | 100     | No  | 200        | 200        | 200        | 200        |
      | 1000    | 1000    | 1000    | 1000    | Yes | 1000    | 1000    | 1000    | 1000    | No  | 2,000      | 2,000      | 2,000      | 2,000      |
      | 999999  | 999999  | 999999  | 999999  | Yes | 999999  | 999999  | 999999  | 999999  | No  | 1,999,998  | 1,999,998  | 1,999,998  | 1,999,998  |
      | 999998  | 999998  | 999998  | 999998  | Yes | 999998  | 999998  | 999998  | 999998  | No  | 1,999,996  | 1,999,996  | 1,999,996  | 1,999,996  |
      | -1      | -1      | -1      | -1      | Yes | -1      | -1      | -1      | -1      | No  | -2         | -2         | -2         | -2         |
      | -10     | -10     | -10     | -10     | Yes | -10     | -10     | -10     | -10     | No  | -20        | -20        | -20        | -20        |
      | -100    | -100    | -100    | -100    | Yes | -100    | -100    | -100    | -100    | No  | -200       | -200       | -200       | -200       |
      | -1000   | -1000   | -1000   | -1000   | Yes | -1000   | -1000   | -1000   | -1000   | No  | -2,000     | -2,000     | -2,000     | -2,000     |
      | -999999 | -999999 | -999999 | -999999 | Yes | -999999 | -999999 | -999999 | -999999 | No  | -1,999,998 | -1,999,998 | -1,999,998 | -1,999,998 |
      | -999998 | -999998 | -999998 | -999998 | Yes | -999998 | -999998 | -999998 | -999998 | No  | -1,999,996 | -1,999,996 | -1,999,996 | -1,999,996 |

  @sanity
  Scenario Outline: Check the Loss Of Office Payment section with INVALID Entries

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    Then  I see the value in row Total and column Accounting Office Number Of Payments is NOT "<v11>" and value of Payments is NOT "<v12>"
    Then  I see the value in row Total and column Other Trustees Number Of Payments is NOT "<v13>" abd value of payment is NOT "<v14>"
    Examples:Data: Invalid
      | v1      | v2      | v3      | v4      | v5  | v6      | v7      | v8      | v9      | v10 | v11        | v12        | v13        | v14        |
      | 1       | 1       | 1       | 1       | Yes | 1       | 1       | 1       | 1       | No  | 1          | 1          | 21         | 11         |
      | 10      | 10      | 10      | 10      | Yes | 10      | 10      | 10      | 10      | No  | 10         | 10         | 201        | 25         |
      | 100     | 100     | 100     | 100     | Yes | 100     | 100     | 100     | 100     | No  | 100        | 210        | 210        | 205        |
      | 1000    | 1000    | 1000    | 1000    | Yes | 1000    | 1000    | 1000    | 1000    | No  | 1,000      | 2,100      | 2,100      | 2,500      |
      | 999999  | 999999  | 999999  | 999999  | Yes | 999999  | 999999  | 999999  | 999999  | No  | 2,999,998  | 1,599,998  | 1,199,998  | 1,599,998  |
      | 999998  | 999998  | 999998  | 999998  | Yes | 999998  | 999998  | 999998  | 999998  | No  | 1,999,996  | 1,599,996  | 1,199,996  | 1,599,996  |
      | -1      | -1      | -1      | -1      | Yes | -1      | -1      | -1      | -1      | No  | -1         | -21        | -1         | -5         |
      | -10     | -10     | -10     | -10     | Yes | -10     | -10     | -10     | -10     | No  | -10        | -201       | -10        | -50        |
      | -100    | -100    | -100    | -100    | Yes | -100    | -100    | -100    | -100    | No  | -100       | -2001      | -100       | -500       |
      | -1000   | -1000   | -1000   | -1000   | Yes | -1000   | -1000   | -1000   | -1000   | No  | -1,000     | -1,000     | -2,100     | -2,500     |
      | -999999 | -999999 | -999999 | -999999 | Yes | -999999 | -999999 | -999999 | -999999 | No  | -2,999,998 | -1,499,998 | -1,199,998 | -1,599,998 |
      | -999998 | -999998 | -999998 | -999998 | Yes | -999998 | -999998 | -999998 | -999998 | No  | -2,999,996 | -1,499,996 | -1,199,996 | -1,599,996 |


  @sanity
  Scenario Outline: Check the Loss Of Office Payment section for Error Triggering: All Financial Data Rnage
    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:Data: Error : All Financial Data Range
      | v1       | v2       | v3       | v4       | v5  | v6       | v7       | v8       | v9       | v10 | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | Yes | 9999999  | 9999999  | 9999999  | 9999999  | No  | 8     |
      | 1000000  | 1000000  | 1000000  | 1000000  | Yes | 1000000  | 1000000  | 1000000  | 1000000  | No  | 8     |
      | -9999999 | -9999999 | -9999999 | -9999999 | Yes | -9999999 | -9999999 | -9999999 | -9999999 | No  | 8     |
      | -1000000 | -1000000 | -1000000 | -1000000 | Yes | -1000000 | -1000000 | -1000000 | -1000000 | No  | 8     |


  @sanity
  Scenario Outline: Check the Loss Of Office Payment section for Error Triggering: Invalid data format

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:Data: Invalid Data Format
      | v1       | v2        | v3        | v4        | v5  | v6        | v7        | v8        | v9        | v10 | error |
      | &&&&&&&  | &&&&&&&   | &&&&&&&   | &&&&&&&   | Yes | &&&&&&&   | &&&&&&&   | &&&&&&&   | &&&&&&&   | No  | 8     |
      | !!!!!!!  | !!!!!!!   | !!!!!!!   | !!!!!!!   | Yes | !!!!!!!   | !!!!!!!   | !!!!!!!   | !!!!!!!   | No  | 8     |
      | ^^^^^^^^ | -^^^^^^^^ | -^^^^^^^^ | -^^^^^^^^ | Yes | -^^^^^^^^ | -^^^^^^^^ | -^^^^^^^^ | -^^^^^^^^ | No  | 8     |
      | -******* | --******* | --******* | --******* | Yes | --******* | --******* | --******* | --******* | No  | 8     |
      | ???????? | ????????  | ????????  | ????????  | Yes | ????????  | ????????  | ????????  | ????????  | No  | 8     |


#  --------------------------
  @smoke
  Scenario Outline: Check the Loss Of Office Payment section with Valid Credentials

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    Then  I see the value in row Total and column Accounting Office Number Of Payments is "<v11>" and value of Payments is "<v12>"
    Then  I see the value in row Total and column Other Trustees Number Of Payments is "<v13>" abd value of payment is "<v14>"
    Examples:
      | v1      | v2      | v3      | v4      | v5  | v6      | v7      | v8      | v9      | v10 | v11        | v12        | v13        | v14        |
      | -1000   | -1000   | -1000   | -1000   | Yes | -1000   | -1000   | -1000   | -1000   | No  | -2,000     | -2,000     | -2,000     | -2,000     |

  @smoke
  Scenario Outline: Check the Loss Of Office Payment section with INVALID Entries

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    Then  I see the value in row Total and column Accounting Office Number Of Payments is NOT "<v11>" and value of Payments is NOT "<v12>"
    Then  I see the value in row Total and column Other Trustees Number Of Payments is NOT "<v13>" abd value of payment is NOT "<v14>"
    Examples:Data: Invalid
      | v1      | v2      | v3      | v4      | v5  | v6      | v7      | v8      | v9      | v10 | v11        | v12        | v13        | v14        |
      | -1000   | -1000   | -1000   | -1000   | Yes | -1000   | -1000   | -1000   | -1000   | No  | -1,000     | -1,000     | -2,100     | -2,500     |


  @smoke
  Scenario Outline: Check the Loss Of Office Payment section for Error Triggering: All Financial Data Rnage
    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:Data: Error : All Financial Data Range
      | v1       | v2       | v3       | v4       | v5  | v6       | v7       | v8       | v9       | v10 | error |
      | 9999999  | 9999999  | 9999999  | 9999999  | Yes | 9999999  | 9999999  | 9999999  | 9999999  | No  | 8     |



  @smoke
  Scenario Outline: Check the Loss Of Office Payment section for Error Triggering: Invalid data format

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Number Of Payment with a value of "<v1>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Accounting Office Value Of Payment with a value of "<v2>"
    When  I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Number of Payment with a value of "<v3>"
    And   I enter value in ROW Loss of Office Payments - Serving at Year End and Column Other Trustees Value of Payment with a value of "<v4>"
    And   I select value in ROW Loss of Office Payments - Serving at Year End with a drop down value of "<v5>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Number of Payments with a value of "<v6>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Accounting Office Value of Payment with a value of "<v7>"
    When  I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Number of Payments with a value of "<v8>"
    And   I enter value in ROW Loss of Office Payments - Left During the Year and Column Other Trustees Value of Payment with a value of "<v9>"
    And   I select value in ROW Loss of Loss of Office Payments - Left During the Year with a drop down value of "<v10>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:Data: Invalid Data Format
      | v1       | v2        | v3        | v4        | v5  | v6        | v7        | v8        | v9        | v10 | error |
      | &&&&&&&  | &&&&&&&   | &&&&&&&   | &&&&&&&   | Yes | &&&&&&&   | &&&&&&&   | &&&&&&&   | &&&&&&&   | No  | 8     |


  @sofa_references
  Scenario: Testing References for SoFA Staff and Trustees Loss Of Office Payments

    Given I am on SoFA section
    When  I have navigated to Loss Of Office Payments section
    Then I see the correct references are displayed for "s_st_LossOfOfficePay" page of type "Table"
