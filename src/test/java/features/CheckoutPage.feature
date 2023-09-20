Feature: Search Product and place Order

  @Checkout
  Scenario Outline: Validate User Product search place Order
    Given user is on GreenKart landing page
    When user search with three letters <Name> and search results should be displayed for the matching product
    And Add "3" quantity of searched product to cart and proceed to checkout
    Then verify added product in checkout page
    And verify Promo code and Place order buttons are displayed


    Examples:
    |Name|
    |tom |

