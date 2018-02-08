Feature: Testing the Operating Leases Further Analysis page

  Scenario Outline: Testing the Operating Leases Further Analysis Page with Valid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Operating Leases Further Analysis Page

#    LAND
    And   I enter value in section Land and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Within one year and column Total is "<v2>" in bsfod_l_olfa

    And   I enter value in section Land and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Within two and five years inclusive  and column Total is "<v2>" in bsfod_l_olfa

    And   I enter value in section Land and row Over five years and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Over five years and column Total is "<v2>" in bsfod_l_olfa


#    BUILDINGS
    And   I enter value in section Buildings and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Within one year and column Total is "<v2>" in bsfod_l_olfa

    And   I enter value in section Buildings and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Within two and five years inclusive  and column Total is "<v2>" in bsfod_l_olfa

    And   I enter value in section Buildings and row Over five years and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Over five years and column Total is "<v2>" in bsfod_l_olfa

#    OTHER
    And   I enter value in section Other and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Within one year and column Total is "<v2>" in bsfod_l_olfa

    And   I enter value in section Other and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Within two and five years inclusive  and column Total is "<v2>" in bsfod_l_olfa

    And   I enter value in section Other and row Over five years and all columns with "<v1>" in bsfod_l_olfa
    Then  I see value in row Over five years and column Total is "<v2>" in bsfod_l_olfa


    Then  I see value in row Total and all Columns is "<v3>"in bsfod_l_olfa
    Then  I see value in row Total and column Total is "<v4>" in bsfod_l_olfa
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |9   |27  |


    Scenario Outline: Testing the Operating Leases Further Analysis Page with invalid data

      Given I am on Balance Sheet Funds and Other Disclosure Section
      And   I navigate to Leases Operating Leases Further Analysis Page

#    LAND
      And   I enter value in section Land and row Within one year and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Within one year and column Total is NOT "<v2>" in bsfod_l_olfa

      And   I enter value in section Land and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Within two and five years inclusive  and column Total is NOT "<v2>" in bsfod_l_olfa

      And   I enter value in section Land and row Over five years and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Over five years and column Total is NOT "<v2>" in bsfod_l_olfa


#    BUILDINGS
      And   I enter value in section Buildings and row Within one year and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Within one year and column Total is NOT "<v2>" in bsfod_l_olfa

      And   I enter value in section Buildings and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Within two and five years inclusive  and column Total is NOT "<v2>" in bsfod_l_olfa

      And   I enter value in section Buildings and row Over five years and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Over five years and column Total is NOT "<v2>" in bsfod_l_olfa

#    OTHER
      And   I enter value in section Other and row Within one year and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Within one year and column Total is NOT "<v2>" in bsfod_l_olfa

      And   I enter value in section Other and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Within two and five years inclusive  and column Total is NOT "<v2>" in bsfod_l_olfa

      And   I enter value in section Other and row Over five years and all columns with "<v1>" in bsfod_l_olfa
      Then  I see value in row Over five years and column Total is NOT "<v2>" in bsfod_l_olfa


      Then  I see value in row Total and all Columns is "<v3>"in bsfod_l_olfa
      Then  I see value in row Total and column Total is NOT "<v4>" in bsfod_l_olfa
      Examples:
        | v1 | v2 | v3 | v4 |
        |1   |2   |8   |26  |



  Scenario Outline: Testing the Operating Leases Further Analysis Page with All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Operating Leases Further Analysis Page

#    LAND
    And   I enter value in section Land and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Land and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Land and row Over five years and all columns with "<v1>" in bsfod_l_olfa


#    BUILDINGS
    And   I enter value in section Buildings and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Buildings and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Buildings and row Over five years and all columns with "<v1>" in bsfod_l_olfa


#    OTHER
    And   I enter value in section Other and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Other and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olf
    And   I enter value in section Other and row Over five years and all columns with "<v1>" in bsfod_l_olfa
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1     | error |
      |9999999 |27     |


  Scenario Outline: Testing the Operating Leases Further Analysis Page with Invalid Data Format Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Operating Leases Further Analysis Page

#    LAND
    And   I enter value in section Land and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Land and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Land and row Over five years and all columns with "<v1>" in bsfod_l_olfa


#    BUILDINGS
    And   I enter value in section Buildings and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Buildings and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Buildings and row Over five years and all columns with "<v1>" in bsfod_l_olfa


#    OTHER
    And   I enter value in section Other and row Within one year and all columns with "<v1>" in bsfod_l_olfa
    And   I enter value in section Other and row Within two and five years inclusive  and all columns with "<v1>" in bsfod_l_olf
    And   I enter value in section Other and row Over five years and all columns with "<v1>" in bsfod_l_olfa
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | error |
      |*** |27     |


