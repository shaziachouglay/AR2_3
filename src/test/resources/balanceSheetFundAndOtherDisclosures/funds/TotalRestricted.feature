Feature: Testing the Total Restricted Page in BSFOD

  Scenario Outline: Testing the Total Restricted Page with Valid Data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Total Restricted page
    Then  I see the value in field Original prior year closing balance  is "<v1>" in bsfod_tr
    Then  I see the value in field Adjustments made in to the opening balance is "<v1>" in bsfod_tr
    Then  I see the value in field Incoming resources is "<v1>" in bsfod_tr
    Then  I see the value in field Resources expended is "<v1>" in bsfod_tr
    Then  I see the value in field Transfers on conversion is "<v1>" in bsfod_tr
    Then  I see the value in field Transfers in or out of existing academies is "<v1>" in bsfod_tr
    Then  I see the value in field Transfer between funds is "<v1>" in bsfod_tr
    Then  I see the value in field Other gains, losses and transfers is "<v1>" in bsfod_tr
    Then  I see the value in field Overall Total is "<v1>" in bsfod_tr
    Examples:
      | v1 |


