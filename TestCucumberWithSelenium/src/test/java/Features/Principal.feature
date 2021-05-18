@run
Feature: TC1
  #shopping basket features

  Scenario: add to basket
    Given that i am on the shopping website
    When i add an item to the basket
    Then i can view the item in my basket

