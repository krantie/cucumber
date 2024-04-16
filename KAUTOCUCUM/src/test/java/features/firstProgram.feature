Feature: application login


Background:
Given setup the Database connection first
When Launch the Chrome Browser
And Open Axis Bank application Homepage


@RegressionTest
Scenario: admin page default login

Given user is on netbanking login page
When user login into application with "admincredt" and password is "12345"
Then user need to be enter in homepage
And user need to see logo of the page

@SmokeTest
Scenario: Employee page default login

Given user is on netbanking login page
When user login into application with employecredit and password is "66666"
Then user need to be enter in homepage
And user need to see logo of the page


# this scenario is used for data parametarization or multiple data sets for single method

@SmokeTest @RegressionTest
Scenario Outline: Others and users page default login

Given user is on netbanking login page
When user login into application with <UNAME> and password is <PWRD>
Then user need to be enter in homepage
And user need to see logo of the page

Examples:
| UNAME| PWRD |
| kranthi| k123 |
| riddhu | R000 |


#  Data Driven scenario example , this will used for multiple data in single method,like form filling

@SmokeTest
Scenario: user signup page

Given user is on netbanking signup page
When user filling details for sign up
| Kranthi |
| Kumar |
| krantee.n@gmail.com |
| 99887746373|

Then user need to be enter in homepage
And user need to see logo of the page


