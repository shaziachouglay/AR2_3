Feature: Testing the To A Related Party Page

  Scenario Outline: testing the To a related party page with valid data
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Related Party Transactions section in BSFAOD
    When   I select from dropdown "<ddValue>" in BSFAOD
    And    I enter value in instance "<instance>" and column Number of related parties with "<v1>" and column Value with "<v2>" in BSFAOD
    And    I click on the Add New Instance
    Then   I see the row Total for column Number of related parties is "<t1>" and column Value is "<t2>"
    And    I click on the next
    Examples:
      | ddValue | instance | v1 | v2 | t1 | t2 |
#     data to be provided.



  Scenario Outline: testing the To a related party page with invalid data
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Related Party Transactions section in BSFAOD
    When   I select from dropdown "<ddValue>" in BSFAOD
    And    I enter value in instance "<instance>" and column Number of related parties with "<v1>" and column Value with "<v2>" in BSFAOD
    And    I click on the Add New Instance
    Then   I see the row Total for column Number of related parties is NOT "<t1>" and column Value is NOT "<t2>"
    And    I click on the next
    Examples:
      | ddValue | instance | v1 | v2 | t1 | t2 |
#     data to be provided.


  Scenario Outline: testing the To a related party page with All Financial Data Error
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Related Party Transactions section in BSFAOD
    When   I select from dropdown "<ddValue>" in BSFAOD
    And    I enter value in instance "<instance>" and column Number of related parties with "<v1>" and column Value with "<v2>" in BSFAOD
    And    I click on the Add New Instance
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"
    And    I click on the next
    Examples:
      | ddValue | instance | v1 | v2 | error|
#     data to be provided.

  Scenario Outline: testing the To a related party page with Invalid Data  Error
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Related Party Transactions section in BSFAOD
    When   I select from dropdown "<ddValue>" in BSFAOD
    And    I enter value in instance "<instance>" and column Number of related parties with "<v1>" and column Value with "<v2>" in BSFAOD
    And    I click on the Add New Instance
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"
    And    I click on the next
    Examples:
      | ddValue | instance | v1 | v2 | error|
#     data to be provided.



