Feature: search and place the order for product

@Offers
Scenario Outline: Search Experiance for product search in both home and offers page

Given user is on Greencart Landing page
When user search with Shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offers page to check 
And if product equal with both pages

Examples:
| Name |
| Tom	|
| Pot |
