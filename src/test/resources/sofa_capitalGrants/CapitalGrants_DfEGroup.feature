@fullAndFinal
Feature: Testing the Capital Grants DfE Group page

  @sanity
  Scenario Outline: Testing the Capital Grants DfE Group page with valid credentials

    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    Then  I see the value in field Total is "<v6>" in family capital grants page

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v7      | v8      | v9      | v10     | v11     | v6          |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 10          |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 100         |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 1,000       |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 10,000      |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 5,000       |
      | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 999,990     |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 9,999,980   |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 9,999,990   |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -10         |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -100        |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -1,000      |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -10,000     |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -5,000      |
      | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -999,990    |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -9,999,980  |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -9,999,990  |

  @sanity
  Scenario Outline: Testing the Capital Grants DfE Group page with Invalid credentials

    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    Then  I see the value in field Total is NOT "<v6>" in family capital grants page

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v7      | v8      | v9      | v10     | v6      | v11        |
      | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 1       | 11         |
      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 10      | 110        |
      | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 100     | 1,100      |
      | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 1000    | 10,100     |
      | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 500     | 5,010      |
      | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 99999   | 999,190    |
      | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 999998  | 9,991,980  |
      | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 999999  | 9,991,990  |
      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -1      | -11        |
      | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -10     | -110       |
      | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -100    | -1,100     |
      | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -1000   | -10,100    |
      | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -500    | -5,100     |
      | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -99999  | -991,990   |
      | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -999998 | -991,980   |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -9,199,990 |

  @sanity
  Scenario Outline: Testing the Capital Grants DfE Group page  FOR Errors Financial Data Range

    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: ERORRS Checking : Financial Data Range Errors
      | v1       | v2       | v3       | v4       | v7       | v8       | v9       | v10      | v5       | error | v11      |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 10    | 9999999  |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 10    | 1000000  |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 10    | -9999999 |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 10    | -1000000 |

  @sanity
  Scenario Outline: Testing the Capital Grants DfE Group page  FOR Errors INVALID Data Format
    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: ERORRS Checking: INVALID Data Format
      | v1       | v2       | v3       | v4       | v7       | v8       | v9       | v10      | v5       | v11     | error |
      | 999a999  | £999999  | 9999^99  | 10£0000  | 10£0000  | 10£0000  | 10£0000  | 10£0000  | 10£0000  | 10£0000 | 10    |
      | 100*000  | £000000  | 1000^00  | 1000O00  | 1000A00  | 1000O00  | 1000O00  | 1000O00  | 10£0000  | 10£0000 | 10    |
      | -99(9999 | -£999999 | -9a99999 | -9999*99 | -1000A00 | -1000A00 | -1000A00 | -1000A00 | -10£0000 | 10£0000 | 10    |
      | -10£0000 | -100a000 | -1a00000 | -1000A00 | -£000000 | -1000A00 | -1000A00 | -1000A00 | -10£0000 | 10£0000 | 10    |

  @smoke
  Scenario Outline: Testing the Capital Grants DfE Group page with valid credentials

    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    Then  I see the value in field Total is "<v6>" in family capital grants page

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v7      | v8      | v9      | v10     | v11     | v6          |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -9,999,990  |

  @smoke
  Scenario Outline: Testing the Capital Grants DfE Group page with Invalid credentials

    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    Then  I see the value in field Total is NOT "<v6>" in family capital grants page

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v7      | v8      | v9      | v10     | v6      | v11        |
      | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -999999 | -9,199,990 |


  @smoke
  Scenario Outline: Testing the Capital Grants DfE Group page  FOR Errors Financial Data Range

    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples: ERORRS Checking : Financial Data Range Errors
      | v1       | v2       | v3       | v4       | v7       | v8       | v9       | v10      | v5       | error | v11      |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 10    | 9999999  |


  @smoke
  Scenario Outline: Testing the Capital Grants DfE Group page  FOR Errors INVALID Data Format
    Given I am on SoFA section
    And   I have navigated to the Capital Grants Section
    And   I have navigated to the DfE Group page
    When  I enter value in field National College for Teaching and Leadership with "<v1>"
    And   I enter value in field Standards and Testing Agency with "<v2>"
    And   I enter value in field Equality and Human Rights Commission with "<v3>"
    And   I enter value in field Office of the Children's Commissioner with "<v4>"
    And   I enter value in field Student Loan Company with "<v7>"
    And   I enter value in field Higher Education Funding Council for England "<v8>"
    And   I enter value in field Office for Fair Access with "<v9>"
    And   I enter value in field Engineering Construction Industry Training Board "<v10>"
    And   I enter value in field Construction Industry Training Board with "<v11>"
    And   I enter value in field Skills Funding Agency with "<v5>"
    And   I wait for page to load
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples: ERORRS Checking: INVALID Data Format
      | v1       | v2       | v3       | v4       | v7       | v8       | v9       | v10      | v5       | v11     | error |
      | 999a999  | £999999  | 9999^99  | 10£0000  | 10£0000  | 10£0000  | 10£0000  | 10£0000  | 10£0000  | 10£0000 | 10    |







