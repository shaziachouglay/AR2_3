Feature: testing the AUC TFA Deprecation page


@auc_tfa_depreciation
  Scenario Outline: testing the AUC TFA Deprication page with VALID entries

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Depriciaton page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"
    Then  I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is "<v2>"

    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"
    Then  I must see the row Adjustments made to opening balance and column Total is "<v2>"

    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"
    Then  I must see the row Charged in period and column Total is "<v2>"

    And   I enter value in row Eliminated on disposal and column Freehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Improvements with "<v1>"
    And   I enter value in row Eliminated on disposal and column Plant and Machinery with "<v1>"
    And   I enter value in row Eliminated on disposal and column Furniture and Equipment with "<v1>"
    And   I enter value in row Eliminated on disposal and column Computer Equipment with "<v1>"
    Then  I must see the row Eliminated on disposal and column Total is "<v2>"

    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"
    Then  I must see the row Transferred in on existing academies joining the trust and column Total is "<v2>"

    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"
    Then  I must see the row Transferred out on existing academies leaving the trust and column Total is "<v2>"

    And   I enter value in row Revaluations and column Freehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Improvements with "<v1>"
    And   I enter value in row Revaluations and column Plant and Machinery with "<v1>"
    And   I enter value in row Revaluations and column Furniture and Equipment with "<v1>"
    And   I enter value in row Revaluations and column Computer Equipment with "<v1>"
    Then  I must see the row Revaluations and column Total is "<v2>"

    And   I enter value in row Reclassifications and column Freehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Improvements with "<v1>"
    And   I enter value in row Reclassifications and column Plant and Machinery with "<v1>"
    And   I enter value in row Reclassifications and column Furniture and Equipment with "<v1>"
    And   I enter value in row Reclassifications and column Computer Equipment with "<v1>"
    Then  I must see the row Reclassifications and column Total is "<v2>"

    Then   I see value in row Total closing balance and column Freehold Land and Building with "<v3>"
    Then   I see value in row Total closing balance and column Leasehold Land and Building with "<v3>"
    Then   I see value in row Total closing balance and column Leasehold Improvements with "<v3>"
    Then   I see value in row Total closing balance and column Plant and Machinery with "<v3>"
    Then   I see value in row Total closing balance and column Furniture and Equipment with "<v3>"
    Then   I see value in row Total closing balance and column Computer Equipment with "<v3>"
    Then   I must see the row Total closing balance and column Total is "<v4>"
    Examples: VALID entries
      | v1 | v2 | v3 | v4 |
      |1   |6   |8   |48  |




  Scenario Outline: testing the AUC TFA Deprication page with INVALID entries

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Depriciaton page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"
    Then  I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is not "<v2>"

    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"
    Then  I must see the row Adjustments made to opening balance and column Total is not"<v2>"

    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"
    Then  I must see the row Charged in period and column Total is not"<v2>"

    And   I enter value in row Eliminated on disposal and column Freehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Improvements with "<v1>"
    And   I enter value in row Eliminated on disposal and column Plant and Machinery with "<v1>"
    And   I enter value in row Eliminated on disposal and column Furniture and Equipment with "<v1>"
    And   I enter value in row Eliminated on disposal and column Computer Equipment with "<v1>"
    Then  I must see the row Eliminated on disposal and column Total is not"<v2>"

    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"
    Then  I must see the row Transferred in on existing academies joining the trust and column Total is not"<v2>"

    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"
    Then  I must see the row Transferred out on existing academies leaving the trust and column Total is not"<v2>"

    And   I enter value in row Revaluations and column Freehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Improvements with "<v1>"
    And   I enter value in row Revaluations and column Plant and Machinery with "<v1>"
    And   I enter value in row Revaluations and column Furniture and Equipment with "<v1>"
    And   I enter value in row Revaluations and column Computer Equipment with "<v1>"
    Then  I must see the row Revaluations and column Total is not"<v2>"

    And   I enter value in row Reclassifications and column Freehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Improvements with "<v1>"
    And   I enter value in row Reclassifications and column Plant and Machinery with "<v1>"
    And   I enter value in row Reclassifications and column Furniture and Equipment with "<v1>"
    And   I enter value in row Reclassifications and column Computer Equipment with "<v1>"
    Then  I must see the row Reclassifications and column Total is not"<v2>"

    Then   I see value in row Total closing balance and column Freehold Land and Building is not "<v3>"
    Then   I see value in row Total closing balance and column Leasehold Land and Building is not "<v3>"
    Then   I see value in row Total closing balance and column Leasehold Improvements is not "<v3>"
    Then   I see value in row Total closing balance and column Plant and Machinery is not "<v3>"
    Then   I see value in row Total closing balance and column Furniture and Equipment is not "<v3>"
    Then   I see value in row Total closing balance and column Computer Equipment is not "<v3>"
    Then   I must see the row Total closing balance and column Total is not"<v4>"

    Examples: INVALID entries
      | v1 | v2 | v3 | v4 |
      |1   |5   |7   |49  |



  Scenario Outline: testing the AUC TFA Deprication page for All Fnancial Data Error

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Depriciaton page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"


    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"


    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"


    And   I enter value in row Eliminated on disposal and column Freehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Improvements with "<v1>"
    And   I enter value in row Eliminated on disposal and column Plant and Machinery with "<v1>"
    And   I enter value in row Eliminated on disposal and column Furniture and Equipment with "<v1>"
    And   I enter value in row Eliminated on disposal and column Computer Equipment with "<v1>"


    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"


    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"


    And   I enter value in row Revaluations and column Freehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Improvements with "<v1>"
    And   I enter value in row Revaluations and column Plant and Machinery with "<v1>"
    And   I enter value in row Revaluations and column Furniture and Equipment with "<v1>"
    And   I enter value in row Revaluations and column Computer Equipment with "<v1>"


    And   I enter value in row Reclassifications and column Freehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Improvements with "<v1>"
    And   I enter value in row Reclassifications and column Plant and Machinery with "<v1>"
    And   I enter value in row Reclassifications and column Furniture and Equipment with "<v1>"
    And   I enter value in row Reclassifications and column Computer Equipment with "<v1>"
    Then  I see the number of errors starting with  All financial data must be entered are "<errro>"
    Examples: All Financial Data Error
      | v1    | errro |
      |9999999|48     |


  Scenario Outline: testing the AUC TFA Deprication page for Invalid Number Format

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Depriciaton page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"


    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"


    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"


    And   I enter value in row Eliminated on disposal and column Freehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Eliminated on disposal and column Leasehold Improvements with "<v1>"
    And   I enter value in row Eliminated on disposal and column Plant and Machinery with "<v1>"
    And   I enter value in row Eliminated on disposal and column Furniture and Equipment with "<v1>"
    And   I enter value in row Eliminated on disposal and column Computer Equipment with "<v1>"


    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"


    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"


    And   I enter value in row Revaluations and column Freehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Revaluations and column Leasehold Improvements with "<v1>"
    And   I enter value in row Revaluations and column Plant and Machinery with "<v1>"
    And   I enter value in row Revaluations and column Furniture and Equipment with "<v1>"
    And   I enter value in row Revaluations and column Computer Equipment with "<v1>"


    And   I enter value in row Reclassifications and column Freehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Land and Building with "<v1>"
    And   I enter value in row Reclassifications and column Leasehold Improvements with "<v1>"
    And   I enter value in row Reclassifications and column Plant and Machinery with "<v1>"
    And   I enter value in row Reclassifications and column Furniture and Equipment with "<v1>"
    And   I enter value in row Reclassifications and column Computer Equipment with "<v1>"
    Then  I see the number of errors starting with  Invalid Number Format are "<errro>"
    Examples: Invlaid Number format
      | v1    | errro |
      |*******|48  |