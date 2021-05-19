Feature: Test login

	#Test login
	@TEST_WOO-2
	Scenario: Test login
		Given that i am on the shopping website
		When i add an item to the basket
		Then i can view the item in my basket
