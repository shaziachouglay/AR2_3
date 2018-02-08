Feature: Testing the bsfod Leases Commitment Under Operating Leases Page


  Scenario Outline: Testing the bsfod Leases Commitment Under Operating Leases Page with Valid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment Under Operating Leases Page

    When  I enter value in row Within one year and all columns with "<v1>" in bsfod_l_cuol
    Then  I see the value in row Within one year and column Total is "<v2>"in bsfod_l_cuol

    When  I enter value in row Within two and five years inclusive  and all columns with "<v1>"in bsfod_l_cuol
    Then  I see the value in row Within two and five years inclusive  and column Total is "<v2>"in bsfod_l_cuol

    When  I enter value in row Over five years and all columns with "<v1>"in bsfod_l_cuol
    Then  I see the value in row Over five years and column Total is "<v2>"in bsfod_l_cuol

    Then  I see value in row Total and all columns with "<v3>"in bsfod_l_cuol
    Then  I see the value in row Total and column Total is "<v4>"in bsfod_l_cuol
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |3   |9   |


  Scenario Outline: Testing the bsfod Leases Commitment Under Operating Leases Page with Invalid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment Under Operating Leases Page

    When  I enter value in row Within one year and all columns with "<v1>" in bsfod_l_cuol
    Then  I see the value in row Within one year and column Total is "<v2>"in bsfod_l_cuol

    When  I enter value in row Within two and five years inclusive  and all columns with "<v1>"in bsfod_l_cuol
    Then  I see the value in row Within two and five years inclusive  and column Total is "<v2>"in bsfod_l_cuol

    When  I enter value in row Over five years and all columns with "<v1>"in bsfod_l_cuol
    Then  I see the value in row Over five years and column Total is "<v2>"in bsfod_l_cuol

    Then  I see value in row Total and all columns with "<v3>"in bsfod_l_cuol
    Then  I see the value in row Total and column Total is "<v4>"in bsfod_l_cuol
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |2   |8   |



  Scenario Outline: Testing the bsfod Leases Commitment Under Operating Leases Page for All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment Under Operating Leases Page

    When  I enter value in row Within one year and all columns with "<v1>" in bsfod_l_cuol
    When  I enter value in row Within two and five years inclusive  and all columns with "<v1>"in bsfod_l_cuol

    When  I enter value in row Over five years and all columns with "<v1>"in bsfod_l_cuol
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1    | error |
      |9999999|9      |



  Scenario Outline: Testing the bsfod Leases Commitment Under Operating Leases Page for Invalid Data Format

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment Under Operating Leases Page

    When  I enter value in row Within one year and all columns with "<v1>" in bsfod_l_cuol
    When  I enter value in row Within two and five years inclusive  and all columns with "<v1>"in bsfod_l_cuol

    When  I enter value in row Over five years and all columns with "<v1>"in bsfod_l_cuol
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1    | error |
      |9999999|9      |
