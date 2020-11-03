@web

Feature: Messenger page feature
  Background:
    Given I am on home page
  Scenario:Verify featurePage and get collection list
      When I verify that feature button is enabled at HomePage
    When I click feature button, new page opened
    And I take list of  feature blog and get size of them
    Then I get header and verify it


