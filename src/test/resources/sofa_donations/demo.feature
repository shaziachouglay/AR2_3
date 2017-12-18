@runDemo
Feature: Testing a demo sample

  Scenario Outline: Checking Donations Page with Valid Credentials
    Given I am in Pre Production Environment as Test User
    Given I am on SoFA section
    When I navigate to Donations section
    Then I enter value in Donated Fixed Assets with "<Donated Fixed Assets>"
    Examples:
      | Donated Fixed Assets |
      | 1                    |
      | 2                    |