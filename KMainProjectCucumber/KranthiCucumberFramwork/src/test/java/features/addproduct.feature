Feature: add and place the order for product

@PlaceOrder
Scenario Outline: Search Experiance for product search and add it in the cart

Given user is on Greencart Landing page
When user search with Shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then user proceeds to checkout and validate the <Name> in checkout page
And user has ability to enter promo code place the order

Examples:
| Name |
| Tom	|
