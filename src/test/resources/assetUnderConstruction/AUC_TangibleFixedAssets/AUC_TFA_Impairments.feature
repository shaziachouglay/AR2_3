Feature: Testing the AUC TFA Impairments Page

  Scenario Outline:Testing the AUC TFA Impairments Page with Valid Credentials

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Impairments page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>" Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column AUC with "<v1>"Impairments Page
    Then  I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is "<v2>"Impairments Page

    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column AUC with "<v1>"Impairments Page
    Then  I must see the row Adjustments made to opening balance and column Total is "<v2>"Impairments Page

    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column AUC with "<v1>"Impairments Page
    Then  I must see the row Charged in period and column Total is "<v2>"Impairments Page

    And   I enter value in row Released in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column AUC with "<v1>"Impairments Page
    Then  I must see the row Released in period and column Total is "<v2>"Impairments Page

    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column AUC with "<v1>"Impairments Page
    Then  I must see the row Transferred in on existing academies joining the trust and column Total is "<v2>"Impairments Page

    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column AUC with "<v1>"Impairments Page
    Then  I must see the row Transferred out on existing academies leaving the trust and column Total is "<v2>"Impairments Page

    Then   I see value in row Total closing balance and column Freehold Land and Building with "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Leasehold Land and Building with "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Leasehold Improvements with "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Plant and Machinery with "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Furniture and Equipment with "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Computer Equipment with "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column AUC with "<v3>"Impairments Page
    Then   I must see the row Total closing balance and column Total is "<v4>"Impairments Page
    Examples: VALID entries
      | v1 | v2 | v3 | v4 |
      |1   |7   |6   |42  |

  Scenario Outline:Testing the AUC TFA Impairments Page with INVALID Credentials

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Impairments page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>" Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column AUC with "<v1>"Impairments Page
    Then  I must see the row Original prior year closing balance as submitted in the Accounts Return and column Total is not "<v2>"Impairments Page

    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column AUC with "<v1>"Impairments Page
    Then  I must see the row Adjustments made to opening balance and column Total is not "<v2>"Impairments Page

    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column AUC with "<v1>"Impairments Page
    Then  I must see the row Charged in period and column Total is not "<v2>"Impairments Page

    And   I enter value in row Released in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column AUC with "<v1>"Impairments Page
    Then  I must see the row Released in period and column Total is not "<v2>"Impairments Page

    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column AUC with "<v1>"Impairments Page
    Then  I must see the row Transferred in on existing academies joining the trust and column Total is not "<v2>"Impairments Page

    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column AUC with "<v1>"Impairments Page
    Then  I must see the row Transferred out on existing academies leaving the trust and column Total is not "<v2>"Impairments Page

    Then   I see value in row Total closing balance and column Freehold Land and Building is NOT  "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Leasehold Land and Building is NOT  "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Leasehold Improvements is NOT  "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Plant and Machinery is NOT  "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Furniture and Equipment is NOT  "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column Computer Equipment is NOT  "<v3>"Impairments Page
    Then   I see value in row Total closing balance and column AUC is NOT  "<v3>"Impairments Page
    Then   I must see the row Total closing balance and column Total is NOT "<v4>"Impairments Page
    Examples: INVALID entries
      | v1 | v2 | v3 | v4 |
      |1   |5   |5   |40  |


  Scenario Outline:Testing the AUC TFA Impairments Page with Errors All Financial Data

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Impairments page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>" Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column AUC with "<v1>"Impairments Page


    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column AUC with "<v1>"Impairments Page


    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column AUC with "<v1>"Impairments Page


    And   I enter value in row Released in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column AUC with "<v1>"Impairments Page


    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column AUC with "<v1>"Impairments Page


    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column AUC with "<v1>"Impairments Page

    Then  I see the number of errors starting with  All financial data must be entered are "<errors>"
    Examples: Errors All Financial Data
      | v1      | errors |
      | 9999999 | 42     |


  Scenario Outline:Testing the AUC TFA Impairments Page with Errors All Financial Data

    Given I am on Asset Under Construction
    When  I navigate to Asset Under Construction Tangible Fixed Assets Impairments page

    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Freehold Land and Building with "<v1>" Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Original prior year closing balance as submitted in the Accounts Return  and column AUC with "<v1>"Impairments Page


    And   I enter value in row Adjustments made to opening balance and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Adjustments made to opening balance and column AUC with "<v1>"Impairments Page


    And   I enter value in row Charged in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Charged in period and column AUC with "<v1>"Impairments Page


    And   I enter value in row Released in period and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Released in period and column AUC with "<v1>"Impairments Page


    And   I enter value in row Transferred in on existing academies joining the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred in on existing academies joining the trust and column AUC with "<v1>"Impairments Page


    And   I enter value in row Transferred out on existing academies leaving the trust and column Freehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Land and Building with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Leasehold Improvements with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Plant and Machinery with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Furniture and Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column Computer Equipment with "<v1>"Impairments Page
    And   I enter value in row Transferred out on existing academies leaving the trust and column AUC with "<v1>"Impairments Page

    Then  I see the number of errors starting with  Invalid Number Format are "<errors>"
    Examples: Errors Invalid Data Format
      | v1      | errors |
      | ******* | 42     |
