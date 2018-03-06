Feature: Testing the Analysis of Net Assets Between Funds in Balance Sheet Funds and Other Disclosure

  Scenario Outline:Testing the Analysis of Net Assets Between Funds in Balance Sheet Funds and Other Disclosure with valid data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Analysis of Net Assets Between Funds page

    And   I enter in row Fixed Assets and all columns with value "<r1c1>" "<r1c2>" "<r1c3>" "<r1c4>" in AONABF
    And   I enter in row Current Assets and all columns with value "<r2c1>" "<r2c2>" "<r2c3>" "<r2c4>"in AONABF
    And   I enter in row Current Liabilities and all columns with value "<r3c1>" "<r3c2>" "<r3c3>" "<r3c4>"in AONABF
    And   I enter in row Creditor greater than one year and all columns with value "<r4c1>" "<r4c2>" "<r4c3>" "<r4c4>"in AONABF
    And   I enter in row Provisions and all columns with value "<r5c1>" "<r5c2>" "<r5c3>" "<r5c4>"in AONABF
    And   I enter in row Pension scheme liabilities and all columns with value "<r6c1>" "<r6c2>" "<r6c3>" "<r6c4>"in AONABF
    Then  I see in row Total and all columns with value "<r7c1>" "<r7c2>" "<r7c3>" "<r7c4>"in AONABF
    And   I click on the next

    Examples:
      | r1c1 | r1c2 | r1c3 | r1c4 | r2c1 | r2c2 | r2c3 | r2c4 | r3c1 | r3c2 | r3c3 | r3c4 | r4c1 | r4c2 | r4c3 | r4c4 | r5c1 | r5c2 | r5c3 | r5c4 | r6c1 | r6c2 | r6c3 | r6c4 | r7c1 | r7c2 | r7c3 | r7c4 |
#     data to be provided

  Scenario Outline:Testing the Analysis of Net Assets Between Funds in Balance Sheet Funds and Other Disclosure with invalid data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Analysis of Net Assets Between Funds page

    And   I enter in row Fixed Assets and all columns with value "<r1c1>" "<r1c2>" "<r1c3>" "<r1c4>" in AONABF
    And   I enter in row Current Assets and all columns with value "<r2c1>" "<r2c2>" "<r2c3>" "<r2c4>"in AONABF
    And   I enter in row Current Liabilities and all columns with value "<r3c1>" "<r3c2>" "<r3c3>" "<r3c4>"in AONABF
    And   I enter in row Creditor greater than one year and all columns with value "<r4c1>" "<r4c2>" "<r4c3>" "<r4c4>"in AONABF
    And   I enter in row Provisions and all columns with value "<r5c1>" "<r5c2>" "<r5c3>" "<r5c4>"in AONABF
    And   I enter in row Pension scheme liabilities and all columns with value "<r6c1>" "<r6c2>" "<r6c3>" "<r6c4>"in AONABF
    Then  I see in row Total and all columns with value are not  "<r7c1>" "<r7c2>" "<r7c3>" "<r7c4>"in AONABF

    Examples:
      | r1c1 | r1c2 | r1c3 | r1c4 | r2c1 | r2c2 | r2c3 | r2c4 | r3c1 | r3c2 | r3c3 | r3c4 | r4c1 | r4c2 | r4c3 | r4c4 | r5c1 | r5c2 | r5c3 | r5c4 | r6c1 | r6c2 | r6c3 | r6c4 | r7c1 | r7c2 | r7c3 | r7c4 |
#     data to be provided


  Scenario Outline:Testing the Analysis of Net Assets Between Funds in Balance Sheet Funds and Other Disclosure with All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Analysis of Net Assets Between Funds page

    And   I enter in row Fixed Assets and all columns with value "<r1c1>" "<r1c2>" "<r1c3>" "<r1c4>" in AONABF
    And   I enter in row Current Assets and all columns with value "<r2c1>" "<r2c2>" "<r2c3>" "<r2c4>"in AONABF
    And   I enter in row Current Liabilities and all columns with value "<r3c1>" "<r3c2>" "<r3c3>" "<r3c4>"in AONABF
    And   I enter in row Creditor greater than one year and all columns with value "<r4c1>" "<r4c2>" "<r4c3>" "<r4c4>"in AONABF
    And   I enter in row Provisions and all columns with value "<r5c1>" "<r5c2>" "<r5c3>" "<r5c4>"in AONABF
    And   I enter in row Pension scheme liabilities and all columns with value "<r6c1>" "<r6c2>" "<r6c3>" "<r6c4>"in AONABF
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | r1c1 | r1c2 | r1c3 | r1c4 | r2c1 | r2c2 | r2c3 | r2c4 | r3c1 | r3c2 | r3c3 | r3c4 | r4c1 | r4c2 | r4c3 | r4c4 | r5c1 | r5c2 | r5c3 | r5c4 | r6c1 | r6c2 | r6c3 | r6c4 | error |

#    data to be provided

  Scenario Outline:Testing the Analysis of Net Assets Between Funds in Balance Sheet Funds and Other Disclosure with Invalid Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I have navigated to Analysis of Net Assets Between Funds page

    And   I enter in row Fixed Assets and all columns with value "<r1c1>" "<r1c2>" "<r1c3>" "<r1c4>" in AONABF
    And   I enter in row Current Assets and all columns with value "<r2c1>" "<r2c2>" "<r2c3>" "<r2c4>"in AONABF
    And   I enter in row Current Liabilities and all columns with value "<r3c1>" "<r3c2>" "<r3c3>" "<r3c4>"in AONABF
    And   I enter in row Creditor greater than one year and all columns with value "<r4c1>" "<r4c2>" "<r4c3>" "<r4c4>"in AONABF
    And   I enter in row Provisions and all columns with value "<r5c1>" "<r5c2>" "<r5c3>" "<r5c4>"in AONABF
    And   I enter in row Pension scheme liabilities and all columns with value "<r6c1>" "<r6c2>" "<r6c3>" "<r6c4>"in AONABF
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | r1c1 | r1c2 | r1c3 | r1c4 | r2c1 | r2c2 | r2c3 | r2c4 | r3c1 | r3c2 | r3c3 | r3c4 | r4c1 | r4c2 | r4c3 | r4c4 | r5c1 | r5c2 | r5c3 | r5c4 | r6c1 | r6c2 | r6c3 | r6c4 | error |
#     data to be provided
