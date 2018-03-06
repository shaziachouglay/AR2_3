Feature: Testing the Losses and Special Payment in Balance Sheet Funds and Other Disclosure

  Scenario Outline:Testing the Losses and Special Payment in Balance Sheet Funds and Other Disclosure with valid data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Other Losses and Special Payments page

    And   I enter value for instance "<instance>" and all column Payment Detail with "<p1>" "<a1>" "<rd1>" "<pd1>" "<dd1>"in OLASP
    Then  I see the Total Amount is now "<total>" in OLASP
    And   I click on the next
    Examples:
      | instance | p1 | a1 | rd1 | pd1 | dd1 | total |
#     data to be provided

  Scenario Outline:Testing the Losses and Special Payment in Balance Sheet Funds and Other Disclosure with invalid data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Other Losses and Special Payments page

    And   I enter value for instance "<instance>" and all column Payment Detail with "<p1>" "<a1>" "<rd1>" "<pd1>" "<dd1>"in OLASP
    Then  I see the Total Amount is NOT  "<total>" in OLASP

    Examples:
      | instance | p1 | a1 | rd1 | pd1 | dd1 | total |
#     data to be provided


  Scenario Outline:Testing the Losses and Special Payment in Balance Sheet Funds and Other Disclosure with All Financial Data Error
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Other Losses and Special Payments page

    And   I enter value for instance "<instance>" and all column Payment Detail with "<p1>" "<a1>" "<rd1>" "<pd1>" "<dd1>"in OLASP
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:
      | instance | p1 | a1 | rd1 | pd1 | dd1 | error |

#     data to be provided


  Scenario Outline:Testing the Losses and Special Payment in Balance Sheet Funds and Other Disclosure with Invalid Data Error
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Other Losses and Special Payments page

    And   I enter value for instance "<instance>" and all column Payment Detail with "<p1>" "<a1>" "<rd1>" "<pd1>" "<dd1>"in OLASP
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | instance | p1 | a1 | rd1 | pd1 | dd1 | error |

#     data to be provided




