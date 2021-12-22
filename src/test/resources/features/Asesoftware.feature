Feature: Pruebas de automatización Web
@tag
  Scenario Outline: Validate total values
    Given User join Product Store home screen
    And The user sees the index page correctly
    When The user Register a new user 
    And The user login with the new user
    And the user selects a category <category>
    And the user selects a product <product>
    And the user add to cart the product
    And the user press the place order button
    Then the user sees the same values

    Examples: 
      | category | product | 
      | "Laptops"  | "Dell i7 8gb"| 