@Search
  Feature: Find

#    Scenario Outline: Do some Search Tests
#      Examples:
#        |input      | output    |
#        | Jolly LLB | Jolly LLB |

    Scenario: Find Search
        Given I am on new application
        When I search with searchKey 1
        Then I should see the search result
