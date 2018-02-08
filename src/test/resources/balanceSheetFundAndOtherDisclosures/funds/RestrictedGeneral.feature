Feature: Testing the Restricted General Page

  Scenario Outline: Testing the Restricted General Page with Valid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted General page

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Original prior year closing balance and column total is "<v2>" in BSFOD_RG


    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Adjustments made in to the opening balance and column total is "<v2>" in BSFOD_RG

    And   I enter value in row Incoming Resources and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Incoming Resources and column total is "<v2>" in BSFOD_RG

    And   I enter value in row Resources Expended and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Resources Expended and column total is "<v2>" in BSFOD_RG

    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Transferred in on conversion and column total is "<v2>" in BSFOD_RG

    And   I enter value in row Transferred in or out of existing academies and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Transferred in or out of existing academies and column total is "<v2>" in BSFOD_RG

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Gross transfer between funds and column total is "<v2>" in BSFOD_RG

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Other gains losses and transfers  and column total is "<v2>" in BSFOD_RG

    Then  I see value in row Balance at period end and all columns with "<v3>" in BSFOD_RG
    Then  I must see value in row Balance at period end and column total is "<v4>" in BSFOD_RG
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |5   |8   |40  |


  Scenario Outline: Testing the Restricted General Page with Invalid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted General page

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Original prior year closing balance and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Adjustments made in to the opening balance and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Incoming Resources and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Incoming Resources and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Resources Expended and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Resources Expended and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Transferred in on conversion and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Transferred in or out of existing academies and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Transferred in or out of existing academies and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Gross transfer between funds and column total is NOT "<v2>" in BSFOD_RG

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in BSFOD_RG
    Then  I must see value in row Other gains losses and transfers  and column total is NOT "<v2>" in BSFOD_RG

    Then  I see value in row Balance at period end and all columns are NOT "<v3>" in BSFOD_RG
    Then  I must see value in row Balance at period end and column total is NOT "<v4>" in BSFOD_RG
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |4   |7   |41  |



  Scenario Outline: Testing the Restricted General Page for  All Financial Data Errors

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted General page

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Incoming Resources and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Resources Expended and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Transferred in or out of existing academies and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in BSFOD_RG
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

  Examples:
    |v1     |error|
    |9999999|40   |



  Scenario Outline: Testing the Restricted General Page for  Invalid Data Format Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Restricted General page

    And   I enter value in row Original prior year closing balance and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Adjustments made in to the opening balance and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Incoming Resources and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Resources Expended and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Transferred in on conversion and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Transferred in or out of existing academies and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Gross transfer between funds and all columns with "<v1>" in BSFOD_RG

    And   I enter value in row Other gains losses and transfers  and all columns with "<v1>" in BSFOD_RG
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      |v1     |error|
      |*******|40   |
