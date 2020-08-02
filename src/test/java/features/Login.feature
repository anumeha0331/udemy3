Feature: Application Login

Scenario Outline: Positive login test
Given Initialize the browser with chrome
And click on the "http://facebook.com/" site
When user enters <username> and <password>
Then verify user is successfully login
And close browser

Examples:
|username                 |password|
|anumeha.0331@gmail.com   |1234    |
|test@gmail.com           |5678    | 