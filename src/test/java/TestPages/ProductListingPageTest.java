package TestPages;

import Base.TestBase;
import Pages.ProductListingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductListingPageTest extends TestBase
{
    ProductListingPage productListingPage = new ProductListingPage();

    @Then("search result window should be displayed")
    public void isSearchResultWindowDisplayedTest()
    {
        Assert.assertTrue("Search Result Window is not getting displayed",productListingPage.validateSearchResultWindowTitle());
    }

    @And("should display the search results related to keyword search")
    public void validateSearchResultsTest()
    {
        Assert.assertTrue("Search Results are not getting displayed",productListingPage.validateSearchResultWindow());
    }

    @And("selects one of the product from product listing page by clicking on the image")
    public void selectProductByImageTest()
    {
        Assert.assertTrue("Not able to select the product by image",productListingPage.validateSelectProductByImage());
    }
}
