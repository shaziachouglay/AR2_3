Feature: Testing BSA TFA Asset Financing page



  Scenario Outline: Testing BSA TFA Asset Financing page

    Given I am on Balance Sheet Asset Section
    And   I navigate to BSA Tangible Fixed Assets Asset Financing page

    And   I enter in row Owned and column Freehold Land and Buildings with "<v1>"
    And   I enter in row Owned and column Leasehold Improvement with "<v1>"
    And   I enter in row Owned and column Plant and Machinery with "<v1>"
    And   I enter in row Owned and column Furniture and Equipment with "<v1>"
    And   I enter in row Owned and column Computer Equipment with "<v1>"
    And   I enter in row Owned and column Motor Vehicles with "<v1>"
    And   I enter in row Owned and column Asset UNder Construcmtion with "<v1>"
    Then  I must see row Owned and column Total is "<v2>"


    And   I enter in row Finance leased and column Leasehold Land and Buildings with "<v1>"
    And   I enter in row Finance leased and column Leasehold Improvement with "<v1>"
    And   I enter in row Finance leased and column Plant and Machinery with "<v1>"
    And   I enter in row Finance leased and column Furniture and Equipment with "<v1>"
    And   I enter in row Finance leased and column Computer Equipment with "<v1>"
    And   I enter in row Finance leased and column Motor Vehicles with "<v1>"
    And   I enter in row Finance leased and column Asset UNder Construcmtion with "<v1>"
    Then  I must see row Finance leased and column Total is "<v3>"


    And   I enter in row Other and column Freehold Land and Buildings with "<v1>"
    And   I enter in row Other and column Leasehold Land and Buildings with "<v1>"
    Then  I must see row Other and column Total is "<v4>"

    And   I enter in row Onbalance sheet PFI contracts and column Freehold Land and Buildings with "<v1>"
    And   I enter in row Onbalance sheet PFI contracts  and column Leasehold Land and Buildings with "<v1>"
    And   I enter in row Onbalance sheet PFI contracts  and column Plant and Machinery with "<v1>"
    And   I enter in row Onbalance sheet PFI contracts  and column Furniture and Equipment with "<v1>"
    And   I enter in row Onbalance sheet PFI contracts  and column Computer Equipment with "<v1>"
    And   I enter in row Onbalance sheet PFI contracts  and column Motor Vehicles with "<v1>"
    And   I enter in row Onbalance sheet PFI contracts  and column Asset UNder Construcmtion with "<v1>"
    Then  I must see row Onbalance sheet PFI contracts  and column Total is "<v5>"

    Then  I must see the row Totals and Column is "<TC1>" "<TC2>"  "<TC3>" "<TC4>" "<TC5>" "<TC6>" "<TC7>" "<TC8>" "<TC9>"

    Examples:
      | v1 | v2 | v3 | v4 | v5 | TC1 | TC2 | TC3 | TC4 | TC5 | TC6 | TC7 | TC8 | TC9 |
      |1   |7   |7   |2   |7   |3    |3    |2    |3    |3    |3    |3    |3    |23   |


