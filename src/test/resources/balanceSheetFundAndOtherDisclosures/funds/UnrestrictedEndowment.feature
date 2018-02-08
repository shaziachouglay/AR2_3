Feature: Testing the Unrestricted Endowment page

  Scenario Outline: Testing the Unrestricted Endowment Page with Valid data


    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Unrestricted Endowments page

    When  I enter value in row Original prior year closing balance  and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Original prior year closing balance  and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Adjustments made to the opening balance and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Adjustments made to the opening balance and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Incoming Resources and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Incoming Resources and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Resources Expended and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Resources Expended and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Transfers on conversion and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Transfers on conversion and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Transfers in or out of existing academies and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Transfers in or out of existing academies and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Gross transfer between funds and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Gross transfer between funds and column Total is "<v2>" in bsfod_ue

    When  I enter value in row Other gains, losses and transfers  and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Other gains, losses and transfers  and column Total is "<v2>" in bsfod_ue

    Then  I see value in row Balance at period end and all columns with "<v3>" in bsfod_ue
    Then  I see value in row Balance at period end and column Total is "<v4>" in bsfod_ue
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |2   |8   |16  |


  Scenario Outline: Testing the Unrestricted Endowment Page with Invalid data


    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Unrestricted Endowments page

    When  I enter value in row Original prior year closing balance  and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Original prior year closing balance  and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Adjustments made to the opening balance and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Adjustments made to the opening balance and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Incoming Resources and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Incoming Resources and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Resources Expended and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Resources Expended and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Transfers on conversion and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Transfers on conversion and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Transfers in or out of existing academies and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Transfers in or out of existing academies and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Gross transfer between funds and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Gross transfer between funds and column Total is NOT "<v2>" in bsfod_ue

    When  I enter value in row Other gains, losses and transfers  and all columns with "<v1>" in bsfod_ue
    Then  I see value in row Other gains, losses and transfers  and column Total is NOT "<v2>" in bsfod_ue

    Then  I see value in row Balance at period end and all columns with NOT "<v3>" in bsfod_ue
    Then  I see value in row Balance at period end and column Total is NOT "<v4>" in bsfod_ue
    Examples:
      | v1 | v2 | v3 | v4 |
      |1   |3   |7   |15  |

