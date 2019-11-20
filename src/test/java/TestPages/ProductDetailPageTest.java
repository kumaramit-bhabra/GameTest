package TestPages;

import Base.TestBase;
import Pages.ProductDetailPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductDetailPageTest extends TestBase
{
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Then("title of the product listing page should have selected product description")
    public void isWindowTitleDisplayedTest()
    {
    Assert.assertTrue("Window Title is not correct", productDetailPage.validateWindowTitle());
    }

    @And("selects one of the format")
    public void isFormatSelectable()
    {
        productDetailPage.validateFormatSelection();
    }

    @And("add the product to the shopping bag")
    public void isCustAbleToAddProductByClkOnBuyBttn()
    {
        productDetailPage.validateAddProductByClkOnBuyBttn();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}
