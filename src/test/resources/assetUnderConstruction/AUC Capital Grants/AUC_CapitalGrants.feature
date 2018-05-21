Feature: testing the AUC Capital Grants Page

  @smoke @aucCapitalGrants
  Scenario Outline: testing the AUC Capital Grants Page VALID entries

    Given I am on Asset Under Construction
    And   I have navigated to the Capital Grants Section for AUC
    And   I enter in field Condition Improvement Fund with "<v1>" in AUC
    And   I enter in field MAT School Condition Allowance with "<v1>" in AUC
    And   I enter in field Priority School Building Programme  with "<v1>" in AUC
    And   I enter in field Devolved Formula Capital Grant with "<v1>" in AUC
    And   I enter in field Centrally Managed Programme Free Schools with "<v1>" in AUC
    And   I enter in field Continuing Commitments Building Schools for the Future with "<v1>" in AUC
    And   I enter in field Schools Sponsorship Development Fund with "<v1>" in AUC
    And   I enter in field Other with "<v1>" in AUC
    And   I enter in field Local Authority Capital Grants with "<v1>" in AUC
    And   I enter in field Other Government Capital Grants  with "<v1>" in AUC
    And   I enter in field Non-Government Capital Grants with "<v1>" in AUC
    And   I must see  field Total with "<v2>" in AUC
    Examples:
      | v1 | v2 |
      |1   |11  |

  @smoke @aucCapitalGrants
  Scenario Outline: testing the AUC Capital Grants Page INVALID entries

    Given I am on Asset Under Construction
    And   I have navigated to the Capital Grants Section for AUC
    And   I enter in field Condition Improvement Fund with "<v1>" in AUC
    And   I enter in field MAT School Condition Allowance with "<v1>" in AUC
    And   I enter in field Priority School Building Programme  with "<v1>" in AUC
    And   I enter in field Devolved Formula Capital Grant with "<v1>" in AUC
    And   I enter in field Centrally Managed Programme Free Schools with "<v1>" in AUC
    And   I enter in field Continuing Commitments Building Schools for the Future with "<v1>" in AUC
    And   I enter in field Schools Sponsorship Development Fund with "<v1>" in AUC
    And   I enter in field Other with "<v1>" in AUC
    And   I enter in field Local Authority Capital Grants with "<v1>" in AUC
    And   I enter in field Other Government Capital Grants  with "<v1>" in AUC
    And   I enter in field Non-Government Capital Grants with "<v1>" in AUC
    And   I must see  field Total is NOT "<v2>" in AUC
    Examples:
      | v1 | v2 |
      |1   |12  |

  @smok
  Scenario Outline: testing the AUC Capital Grants Page All Financial Data Range Error

    Given I am on Asset Under Construction
    And   I have navigated to the Capital Grants Section for AUC
    And   I enter in field Condition Improvement Fund with "<v1>" in AUC
    And   I enter in field MAT School Condition Allowance with "<v1>" in AUC
    And   I enter in field Priority School Building Programme  with "<v1>" in AUC
    And   I enter in field Devolved Formula Capital Grant with "<v1>" in AUC
    And   I enter in field Centrally Managed Programme Free Schools with "<v1>" in AUC
    And   I enter in field Continuing Commitments Building Schools for the Future with "<v1>" in AUC
    And   I enter in field Schools Sponsorship Development Fund with "<v1>" in AUC
    And   I enter in field Other with "<v1>" in AUC
    And   I enter in field Local Authority Capital Grants with "<v1>" in AUC
    And   I enter in field Other Government Capital Grants  with "<v1>" in AUC
    And   I enter in field Non-Government Capital Grants with "<v1>" in AUC
    And   I wait for page to load
    Then  I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:
      | v1       | error |
      |9999999   |11     |

  @smoke @aucCapitalGrants
  Scenario Outline: testing the AUC Capital Grants Page Invalid Number Format Error

    Given I am on Asset Under Construction
    And   I have navigated to the Capital Grants Section for AUC
    And   I enter in field Condition Improvement Fund with "<v1>" in AUC
    And   I enter in field MAT School Condition Allowance with "<v1>" in AUC
    And   I enter in field Priority School Building Programme  with "<v1>" in AUC
    And   I enter in field Devolved Formula Capital Grant with "<v1>" in AUC
    And   I enter in field Centrally Managed Programme Free Schools with "<v1>" in AUC
    And   I enter in field Continuing Commitments Building Schools for the Future with "<v1>" in AUC
    And   I enter in field Schools Sponsorship Development Fund with "<v1>" in AUC
    And   I enter in field Other with "<v1>" in AUC
    And   I enter in field Local Authority Capital Grants with "<v1>" in AUC
    And   I enter in field Other Government Capital Grants  with "<v1>" in AUC
    And   I enter in field Non-Government Capital Grants with "<v1>" in AUC
    Then  I see the number of errors starting with  Invalid Number Format are "<error>"
    Examples:
      | v1      | error |
      |******   |11     |



  @bsa_references
  Scenario: reference the AUC Capital Grants Page

    Given I am on Asset Under Construction
    And   I have navigated to the Capital Grants Section for AUC
    Then I see the correct references are displayed for "auc_CapitalGrants" page of type "Label"
