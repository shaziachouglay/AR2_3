Feature: testing the AUC Capital Grnats Page


  Scenario Outline: testing with VALID entries

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