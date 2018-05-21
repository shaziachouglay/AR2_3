@fullAndFinal
Feature: Testing Sofa Provision Of Boarding Activities Income Page

  @sanity
  Scenario Outline: testing the Provision of Boarding Activities Income page VALID Entries

    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    Then   I see the input value in field with fieldset Total with "<v10>"

    Examples: Testing with valid entries
      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      | v10        |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 9          |
      |5        |5        |5        |5        |5        |5        |5        |5        |5        | 45         |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 90         |
      |50       |50       |50       |50       |50       |50       |50       |50       |50       | 450        |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 900        |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 4,500      |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 9,000      |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 8,999,982  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 8,999,991  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -9         |
      |-5       |-5       |-5       |-5       |-5       |-5       |-5       |-5       |-5       | -45        |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -90        |
      |-50      |-50      |-50      |-50      |-50      |-50      |-50      |-50      |-50      | -450       |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -900       |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -4,500     |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -9,000     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -8,999,982 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -8,999,991 |


  @sanity
  Scenario Outline: testing the Provision of Boarding Activities Income page INVALID Entries

    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    Then   I see the input value in field with fieldset Total is NOT with "<v10>"

    Examples: Testing with invalid entries
      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      | v10        |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 8          |
      |5        |5        |5        |5        |5        |5        |5        |5        |5        | 8          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 80         |
      |50       |50       |50       |50       |50       |50       |50       |50       |50       | 55         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 800        |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 3,500      |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 8,000      |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 7,999,982  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 7,999,991  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -8         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -80        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100       |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -2,500     |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -2,000     |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -8,299,982 |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -8,299,991 |


  @sanity
  Scenario Outline: Testing SoFa  Provision Of Boarding Activities  Income  for All Financial Data Range Error

    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Testing the Error for Financial Data range
      | v1       | v2       | v3       | v4       | v5       | v6       | v7       | v8       | v9       | error |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 9     |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9     |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 9     |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 9     |
      |9999998   |9999998   |9999998   |9999998   |9999998   |9999998   |9999998   |9999998   |9999998   | 9     |
      |-9999998  |-9999998  |-9999998  |-9999998  |-9999998  |-9999998  |-9999998  |-9999998  |-9999998  | 9     |



  @sanity
  Scenario Outline: Testing SoFa  Provision Of Boarding Activities > Income Checking Error Triggering Invalid Format
    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    And    I wait for page to load
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: DATA Errors Invalid Data Format SoFa > Provision Of Boarding Activities Income
      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      |error|
      | 1a00000 | 1*00000 | £000000 | 100000e | 1o00000 | 1000*00 | 100%000 | 10!0000 | 1&00000 |9    |
      |£££££££  |£££££££  |£££££££  |£££££££  |£££££££  |£££££££  |£££££££  |£££££££  |£££££££  |9    |
      |*******  |*******  |*******  |*******  |*******  |*******  |*******  |*******  |*******  |9    |
      |???????  |???????  |???????  |???????  |???????  |???????  |???????  |???????  |???????  |9    |
      |$$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$$  |9    |
      |&&&&&&&  |&&&&&&&  |&&&&&&&  |&&&&&&&  |&&&&&&&  |&&&&&&&  |&&&&&&&  |&&&&&&&  |&&&&&&&  |9    |
      |OOOOOOO  |OOOOOOO  |OOOOOOO  |OOOOOOO  |OOOOOOO  |OOOOOOO  |OOOOOOO  |OOOOOOO  |OOOOOOO  |9    |
      | £££££££ | 1*00000 | £000000 | 100000e | 1o00000 | 1000*00 | 100%000 | 10!0000 | 1&00000 |9    |
      | 1a00000 | 1*00000 | £000000 | 100000e | 1o00000 | 1000*00 | 100%000 | 10!0000 | 1&00000 |9    |


#----------------------

  @smoke
  Scenario Outline: testing the Provision of Boarding Activities Income page VALID Entries

    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    Then   I see the input value in field with fieldset Total with "<v10>"

    Examples: Testing with valid entries
      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      | v10        |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 8,999,991  |

  @smoke
  Scenario Outline: testing the Provision of Boarding Activities Income page INVALID Entries

    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    Then   I see the input value in field with fieldset Total is NOT with "<v10>"

    Examples: Testing with invalid entries
      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      | v10        |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -2,000     |


  @smoke
  Scenario Outline: Testing SoFa  Provision Of Boarding Activities  Income  for All Financial Data Range Error

    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: Testing the Error for Financial Data range
      | v1       | v2       | v3       | v4       | v5       | v6       | v7       | v8       | v9       | error |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 9     |

  @smoke
  Scenario Outline: Testing SoFa  Provision Of Boarding Activities > Income Checking Error Triggering Invalid Format
    Given  I am on SoFA section
    And    I have navigates to the Provision Of Activities Income page
    And    I input value in field with fieldset Fee Income with "<v1>"
    And    I input value in field with fieldset Grants - DfE/EFA with "<v2>"
    And    I input value in field with Grants - National College for Teaching and Learning NCTL with "<v3>"
    And    I input value in field with fieldset Grants - Standards and Teaching Agency STA with "<v4>"
    And    I input value in field with fieldset Grants - Skills Funding Agency SFA with "<v5>"
    And    I input value in field with fieldset Grants - Equality and Human Rights Commission EHRC with "<v6>"
    And    I input value in field with fieldset Grants - Office of the Children's Commissioner OCC with "<v7>"
    And    I input value in field with fieldset Grants-Other Government  with "<v8>"
    And    I input value in field with fieldset Other Income with "<v9>"
    And    I wait for page to load
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: DATA Errors Invalid Data Format SoFa > Provision Of Boarding Activities Income
      | v1      | v2      | v3      | v4      | v5      | v6      | v7      | v8      | v9      |error|
      | 1a00000 | 1*00000 | £000000 | 100000e | 1o00000 | 1000*00 | 100%000 | 10!0000 | 1&00000 |9    |


  @sofa_references
  Scenario: Testing References for SOFA Provision Of Boarding Activities Income Page

    Given I am on SoFA section
    And   I have navigates to the Provision Of Activities Expenditure page
    Then I see the correct references are displayed for "s_pba_Exp" page of type "Label"