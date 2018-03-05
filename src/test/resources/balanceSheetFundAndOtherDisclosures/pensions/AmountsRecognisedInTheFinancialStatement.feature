Feature: Testing the Amounts recognised in the Financial statement page in Pensions Section


  Scenario Outline: Testing the Amounts recognised in the financial statement page in Pensions Section with Valid Data

    Given  I am on Balance Sheet Funds and Other Disclosure Section
    When   I navigate to PensionsAmounts recognised in the financial statements
    Then   I must see the value in field Current Service Cost is "<v1>" in Pensions ARITFS
    Then   I must see the value in field Past Service Cost is "<v2>" in Pensions ARITFS
    Then   I must see the value in field Curtailment and settlement is "<v3>" in Pensions ARITFS
    Then   I must see the value in field Total operating charge is "<v4>" in Pensions ARITFS
    Examples:
      | v1 | v2 | v3 | v4 |
# Data to be provided.
