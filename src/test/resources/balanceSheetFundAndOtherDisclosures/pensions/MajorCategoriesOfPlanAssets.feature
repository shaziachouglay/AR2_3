Feature: testing Major Categories of Plan Assets in pensions section

  Scenario Outline:testing Major Categories of Plan Assets in pensions section with Valid Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Categories of Plan Assets page
    And    I enter value in row Equities and column Value with "<v1>" in MCOPA
    And    I enter value in row Gilts and column Value with "<v2>" in MCOPA
    And    I enter value in row Corporate Bonds and column Value with "<v3>" in MCOPA
    And    I enter value in row Property and column Value with "<v4>" in MCOPA
    And    I enter value in row Cash and Other Liquid Assets and column Value with "<v5>" in MCOPA
    And    I enter value in row Derivatives and column Value with "<v6>" in MCOPA
    And    I enter value in row Investment Funds and column Value with "<v7>" in MCOPA
    And    I enter value in row Asset Backed Securities and column Value with "<v8>" in MCOPA
    And    I enter value in row Other and column Value with "<v9>" in MCOPA
    Then   I see value in row Total and column Value with "<v10>" in MCOPA
    And    I click on the next
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 |
#     data to be provided

  Scenario Outline:testing Major Categories of Plan Assets in pensions section with Invalid Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Categories of Plan Assets page
    And    I enter value in row Equities and column Value with "<v1>" in MCOPA
    And    I enter value in row Gilts and column Value with "<v2>" in MCOPA
    And    I enter value in row Corporate Bonds and column Value with "<v3>" in MCOPA
    And    I enter value in row Property and column Value with "<v4>" in MCOPA
    And    I enter value in row Cash and Other Liquid Assets and column Value with "<v5>" in MCOPA
    And    I enter value in row Derivatives and column Value with "<v6>" in MCOPA
    And    I enter value in row Investment Funds and column Value with "<v7>" in MCOPA
    And    I enter value in row Asset Backed Securities and column Value with "<v8>" in MCOPA
    And    I enter value in row Other and column Value with "<v9>" in MCOPA
    Then   I see value in row Total and column Value is NOT "<v10>" in MCOPA

    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 |
#     data to be provided

  Scenario Outline:testing Major Categories of Plan Assets in pensions section with Errors All Financial Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Categories of Plan Assets page
    And    I enter value in row Equities and column Value with "<v1>" in MCOPA
    And    I enter value in row Gilts and column Value with "<v2>" in MCOPA
    And    I enter value in row Corporate Bonds and column Value with "<v3>" in MCOPA
    And    I enter value in row Property and column Value with "<v4>" in MCOPA
    And    I enter value in row Cash and Other Liquid Assets and column Value with "<v5>" in MCOPA
    And    I enter value in row Derivatives and column Value with "<v6>" in MCOPA
    And    I enter value in row Investment Funds and column Value with "<v7>" in MCOPA
    And    I enter value in row Asset Backed Securities and column Value with "<v8>" in MCOPA
    And    I enter value in row Other and column Value with "<v9>" in MCOPA
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | error |
#     data to be provided

  Scenario Outline:testing Major Categories of Plan Assets in pensions section with Errors Invalid Data Format

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Major Categories of Plan Assets page
    And    I enter value in row Equities and column Value with "<v1>" in MCOPA
    And    I enter value in row Gilts and column Value with "<v2>" in MCOPA
    And    I enter value in row Corporate Bonds and column Value with "<v3>" in MCOPA
    And    I enter value in row Property and column Value with "<v4>" in MCOPA
    And    I enter value in row Cash and Other Liquid Assets and column Value with "<v5>" in MCOPA
    And    I enter value in row Derivatives and column Value with "<v6>" in MCOPA
    And    I enter value in row Investment Funds and column Value with "<v7>" in MCOPA
    And    I enter value in row Asset Backed Securities and column Value with "<v8>" in MCOPA
    And    I enter value in row Other and column Value with "<v9>" in MCOPA
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | error |
#     data to be provided