Feature: testing the Breakdown of SoFA Pension Charge

  Scenario Outline: testing the Breakdown of SoFA Pension Charge with Valid Credentials

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Breakdown of SoFA pension charge page in Pensions BOSPC
    And    I enter value in field LGPS with "<v1>" in Pensions BOSPC
    And    I enter value in field Teachers Pension Scheme with "<v2>" in Pensions BOSPC
    And    I enter value in field Defined Contribution scheme with "<v3>" in Pensions BOSPC
    And    I enter value in field Stakeholder or private pension with "<v4>" in Pensions BOSPC
    Then   I must see the Total field is "<v5>" in Pensions BOSPC
    And    I enter value in field Number of paid trustees who were not part of a main pension scheme with "<v6>" in Pensions BOSPC
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 |
      |1   |1   |1   |1   |4   |1   |




  Scenario Outline: testing the Breakdown of SoFA Pension Charge with Invalid Credentials

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Breakdown of SoFA pension charge page
    And    I enter value in field LGPS with "<v1>" in Pensions BOSPC
    And    I enter value in field Teachers Pension Scheme with "<v2>" in Pensions BOSPC
    And    I enter value in field Defined Contribution scheme with "<v3>" in Pensions BOSPC
    And    I enter value in field Stakeholder or private pension with "<v4>" in Pensions BOSPC
    Then   I must see the Total field is NOT "<v5>" in Pensions BOSPC
    And    I enter value in field Number of paid trustees who were not part of a main pension scheme with "<v6>" in Pensions BOSPC
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 |
      |1   |1   |1   |1   |3   |1   |



  Scenario Outline: testing the Breakdown of SoFA Pension Charge for Errors All Financial Data Error

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Breakdown of SoFA pension charge page
    And    I enter value in field LGPS with "<v1>" in Pensions BOSPC
    And    I enter value in field Teachers Pension Scheme with "<v2>" in Pensions BOSPC
    And    I enter value in field Defined Contribution scheme with "<v3>" in Pensions BOSPC
    And    I enter value in field Stakeholder or private pension with "<v4>" in Pensions BOSPC
    And    I enter value in field Number of paid trustees who were not part of a main pension scheme with "<v6>" in Pensions BOSPC
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | error | v6 |
      |1   |1   |1   |1   |4      |1   |


  Scenario Outline: testing the Breakdown of SoFA Pension Charge for Errors Invalid data Format

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Breakdown of SoFA pension charge page
    And    I enter value in field LGPS with "<v1>" in Pensions BOSPC
    And    I enter value in field Teachers Pension Scheme with "<v2>" in Pensions BOSPC
    And    I enter value in field Defined Contribution scheme with "<v3>" in Pensions BOSPC
    And    I enter value in field Stakeholder or private pension with "<v4>" in Pensions BOSPC
    And    I enter value in field Number of paid trustees who were not part of a main pension scheme with "<v6>" in Pensions BOSPC
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | error | v6 |
      |1   |1   |1   |1   |4      |1   |



