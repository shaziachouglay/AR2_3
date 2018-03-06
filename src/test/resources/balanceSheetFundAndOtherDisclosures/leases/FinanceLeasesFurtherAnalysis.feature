Feature: Testing the Finance Leases Further Analysis in Balance Sheet Fund and Other Disclosures

  Scenario Outline:Testing the Finance Leases Further Analysis in Balance Sheet Fund and Other Disclosures with valid data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Finance Leases Further Analysis Page

#  Buildings

    And   I enter value in row Building Within one year and all columns with "<v1>" "<v2>" "<v3>"
    Then  I see value in row bldg Within one year and column total with "<t1>"

    And   I enter value in row Building Within two and five years inclusive  and all columns with "<v4>" "<v5>" "<v6>"
    Then  I see value in row bldg Within two and five years inclusive  and column total with "<t2>"

    And   I enter value in row Building Over five years and all columns with "<v7>" "<v8>" "<v9>"
    Then  I see value in row bldg Over five years and column total with "<t3>"

    And   I enter value in row Building PLACEHOLDER and all columns with "<v1>" "<v2>" "<v3>"
    Then  I see value in row bldg PLACEHOLDER and column total with "<t1>"


#  Other

    And   I enter value in row Other Within one year and all columns with "<ov1>" "<ov2>" "<ov3>"
    Then  I see value in row other Within one year and column total with "<ot1>"

    And   I enter value in row other Within two and five years inclusive  and all columns with "<ov4>" "<ov5>" "<ov6>"
    Then  I see value in row other Within two and five years inclusive  and column total with "<ot2>"

    And   I enter value in row other Over five years and all columns with "<ov7>" "<ov8>" "<ov9>"
    Then  I see value in row other Over five years and column total with "<ot3>"

    And   I click on the next
    Examples:
      | v1 | v2 | v3 | t1 | v4 | v5 | v6 | t2 | v7 | v8 | v9 | t3 | ov1 | ov2 | ov3 | ot1 | ov4 | ov5 | ov6 | ot2 | ov7 | ov8 | ov9 | ot3 |

#    Data  to be provided

   Scenario Outline:Testing the Finance Leases Further Analysis in Balance Sheet Fund and Other Disclosures with invalid data

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Finance Leases Further Analysis Page

#  Buildings

    And   I enter value in row Building Within one year and all columns with "<v1>" "<v2>" "<v3>"
    Then  I see value in row bldg Within one year and column total is not "<t1>"

    And   I enter value in row Building Within two and five years inclusive  and all columns with "<v4>" "<v5>" "<v6>"
    Then  I see value in row bldg Within two and five years inclusive  and column total is not "<t2>"

    And   I enter value in row Building Over five years and all columns with "<v7>" "<v8>" "<v9>"
    Then  I see value in row bldg Over five years and column total is not "<t3>"

    And   I enter value in row Building PLACEHOLDER and all columns with "<v1>" "<v2>" "<v3>"
    Then  I see value in row bldg PLACEHOLDER and column total is not "<t1>"

#  Other

    And   I enter value in row Other Within one year and all columns with "<ov1>" "<ov2>" "<ov3>"
    Then  I see value in row other Within one year and column total is not "<ot1>"

    And   I enter value in row other Within two and five years inclusive  and all columns with "<ov4>" "<ov5>" "<ov6>"
    Then  I see value in row other Within two and five years inclusive  and column total is not "<ot2>"

    And   I enter value in row other Over five years and all columns with "<ov7>" "<ov8>" "<ov9>"
    Then  I see value in row other Over five years and column total is not "<ot3>"
     Examples:
       | v1 | v2 | v3 | t1 | v4 | v5 | v6 | t2 | v7 | v8 | v9 | t3 | ov1 | ov2 | ov3 | ot1 | ov4 | ov5 | ov6 | ot2 | ov7 | ov8 | ov9 | ot3 |
#    Data  to be provided

   Scenario Outline:Testing the Finance Leases Further Analysis in Balance Sheet Fund and Other Disclosures for All Financial Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Finance Leases Further Analysis Page

#  Buildings

    And   I enter value in row Building Within one year and all columns with "<v1>" "<v2>" "<v3>"
    And   I enter value in row Building Within two and five years inclusive  and all columns with "<v4>" "<v5>" "<v6>"
    And   I enter value in row Building Over five years and all columns with "<v7>" "<v8>" "<v9>"
    And   I enter value in row Building PLACEHOLDER and all columns with "<v1>" "<v2>" "<v3>"
#  Other

    And   I enter value in row Other Within one year and all columns with "<ov1>" "<ov2>" "<ov3>"
    And   I enter value in row other Within two and five years inclusive  and all columns with "<ov4>" "<ov5>" "<ov6>"
    And   I enter value in row other Over five years and all columns with "<ov7>" "<ov8>" "<ov9>"

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
     Examples:
       | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | ov1 | ov2 | ov3 | ov4 | ov5 | ov6 | ov7 | ov8 | ov9 | error |
#     data to be provided

  Scenario Outline:Testing the Finance Leases Further Analysis in Balance Sheet Fund and Other Disclosures for Invalid Data Error

    Given I am on Balance Sheet Funds and Other Disclosure Section
    And   I navigate to Leases Finance Leases Further Analysis Page

#  Buildings

    And   I enter value in row Building Within one year and all columns with "<v1>" "<v2>" "<v3>"
    And   I enter value in row Building Within two and five years inclusive  and all columns with "<v4>" "<v5>" "<v6>"
    And   I enter value in row Building Over five years and all columns with "<v7>" "<v8>" "<v9>"
    And   I enter value in row Building PLACEHOLDER and all columns with "<v1>" "<v2>" "<v3>"
#  Other

    And   I enter value in row Other Within one year and all columns with "<ov1>" "<ov2>" "<ov3>"
    And   I enter value in row other Within two and five years inclusive  and all columns with "<ov4>" "<ov5>" "<ov6>"
    And   I enter value in row other Over five years and all columns with "<ov7>" "<ov8>" "<ov9>"

    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | ov1 | ov2 | ov3 | ov4 | ov5 | ov6 | ov7 | ov8 | ov9 | error |
#    data to be provided.


