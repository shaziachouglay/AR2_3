Feature: Testing the Commitment  Under Finance Leases in Balance Sheet Funds and Other Disclosures



  Scenario Outline: Testing the Commitment  Under Finance Leases in Balance Sheet Funds and Other Disclosures with valid data
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment  Under Finance Leases page

#  Pre Discounted Values

    When  I enter in pre discounted row Within one year and all columns with "<v1>" "<v2>"
    Then  I must see value in pre discounted row Within one year and column Total is "<t1>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v3>" "<v4>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is "<t2>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v5>" "<v6>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is "<t3>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v7>" "<v8>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is "<t4>"

    Then  I must see pre discounted row Total and all columns with "<tt1>" "<tt2>" "<tt3>"

#  Discounted Values

    When  I enter in pre discounted row Within one year and all columns with "<dv1>" "<dv2>"
    Then  I must see value in pre discounted row Within one year and column Total is "<dt1>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv3>" "<dv4>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is "<dt2>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv5>" "<dv6>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is "<dt3>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv7>" "<dv8>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is "<dt4>"

    Then  I must see pre discounted row Total and all columns with "<dtt4>" "<dtt5>" "<dtt6>"

    Then  I click on the next
    Examples:
      | v1 | v2 | t1 | v3 | v4 | t2 | v5 | v6 | t3 | v7 | v8 | t4 | tt1 | tt2 | tt3 | dv1 | dv2 | dt1 | dv3 | dv4 | dt2 | dv5 | dv6 | dt3 | dv7 | dv8 | dt4 | dtt4 | dtt5 | dtt6 |
#     data to be provided


#  -------------------------------------------------------------------------------------------------------------------------------------------------
  Scenario Outline: Testing the Commitment  Under Finance Leases in Balance Sheet Funds and Other Disclosures with invalid data
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment  Under Finance Leases page

#  Pre Discounted Values

    When  I enter in pre discounted row Within one year and all columns with "<v1>" "<v2>"
    Then  I must see value in pre discounted row Within one year and column Total is NOT  "<t1>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v3>" "<v4>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is NOT "<t2>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v5>" "<v6>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is NOT "<t3>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v7>" "<v8>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is NOT "<t4>"

    Then  I must see pre discounted row Total and all columns are NOT "<tt1>" "<tt2>" "<tt3>"

#  Discounted Values

    When  I enter in pre discounted row Within one year and all columns with "<dv1>" "<dv2>"
    Then  I must see value in pre discounted row Within one year and column Total is NOT "<dt1>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv3>" "<dv4>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is NOT "<dt2>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv5>" "<dv6>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is NOT  "<dt3>"

    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv7>" "<dv8>"
    Then  I must see value in pre discounted row PLACEHOLDER and column Total is NOT  "<dt4>"

    Then  I must see pre discounted row Total and all columns are NOT "<dtt4>" "<dtt5>" "<dtt6>"

    Examples:
      | v1 | v2 | t1 | v3 | v4 | t2 | v5 | v6 | t3 | v7 | v8 | t4 | tt1 | tt2 | tt3 | dv1 | dv2 | dt1 | dv3 | dv4 | dt2 | dv5 | dv6 | dt3 | dv7 | dv8 | dt4 | dtt4 | dtt5 | dtt6 |
#     data to be provided


   Scenario Outline: Testing the Commitment  Under Finance Leases in Balance Sheet Funds and Other Disclosures for All Financial Data Error
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment  Under Finance Leases page

#  Pre Discounted Values
    When  I enter in pre discounted row Within one year and all columns with "<v1>" "<v2>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v3>" "<v4>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v5>" "<v6>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v7>" "<v8>"

#  Discounted Values
    When  I enter in pre discounted row Within one year and all columns with "<dv1>" "<dv2>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv3>" "<dv4>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv5>" "<dv6>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv7>" "<dv8>"

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
     Examples:
       | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | dv1 | dv2 | dv3 | dv4 | dv5 | dv6 | dv7 | dv8 | error |

#     data to be provided

  Scenario Outline: Testing the Commitment  Under Finance Leases in Balance Sheet Funds and Other Disclosures for Invalid Data Error
    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Commitment  Under Finance Leases page

  #  Pre Discounted Values
    When  I enter in pre discounted row Within one year and all columns with "<v1>" "<v2>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v3>" "<v4>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v5>" "<v6>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<v7>" "<v8>"

  #  Discounted Values
    When  I enter in pre discounted row Within one year and all columns with "<dv1>" "<dv2>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv3>" "<dv4>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv5>" "<dv6>"
    When  I enter in pre discounted row PLACEHOLDER and all columns with "<dv7>" "<dv8>"

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | dv1 | dv2 | dv3 | dv4 | dv5 | dv6 | dv7 | dv8 | error |

#     data to be provided

