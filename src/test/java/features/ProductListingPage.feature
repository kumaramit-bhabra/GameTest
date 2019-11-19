Feature: This is to test the search Results being displayed after the user performs the search

  Background:
    Given the user is on the landing page
    And search for the product by entering the text
    And press search button

  Scenario: Validate the search Results that are being displayed after the search is being performed
    Then search result window should be displayed
    And should display the search results related to keyword search

  Scenario: Validate from the search Result window user is able to view the product by clicking on the image
    And selects one of the product from product listing page by clicking on the image