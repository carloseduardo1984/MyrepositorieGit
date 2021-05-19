@Search
  Feature: Search

#    Scenario Outline: Do some Search Tests
#      Examples:
#        |input      | output    |
#        | Jolly LLB | Jolly LLB |

    Scenario: Test Search
        Given I am on edgewordstraining application
        When I search with searchKey
        Then I should see the searchKey in search result

    Scenario: Re-Test Search
      Given I am on edgewordstraining application
      When I search with searchKey
      Then I should see the searchKey in search result
      And error

