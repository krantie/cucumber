Feature: application login


Background:
When Launch the Chrome Browser
And Open Axis Bank application Homepage


@RegressionTest @NetBanking
Scenario: admin page default login

Given user is on netbanking login page
When user login into application with "admincredt" and password is "12345"
Then user need to be enter in homepage
And user need to see logo of the page

@SmokeTest @Mortgage
Scenario: Employee page default login

Given user is on netbanking login page
When user login into application with employecredit and password is "66666"
Then user need to be enter in homepage
And user need to see logo of the page


