$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:LandingPage.feature");
formatter.feature({
  "name": "To test the Landing Page of Game.com and the functionality associated with it",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the operator is able to enter keyword for search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for the product by entering the text",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.searchByKeywordTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press search button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.clickSearchBttnTest()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:ProductDetailPage.feature");
formatter.feature({
  "name": "This is to test the product detail feature page and functionality associated with it",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for the product by entering the text",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.searchByKeywordTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press search button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.clickSearchBttnTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search result window should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductListingPageTest.isSearchResultWindowDisplayedTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects one of the product from product listing page by clicking on the image",
  "keyword": "And "
});
formatter.match({
  "location": "ProductListingPageTest.selectProductByImageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the title of the page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "title of the product listing page should have selected product description",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailPageTest.isWindowTitleDisplayedTest()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for the product by entering the text",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.searchByKeywordTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press search button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.clickSearchBttnTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search result window should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductListingPageTest.isSearchResultWindowDisplayedTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects one of the product from product listing page by clicking on the image",
  "keyword": "And "
});
formatter.match({
  "location": "ProductListingPageTest.selectProductByImageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is able to add the product to the Shopping Bag by selecting the format",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selects one of the format",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailPageTest.isFormatSelectable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add the product to the shopping bag",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailPageTest.isCustAbleToAddProductByClkOnBuyBttn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:ProductListingPage.feature");
formatter.feature({
  "name": "This is to test the search Results being displayed after the user performs the search",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for the product by entering the text",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.searchByKeywordTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press search button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.clickSearchBttnTest()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the search Results that are being displayed after the search is being performed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "search result window should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductListingPageTest.isSearchResultWindowDisplayedTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display the search results related to keyword search",
  "keyword": "And "
});
formatter.match({
  "location": "ProductListingPageTest.validateSearchResultsTest()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Search Results are not getting displayed\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat TestPages.ProductListingPageTest.validateSearchResultsTest(ProductListingPageTest.java:23)\r\n\tat ✽.should display the search results related to keyword search(file:ProductListingPage.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for the product by entering the text",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.searchByKeywordTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "press search button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.clickSearchBttnTest()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate from the search Result window user is able to view the product by clicking on the image",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selects one of the product from product listing page by clicking on the image",
  "keyword": "And "
});
formatter.match({
  "location": "ProductListingPageTest.selectProductByImageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});