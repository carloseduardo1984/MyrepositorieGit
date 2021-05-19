$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WOO-2.feature");
formatter.feature({
  "line": 1,
  "name": "Test login",
  "description": "",
  "id": "test-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Test login"
    }
  ],
  "line": 5,
  "name": "Test login",
  "description": "",
  "id": "test-login;test-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TEST_WOO-2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that i am on the shopping website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i add an item to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "i can view the item in my basket",
  "keyword": "Then "
});
formatter.match({
  "location": "TC1.that_i_am_on_the_shopping_website()"
});
formatter.result({
  "duration": 6062577800,
  "status": "passed"
});
formatter.match({
  "location": "TC1.i_add_an_item_to_the_basket()"
});
formatter.result({
  "duration": 2234306100,
  "status": "passed"
});
formatter.match({
  "location": "TC1.i_can_view_the_item_in_my_basket()"
});
formatter.result({
  "duration": 159420400,
  "status": "passed"
});
});