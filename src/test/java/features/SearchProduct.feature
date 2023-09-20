Feature: Search Product and place Order

  @Search
  Scenario Outline: Validate User Product search  Experience
    Given user is on GreenKart landing page
    When user search with three letters <Name> and search results should be displayed for the matching product
    Then User search with three letters <Name> on top deals page same home page search results should be displayed
    And Validate both search product names

    Examples:
    |Name|
    |tom |
    |Beet|
