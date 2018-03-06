Feature: testing the Sensitivity Analysis Page in Pensions Section


  Scenario Outline:testing the Sensitivity Analysis Page in Pensions Section with Valid Data
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Sensitivity Analysis page
    And    I enter value in row Discount rate positive point one percent and column Aggregate Value with "<v1>"
    And    I enter value in row Discount rate negative point one percent and column Aggregate Value with "<v2>"
    And    I enter value in row Mortality Rate one year increase and column Aggregate Value with "<v3>"
    And    I enter value in row Mortality Rate one year decreased and column Aggregate Value with "<v4>"
    And    I enter value in row CPI rate positive point one percent and column Aggregate Value with "<v5>"
    And    I enter value in row CPI rate negative point one percent and column Aggregate Value with "<v6>"
    And    I click on the next

    Examples:
      | v1 | v2 | v3 | v4 | v5 | v6 |
#     data to be provided.


  Scenario Outline:testing the Sensitivity Analysis Page in Pensions Section with Errors All Financial Data
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Sensitivity Analysis page
    And    I enter value in row Discount rate positive point one percent and column Aggregate Value with "<v1>"
    And    I enter value in row Discount rate negative point one percent and column Aggregate Value with "<v2>"
    And    I enter value in row Mortality Rate one year increase and column Aggregate Value with "<v3>"
    And    I enter value in row Mortality Rate one year decreased and column Aggregate Value with "<v4>"
    And    I enter value in row CPI rate positive point one percent and column Aggregate Value with "<v5>"
    And    I enter value in row CPI rate negative point one percent and column Aggregate Value with "<v6>"
    Then   I see the number of errors starting with  All financial data must be entered are "<error>"

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v6      | error |
      | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 9999999 | 6     |




  Scenario Outline:testing the Sensitivity Analysis Page in Pensions Section with Errors Invalid Data Format
    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to Pensions Sensitivity Analysis page
    And    I enter value in row Discount rate positive point one percent and column Aggregate Value with "<v1>"
    And    I enter value in row Discount rate negative point one percent and column Aggregate Value with "<v2>"
    And    I enter value in row Mortality Rate one year increase and column Aggregate Value with "<v3>"
    And    I enter value in row Mortality Rate one year decreased and column Aggregate Value with "<v4>"
    And    I enter value in row CPI rate positive point one percent and column Aggregate Value with "<v5>"
    And    I enter value in row CPI rate negative point one percent and column Aggregate Value with "<v6>"
    Then   I see the number of errors starting with  Invalid Number Format are "<error>"

    Examples:
      | v1      | v2      | v3      | v4      | v5      | v6      | error |
      | ******* | ******* | ******* | ******* | ******* | ******* | 6     |



