Feature: testing the pre production

  Scenario: login in to pre prod
    Given I am on the Department for Education Home Page
    And   I click on the Sign in or Create an account button
    And   I sign in with vali credentials
    And   I click on Accounts return tile
    And   I click on the continue button
    And   I see I have logged into the form

