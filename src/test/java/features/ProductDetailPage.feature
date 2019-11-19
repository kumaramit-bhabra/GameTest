Feature: This is to test the product detail feature page and functionality associated with it

  Background:
    Given the user is on the landing page
    And search for the product by entering the text
    And press search button
    Then search result window should be displayed
    And selects one of the product from product listing page by clicking on the image

    Scenario: Validate the title of the page
      Then title of the product listing page should have selected product description

    Scenario: User is able to add the product to the Shopping Bag by selecting the format
      And selects one of the format
      And add the product to the shopping bag

