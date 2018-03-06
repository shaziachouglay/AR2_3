Feature: Testing the Non Cancellable Contracts in Balance Sheet Funds and Other Disclosures

  Scenario Outline:Testing the Non Cancellable Contracts in Balance Sheet Funds and Other Disclosures with valid data
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to BSFOD Others Non Cancellable Contracts

    And   I enter in row Not later than one year and all columns with "<r1c1>" "<r1v2>" "<r1v3>" in NCC
    Then  I see value in row Not later than one year and column Total is "<r1t1>" in NCC

    And   I enter in row Later than one year but not later than five years and all columns with "<r2c1>" "<r2v2>" "<r2v3>"in NCC
    Then  I see value in row Later than one year but not later than five years and column Total is "<r2t1>"in NCC

    And   I enter in row Later than five years and all columns with "<r3c1>" "<r3v2>" "<r3v3>"in NCC
    Then  I see value in row Later than five years and column Total is "<r3t1>"in NCC

    Then  I see value in row Total and all columns are "<tc1>" "<tc2>" "<tc3>"in NCC
    Then  I see value in row total and column total is "<tc4>"in NCC

    And   I click on the next

    Examples:
      | r1c1 | r1v2 | r1v3 | r1t1 | r2c1 | r2v2 | r2v3 | r2t1 | r3c1 | r3v2 | r3v3 | r3t1 | tc1 | tc2 | tc3 | tc4 |
#      data to be provided

  Scenario Outline:Testing the Non Cancellable Contracts in Balance Sheet Funds and Other Disclosures with invalid data
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to BSFOD Others Non Cancellable Contracts

    And   I enter in row Not later than one year and all columns with "<r1c1>" "<r1v2>" "<r1v3>" in NCC
    Then  I see value in row Not later than one year and column Total is not "<r1t1>" in NCC

    And   I enter in row Later than one year but not later than five years and all columns with "<r2c1>" "<r2v2>" "<r2v3>"in NCC
    Then  I see value in row Later than one year but not later than five years and column Total is not "<r2t1>"in NCC

    And   I enter in row Later than five years and all columns with "<r3c1>" "<r3v2>" "<r3v3>"in NCC
    Then  I see value in row Later than five years and column Total is not "<r3t1>"in NCC

    Then  I see value in row Total and all columns are not "<tc1>" "<tc2>" "<tc3>"in NCC
    Then  I see value in row total and column total is not "<tc4>"in NCC

    Examples:
      | r1c1 | r1v2 | r1v3 | r1t1 | r2c1 | r2v2 | r2v3 | r2t1 | r3c1 | r3v2 | r3v3 | r3t1 | tc1 | tc2 | tc3 | tc4 |
#      data to be provided

  Scenario Outline:Testing the Non Cancellable Contracts in Balance Sheet Funds and Other Disclosures with All Financial Data Error
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to BSFOD Others Non Cancellable Contracts

    And   I enter in row Not later than one year and all columns with "<r1c1>" "<r1v2>" "<r1v3>" in NCC
    And   I enter in row Later than one year but not later than five years and all columns with "<r2c1>" "<r2v2>" "<r2v3>"in NCC
    And   I enter in row Later than five years and all columns with "<r3c1>" "<r3v2>" "<r3v3>"in NCC
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:
      | r1c1 | r1v2 | r1v3 | r2c1 | r2v2 | r2v3 | r3c1 | r3v2 | r3v3 | error |

#    data to be provided.


  Scenario Outline:Testing the Non Cancellable Contracts in Balance Sheet Funds and Other Disclosures with Invalid Data Error
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to BSFOD Others Non Cancellable Contracts

    And   I enter in row Not later than one year and all columns with "<r1c1>" "<r1v2>" "<r1v3>" in NCC
    And   I enter in row Later than one year but not later than five years and all columns with "<r2c1>" "<r2v2>" "<r2v3>"in NCC
    And   I enter in row Later than five years and all columns with "<r3c1>" "<r3v2>" "<r3v3>"in NCC
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | r1c1 | r1v2 | r1v3 | r2c1 | r2v2 | r2v3 | r3c1 | r3v2 | r3v3 | error |

#     data to be provided
