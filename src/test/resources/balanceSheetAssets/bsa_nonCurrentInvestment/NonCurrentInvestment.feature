Feature: Testing the Current investments page in BSA TFA

  @test22
  Scenario Outline: Testing the Current investments page in BSA TFA
    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Non Non Current Investment page

    And   I enter in row Original prior year closing balance  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Original prior year closing balance  and column Total is "<c2>" in BSA TFA Current Investment

    And   I enter in row Adjustments made to opening balance  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Adjustments made to opening balance and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Additions  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Additions and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Transferred in on conversion local authority  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Transferred in on conversion local authority and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Transferred in on conversion elsewhere  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Transferred in on conversion elsewhere and column Total is "<c2>" in BSA TFA Current Investment

    And   I enter in row Transferred in on existing academies joining the trust  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Transferred in on existing academies joining the trust and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Transferred out on existing academies leaving the trust  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Transferred out on existing academies leaving the trust and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Disposals  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Disposals and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Impairments  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Impairments and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Reclassification from non current asset investments  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Reclassification from non current asset investments and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Reclassification to non current asset investments  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Reclassification to non current asset investments and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Reclassification within current asset investments  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Reclassification within current asset investments and column Total is "<c2>" in BSA TFA Current Investment


    And   I enter in row Period end fair value gain loss  and all Columns with "<c1>" in BSA TFA Current Investment
    Then  I must see the row Period end fair value gain loss and column Total is "<c22>" in BSA TFA Current Investment


    And   I must see row At close of period  and all Columns is "<c3>" and "<c4>" in BSA TFA Current Investment
    Then  I must see the row At close of period and column Total is "<c5>" in BSA TFA Current Investment
    Examples:
      | c1 | c2 | c22 | c3 | c4 | c5 |
      |1   |9   |5    |12  |13  |113 |




#Feature: Testing the Non Non Current Investment Page
#
#
#  Scenario Outline:Testing the Non Non Current Investment Page
#
#    Given I am on Balance Sheet Asset Section
#    And   I navigate to BSA Non Non Current Investment page
#
#    And   I enter in row Original prior year closing balance  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Original prior year closing balance  and column Total is "<c2>" in BSA  Non Current Investment
#
#    And   I enter in row Adjustments made to opening balance  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Adjustments made to opening balance and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Additions  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Additions and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Transferred in on conversion local authority  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Transferred in on conversion local authority and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Transferred in on conversion elsewhere  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Transferred in on conversion elsewhere and column Total is "<c2>" in BSA  Non Current Investment
#
#    And   I enter in row Transferred in on existing academies joining the trust  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Transferred in on existing academies joining the trust and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Transferred out on existing academies leaving the trust  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Transferred out on existing academies leaving the trust and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Disposals  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Disposals and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Impairments  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Impairments and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Reclassification from non Non Current asset investments  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Reclassification from non Non Current asset investments and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Reclassification to non Non Current asset investments  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Reclassification to non Non Current asset investments and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Reclassification within Non Current asset investments  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Reclassification within Non Current asset investments and column Total is "<c2>" in BSA  Non Current Investment
#
#
#    And   I enter in row Period end fair value gain loss  and all Columns with "<c1>" in BSA  Non Current Investment
#    Then  I must see the row Period end fair value gain loss and column Total is "<c2>" in BSA  Non Current Investment
#
#    And   I must see row At close of period  and all Columns is "<c3>" in BSA  Non Current Investment
#    Then  I must see the row At close of period and column Total is "<c4>" in BSA  Non Current Investment
#
#    Examples:
#      | c1 | c2 | c3 | c4 |
#      |1   |9   |8   |117 |

  @bsa_references
  Scenario: Reference Check for
    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Non Non Current Investment page
    Then I see the correct references are displayed for "bsa_nci" page of type "Table"
