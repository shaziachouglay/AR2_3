Feature: Testing the AUC Others Page


  @bsa_references
  Scenario: reference Testing the AUC Others

    Given I am on Asset Under Construction
    And   I have navigated to the Others Section for AUC
    Then I see the correct references are displayed for "auc_Debtors" page of type "Table"



  Scenario Outline: Testing the AUC Others with valid credentials

    Given I am on Asset Under Construction
    And   I have navigated to the Others Section for AUC

    And   I enter value in instance 1 column one with "<c1>" and column two with "<c2>"
    And   I click on add new instance
    Then  I see another insance is created
    And   I enter value in instance 2 column one with "<c1>" and column two with "<c2>"
    Then  I see the total is "<Total>"
    Examples:
      | c1 | c2                | Total |
      | 1  | Sample Text Here! | 2     |



    Scenario: Testing for Number of Instance Addition

      Given I am on Asset Under Construction
      And   I have navigated to the Others Section for AUC

      And   I add 10 instances
      And   I remove 10 instances
      Then  I see I am left with 1 instance
