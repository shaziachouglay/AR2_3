@fullAndFinal
Feature: testing the Other Income - Transfers SoFA Disclosures page

  @sanity
  Scenario Outline: Testing the Other Income - Transfers SoFA Disclosures page  with valid credentials

    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    When  I enter value in field with fieldset Transferred in existing academies joining trust with "<v1>"
    And   I click on on the save and next button in Transfer SoFA Disclosure page

    Examples:
      | v1      |
      | 1       |
      | 10      |
      | 100     |
      | 500     |
      | 1000    |
      | 10000   |
      | 999999  |
      | 999998  |
      | -1      |
      | -10     |
      | -100    |
      | -500    |
      | -1000   |
      | -10000  |
      | -999999 |
      | -999998 |
  @sanity
  Scenario Outline: Testing the Other Income - Transfers SoFA Disclosures page : Errors ; All Financial Data Range

    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    When  I enter value in field with fieldset Transferred in existing academies joining trust with "<v1>"
    And   I click on on the save and next button in Transfer SoFA Disclosure page

    Examples:
      | v1         |
      | 99999999   |
      | 100000000  |
      | -999999999 |
      | -10000000  |

  @sanity
  Scenario Outline: Testing the Other Income - Transfers SoFA Disclosures page  Errors:

    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    When  I enter value in field with fieldset Transferred in existing academies joining trust with "<v1>"
    And   I click on on the save and next button in Transfer SoFA Disclosure page

    Examples:
      | v1        |
      | test      |
      | @test     |
      | sampe&&   |
      | -12samole |

#-------------

  @smoke
  Scenario Outline: Testing the Other Income - Transfers SoFA Disclosures page  with valid credentials

    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    When  I enter value in field with fieldset Transferred in existing academies joining trust with "<v1>"
    And   I click on on the save and next button in Transfer SoFA Disclosure page
    Examples:
      | v1      |
      | -999998 |

  @smoke
  Scenario Outline: Testing the Other Income - Transfers SoFA Disclosures page : Errors ; All Financial Data Range

    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    When  I enter value in field with fieldset Transferred in existing academies joining trust with "<v1>"
    And   I click on on the save and next button in Transfer SoFA Disclosure page

    Examples:
      | v1         |
      | 99999999   |

  @smoke
  Scenario Outline: Testing the Other Income - Transfers SoFA Disclosures page  Errors:

    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    When  I enter value in field with fieldset Transferred in existing academies joining trust with "<v1>"
    And   I click on on the save and next button in Transfer SoFA Disclosure page

    Examples:
      | v1        |
      | test      |


  @sofa_references
  Scenario: Testing the Other Income - Transfers SoFA Disclosures page  Errors:
    Given I am on SoFA section
    When  I navigate to the Transfers SoFA Disclosures
    Then I see the correct references are displayed for "s_oi_TransfersSoFADisclosre" page of type "Table"
