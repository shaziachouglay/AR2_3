@fullAndFinal
Feature:Testing the Revenue Grants DfE Group page

  @sanity
  Scenario Outline: Testing the Revenue Grants DfE Group page with valid credentials

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the value in field Total is "<v11>" in family capital grants page in revenue grants dfe group
    Examples:
      | v1    | v2    | v3    | v4    | v5    | v6    | v7    | v8    | v9    | v10   | v11     |
      | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 10      |
      | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 100     |
      | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 1,000   |
      | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 10,000  |
      | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 5,000   |
      | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -10     |
      | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -100    |
      | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -1,000  |
      | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -10,000 |
      | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -5,000  |

  @sanity
  Scenario Outline: Testing the Revenue Grants DfE Group page with Invalid credentials

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the value in field Total is NOT "<v11>" in family capital grants page in revenue grants dfe group

    Examples:
      | v1    | v2    | v3    | v4    | v5    | v6    | v7    | v8    | v9    | v10   | v11     |
      | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 1     | 11      |
      | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 10    | 100   | 101     |
      | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 100   | 1000  | 1,100   |
      | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 1000  | 10,100  |
      | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 500   | 5,010   |
      | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -20     |
      | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -10   | -120    |
      | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -1000 | -1,200  |
      | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -1000 | -10,200 |
      | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -500  | -5,020  |

  @sanity
  Scenario Outline: Testing the Revenue Grants page with out of range number errors

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the number of errors starting with  All financial data must be entered are "<numberOfErrors>"
    Examples:
      | v1       | v2       | v3       | v4       | v5       | v6       | v7       | v8       | v9       | v10     | numberOfErrors |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999 | 10             |
      | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 1000000  | 9999999 | 10             |
      | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999998  | 9999999 | 10             |
      | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | -9999999 | 9999999 | 10             |
      | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | -1000000 | 9999999 | 10             |
      | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | -9999998 | 9999999 | 10             |

  @sanity
  Scenario Outline: Testing the Revenue Grants DfE Group page for misformatted input errors

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the number of errors starting with  Invalid Number Format are "<numberOfErrors>"
    Examples:
      | v1     | v2     | v3     | v4     | v5     | v6     | v7     | v8     | v9     | v10    | numberOfErrors |
      | test!  | test!  | test!  | test!  | test!  | test!  | test!  | test!  | test!  | test!  | 10             |
      | *****  | *****  | *****  | *****  | *****  | *****  | *****  | *****  | *****  | *****  | 10             |
      | %%%%%% | %%%%%% | %%%%%% | %%%%%% | %%%%%% | %%%%%% | %%%%%% | %%%%%% | %%%%%% | %%%%%% | 10             |
      | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | ^^^^^^ | 10             |
      | &&&&&& | &&&&&& | &&&&&& | &&&&&& | &&&&&& | &&&&&& | &&&&&& | &&&&&& | &&&&&& | &&&&&& | 10             |

#----------------------

  @smoke
  Scenario Outline: Testing the Revenue Grants DfE Group page with valid credentials

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the value in field Total is "<v11>" in family capital grants page in revenue grants dfe group
    Examples:
      | v1    | v2    | v3    | v4    | v5    | v6    | v7    | v8    | v9    | v10   | v11     |
      | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -100  | -1,000  |

  @smoke
  Scenario Outline: Testing the Revenue Grants DfE Group page with Invalid credentials

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the value in field Total is NOT "<v11>" in family capital grants page in revenue grants dfe group

    Examples:
      | v1    | v2    | v3    | v4    | v5    | v6    | v7    | v8    | v9    | v10   | v11     |
      | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -1    | -20     |

  @smoke
  Scenario Outline: Testing the Revenue Grants page with out of range number errors

    Given I am on SoFA section
    And   I have navigated to the Revenue Grants DFE Group Page
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the number of errors starting with  All financial data must be entered are "<numberOfErrors>"
    Examples:
      | v1       | v2       | v3       | v4       | v5       | v6       | v7       | v8       | v9       | v10     | numberOfErrors |
      | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999  | 9999999 | 10             |

  @smoke
  Scenario Outline: Testing the Revenue Grants DfE Group page for misformatted input errors

    Given I am on SoFA section
    And   I have navigated to Family Capital Grants section
    When  I enter value in field National College for Teaching and Leadership with "<v1>" in revenue grants dfe group
    And   I enter value in field Standards and Testing Agency with "<v2>" in revenue grants dfe group
    And   I enter value in field Equality and Human Rights Commission with "<v3>" in revenue grants dfe group
    And   I enter value in field Office of the Children's Commissioner with "<v4>" in revenue grants dfe group
    And   I enter value in field Student Loan Company with "<v5>" in revenue grants dfe group
    And   I enter value iin field Higher Education Funding Council for England with "<v6>" in revenue grants dfe group
    And   I enter value in field office for Fair Affairs with "<v7>" in revenue grants dfe group
    And   I enter value in field Engineering Construction industry with "<v8>" in revenue grants dfe group
    And   I enter value in field Construction Industry Training Board with "<v9>" in revenue grants dfe group
    And   I enter value in field Skills Funding Agency with "<v10>" in revenue grants dfe group
    Then  I see the number of errors starting with  Invalid Number Format are "<numberOfErrors>"
    Examples:
      | v1     | v2     | v3     | v4     | v5     | v6     | v7     | v8     | v9     | v10    | numberOfErrors |
      | test!  | test!  | test!  | test!  | test!  | test!  | test!  | test!  | test!  | test!  | 10             |

