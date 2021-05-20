@Search
  Feature: Search

    Scenario: Test Search
        Given I am on edgewordstraining application
        When I search with searchKey
        Then I should see the searchKey in search result



