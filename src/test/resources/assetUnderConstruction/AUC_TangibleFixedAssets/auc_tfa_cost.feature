Feature: testing the AUC TFA Cost page

  Scenario Outline: testing the AUC TFA Cost page with VALID entries

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Cost page

    And   I enter in row Original prior year closing balance as submitted in the Accounts Return and all columns with "<v1>"
    Then  I see the value in row Original prior year closing balance as submitted in the Accounts Return and column Total is "<v2>"

    And   I enter in row Adjustments made to opening balance and all columns with "<v1>"
    Then  I see the value in row Adjustments made to opening balance and column Total is "<v2>"

    And   I enter in row Additions funded from Free Schools Priority Schools Building programme and all columns with "<v1>"
    Then  I see the value in row Additions funded from Free Schools Priority Schools Building programme and column Total is "<v2>"

    And   I enter in row Additions funded from other DFEESFA capital grant and all columns with "<v1>"
    Then  I see the value in row Additions funded from other DFEESFA capital grant and column Total is "<v2>"

    And   I enter in row Additions Others and all columns with "<v1>"
    Then  I see the value in row Additions Others and column Total is "<v2>"

    And   I enter in row Transferred in on conversion local authority and all columns with "<v1>"
    Then  I see the value in row Transferred in on conversion local authority and column Total is "<v2>"

    And   I enter in row Transferred in on conversion elsewhere and all columns with "<v1>"
    Then  I see the value in row Transferred in on conversion elsewhere and column Total is "<v2>"

    And   I enter in row Transferred in on existing academies joining the trust and all columns with "<v1>"
    Then  I see the value in row Transferred in on existing academies joining the trust and column Total is "<v2>"

    And   I enter in row Transferred out on existing academies leaving the trust and all columns with "<v1>"
    Then  I see the value in row Transferred out on existing academies leaving the trust and column Total is "<v2>"

    And   I enter in row Donations DFEESFA and all columns with "<v1>"
    Then  I see the value in row Donations DFEESFA and column Total is "<v2>"

    And   I enter in row Donations Non DFEESFA and all columns with "<v1>"
    Then  I see the value in row Donations Non DFEESFA and column Total is "<v2>"

    And   I enter in row Disposals and all columns with "<v1>"
    Then  I see the value in row Disposals and column Total is "<v2>"

    And   I enter in row Revaluations and all columns with "<v1>"
    Then  I see the value in row Revaluations and column Total is "<v2>"

    And   I enter in row Reclassifications and all columns with "<v1>"
    Then  I see the value in row Reclassifications and column Total is "<v2>"

    Then  I see in row Total closing balance and all columns with "<v3>"
    Then  I see the value in row Total closing balance and column Total is "<v4>"
    Examples:
      | v1 | v2 |v3|v4  |
      |1   |7   |14|98  |


  Scenario Outline: testing the AUC TFA Cost page with INVALID entries

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Cost page

    And   I enter in row Original prior year closing balance as submitted in the Accounts Return and all columns with "<v1>"
    Then  I see the value in row Original prior year closing balance as submitted in the Accounts Return and column Total is not "<v2>"

    And   I enter in row Adjustments made to opening balance and all columns with "<v1>"
    Then  I see the value in row Adjustments made to opening balance and column Total is not "<v2>"

    And   I enter in row Adjustments made to opening balance and all columns with "<v1>"
    Then  I see the value in row Adjustments made to opening balance and column Total is not "<v2>"

    And   I enter in row Additions funded from Free Schools Priority Schools Building programme and all columns with "<v1>"
    Then  I see the value in row Additions funded from Free Schools Priority Schools Building programme and column Total is not "<v2>"

    And   I enter in row Additions funded from other DFEESFA capital grant and all columns with "<v1>"
    Then  I see the value in row Additions funded from other DFEESFA capital grant and column Total is not "<v2>"

    And   I enter in row Additions Others and all columns with "<v1>"
    Then  I see the value in row Additions Others and column Total is not "<v2>"

    And   I enter in row Transferred in on conversion local authority and all columns with "<v1>"
    Then  I see the value in row Transferred in on conversion local authority and column Total is not "<v2>"

    And   I enter in row Transferred in on conversion elsewhere and all columns with "<v1>"
    Then  I see the value in row Transferred in on conversion elsewhere and column Total is not"<v2>"

    And   I enter in row Transferred in on existing academies joining the trust and all columns with "<v1>"
    Then  I see the value in row Transferred in on existing academies joining the trust and column Total is not"<v2>"

    And   I enter in row Transferred out on existing academies leaving the trust and all columns with "<v1>"
    Then  I see the value in row Transferred out on existing academies leaving the trust and column Total is not"<v2>"

    And   I enter in row Donations DFEESFA and all columns with "<v1>"
    Then  I see the value in row Donations DFEESFA and column Total is not"<v2>"

    And   I enter in row Donations Non DFEESFA and all columns with "<v1>"
    Then  I see the value in row Donations Non DFEESFA and column Total is not "<v2>"

    And   I enter in row Disposals and all columns with "<v1>"
    Then  I see the value in row Disposals and column Total is not"<v2>"

    And   I enter in row Revaluations and all columns with "<v1>"
    Then  I see the value in row Revaluations and column Total is not"<v2>"

    And   I enter in row Reclassifications and all columns with "<v1>"
    Then  I see the value in row Reclassifications and column Total is not"<v2>"

    Then  I see in row Total closing balance and all columns are not  "<v3>"
    Then  I see the value in row Total closing balance and column Total is not"<v4>"
    Examples:
      | v1 | v2 |v3|v4  |
      |1   |6   |13|109 |


  Scenario Outline: testing the AUC TFA Cost page for All Financial Data Error

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Cost page

    And   I enter in row Original prior year closing balance as submitted in the Accounts Return and all columns with "<v1>"

    And   I enter in row Adjustments made to opening balance and all columns with "<v1>"

    And   I enter in row Additions funded from Free Schools Priority Schools Building programme and all columns with "<v1>"

    And   I enter in row Additions funded from other DFEESFA capital grant and all columns with "<v1>"

    And   I enter in row Additions Others and all columns with "<v1>"

    And   I enter in row Transferred in on conversion local authority and all columns with "<v1>"

    And   I enter in row Transferred in on conversion elsewhere and all columns with "<v1>"

    And   I enter in row Transferred in on existing academies joining the trust and all columns with "<v1>"

    And   I enter in row Transferred out on existing academies leaving the trust and all columns with "<v1>"

    And   I enter in row Donations DFEESFA and all columns with "<v1>"

    And   I enter in row Donations Non DFEESFA and all columns with "<v1>"

    And   I enter in row Disposals and all columns with "<v1>"

    And   I enter in row Revaluations and all columns with "<v1>"

    And   I enter in row Reclassifications and all columns with "<v1>"

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1        |error|
      |9999999    |98   |

  Scenario Outline: testing the AUC TFA Cost page for All Financial Data Error

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Cost page

    And   I enter in row Original prior year closing balance as submitted in the Accounts Return and all columns with "<v1>"

    And   I enter in row Adjustments made to opening balance and all columns with "<v1>"

    And   I enter in row Additions funded from Free Schools Priority Schools Building programme and all columns with "<v1>"

    And   I enter in row Additions funded from other DFEESFA capital grant and all columns with "<v1>"

    And   I enter in row Additions Others and all columns with "<v1>"

    And   I enter in row Transferred in on conversion local authority and all columns with "<v1>"

    And   I enter in row Transferred in on conversion elsewhere and all columns with "<v1>"

    And   I enter in row Transferred in on existing academies joining the trust and all columns with "<v1>"

    And   I enter in row Transferred out on existing academies leaving the trust and all columns with "<v1>"

    And   I enter in row Donations DFEESFA and all columns with "<v1>"

    And   I enter in row Donations Non DFEESFA and all columns with "<v1>"

    And   I enter in row Disposals and all columns with "<v1>"

    And   I enter in row Revaluations and all columns with "<v1>"

    And   I enter in row Reclassifications and all columns with "<v1>"

    Then  I see the number of errors starting with  All financial data must be entered are "<error>"
    Examples:
      | v1        |error|
      |9999999    |98   |