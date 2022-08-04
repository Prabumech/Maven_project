Feature: Hotel booking application

@smoke
Scenario Outline: login page in adactin application
Given user launch adactin application
When user enter "<username>" in username field
And user enter "<password>" in password field
Then user clicks login button

Examples:
|username   |password|
|prabu      |123|
|mech       |123|
|prabumech  |Prabu123|

@sanity
Scenario: Search hotels page in adactin application
When user selects the location of city
And user selects the hotel name
And user selects the room type
And user selects number of rooms needed
And user enters check in date
And user enters check out date
And user selects number of adults per room
And user selects number of childrens per room
Then user clicks submit button

@slash
Scenario: Select hotel page in adactin application 
When user selects the hotel 
Then user clicks continue button

@sync
Scenario: Book hotel page in adactine application
When user enter the first name 
And user enter the last name 
And User enter the billing address
And user enter credit card number
And user selects card type
And user enters expiry month of the card
And user enters expiry year of the card
And user enters CVV number of the card
Then user clicks Book now button

@shift
Scenario: Logout page in adactin application
Then user clicks logout button

