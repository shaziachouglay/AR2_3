Feature: Testing the Funds Total Funds Page


  Scenario Outline: Testing the Funds Total Funds Page with valid credentials

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Funds Total Funds page

    Then  I must see value in field Original prior year closing balance  is "<v1>" in bsfod_funds_tr
    Then  I must see value in field Adjustments made in to the opening balance is "<v2>" in bsfod_funds_tr
    Then  I must see value in field Incoming resources is "<v3>" in bsfod_funds_tr
    Then  I must see value in field Resources expended is "<v4>" in bsfod_funds_tr
    Then  I must see value in field Transfers on conversion is "<v5>" in bsfod_funds_tr
    Then  I must see value in field Transfers in or out of existing academies is "<v6>" in bsfod_funds_tr
    Then  I must see value in field Transfer between funds is "<v7>" in bsfod_funds_tr
    Then  I must see value in field Other gains, losses and transfers is "<v8>" in bsfod_funds_tr
    Then  I must see value in field Overall Total is "<v9>" in bsfod_funds_tr
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 |
