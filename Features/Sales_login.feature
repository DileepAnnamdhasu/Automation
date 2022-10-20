Feature: saleIntel login Feature

Scenario: SalesIntel Login with invalid usrName and pwd Test Scenario

Given User already Login Page
When title1 of login is SalesIntel
Then User enters invalid userName
Then User enters invalid password
Then User checks Remember me
Then user clicks on Login1 button
Then user is on home1 page


Scenario: SalesIntel Login Test Scenario

Given User already Login Page
When title of login is SalesIntel
Then User enters valid userName
Then User enters password
Then User checks Remember me1
Then user clicks on Login button
Then user is on home page


Scenario: SalesIntel forgot password

Given User already Login2 Page
When title2 of login is SalesIntel
Then User clicks on forgot password
Then User enters email 
Then User clicks on Reset password


Scenario: SalesIntel forgot password

Given User already Login3 Page
When title4 of login is SalesIntel
Then User clicks on FAQ
Then verify title SalesIntel Support Center
Then clicks the page links  